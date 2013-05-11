package org.elsys.sequenceDiagram.gef;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.gef.actions.EditorActionBarContributor;
import org.elsys.sequenceDiagram.gef.dnd.SequenceDropTargetListener;
import org.elsys.sequenceDiagram.gef.editParts.SequenceEditPartFactory;
import org.elsys.sequenceDiagram.presentation.SequenceDiagramEditor;
import org.elsys.sequenceDiagram.presentation.SequenceDiagramEditorPlugin;
import org.elsys.sequenceDiagram.provider.SequenceDiagramItemProviderAdapterFactory;

public class SequenceGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	protected AdapterFactoryEditingDomain editingDomain;

	protected ComposedAdapterFactory adapterFactory;

	protected Collection<Resource> savedResources = new ArrayList<Resource>();

	public SequenceGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		PaletteRoot palette = new SequencePalette();
		return palette;
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new SequenceEditPartFactory());
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		getGraphicalViewer().setKeyHandler(new
				GraphicalViewerKeyHandler(getGraphicalViewer())
				.setParent(getCommonKeyHandler()));
		
	}

	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		initializeEditingDomain();
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setContents(getModel()); // set the contents of this editor
		getGraphicalViewer().addDropTargetListener(
				new SequenceDropTargetListener(getGraphicalViewer()));
	}

	private KeyHandler sharedKeyHandler;
	
	protected KeyHandler getCommonKeyHandler() {
		if (sharedKeyHandler == null) {
			sharedKeyHandler = new KeyHandler();
			sharedKeyHandler
					.put(KeyStroke.getPressed(SWT.DEL, 127, 0),
							getActionRegistry().getAction(
									ActionFactory.DELETE.getId()));
		}
		return sharedKeyHandler;
	}

	private Diagram getModel() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					true);
		} catch (Exception e) {
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}
		return (Diagram) resource.getContents().get(0);
	}

	private void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new SequenceDiagramItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, new HashMap<Resource, Boolean>());
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			
			@Override
			public void execute(IProgressMonitor monitor) {
				
				boolean first = true;
				for (Resource resource : editingDomain.getResourceSet()
						.getResources()) {
					if ((first || !resource.getContents().isEmpty() || isPersisted(resource))
							&& !editingDomain.isReadOnly(resource)) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save(saveOptions);
							if (resource.getTimeStamp() != timeStamp) {
								savedResources.add(resource);
							}
						} catch (Exception exception) {

						}
						first = false;
					}
				}

			}
		};

		try {
			
			new ProgressMonitorDialog(getSite().getShell()).run(true, false,
					operation);

			((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
			getCommandStack().markSaveLocation();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			
		}
	}

	public void commandStackChanged(EventObject event) {
		firePropertyChange(IEditorPart.PROP_DIRTY);
		super.commandStackChanged(event);
	}

	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet()
					.getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		} catch (IOException e) {

		}
		return result;
	}

}
