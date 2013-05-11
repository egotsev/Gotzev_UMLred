/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.elsys.sequenceDiagram.util.SequenceDiagramAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceDiagramItemProviderAdapterFactory extends SequenceDiagramAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagramItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.Diagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramItemProvider diagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.Diagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramAdapter() {
		if (diagramItemProvider == null) {
			diagramItemProvider = new DiagramItemProvider(this);
		}

		return diagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.Lifeline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineItemProvider lifelineItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLifelineAdapter() {
		if (lifelineItemProvider == null) {
			lifelineItemProvider = new LifelineItemProvider(this);
		}

		return lifelineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.ActivationBar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationBarItemProvider activationBarItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.ActivationBar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivationBarAdapter() {
		if (activationBarItemProvider == null) {
			activationBarItemProvider = new ActivationBarItemProvider(this);
		}

		return activationBarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.ReturnConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnConnectionItemProvider returnConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.ReturnConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnConnectionAdapter() {
		if (returnConnectionItemProvider == null) {
			returnConnectionItemProvider = new ReturnConnectionItemProvider(this);
		}

		return returnConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.SendConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendConnectionItemProvider sendConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.SendConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSendConnectionAdapter() {
		if (sendConnectionItemProvider == null) {
			sendConnectionItemProvider = new SendConnectionItemProvider(this);
		}

		return sendConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.ParallelCombinedFragment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelCombinedFragmentItemProvider parallelCombinedFragmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.ParallelCombinedFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelCombinedFragmentAdapter() {
		if (parallelCombinedFragmentItemProvider == null) {
			parallelCombinedFragmentItemProvider = new ParallelCombinedFragmentItemProvider(this);
		}

		return parallelCombinedFragmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.BreakCombinedFragment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakCombinedFragmentItemProvider breakCombinedFragmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.BreakCombinedFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBreakCombinedFragmentAdapter() {
		if (breakCombinedFragmentItemProvider == null) {
			breakCombinedFragmentItemProvider = new BreakCombinedFragmentItemProvider(this);
		}

		return breakCombinedFragmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.LoopCombinedFragment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopCombinedFragmentItemProvider loopCombinedFragmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.LoopCombinedFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopCombinedFragmentAdapter() {
		if (loopCombinedFragmentItemProvider == null) {
			loopCombinedFragmentItemProvider = new LoopCombinedFragmentItemProvider(this);
		}

		return loopCombinedFragmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.OptionCombinedFragment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionCombinedFragmentItemProvider optionCombinedFragmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.OptionCombinedFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionCombinedFragmentAdapter() {
		if (optionCombinedFragmentItemProvider == null) {
			optionCombinedFragmentItemProvider = new OptionCombinedFragmentItemProvider(this);
		}

		return optionCombinedFragmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.AlternativeCombinedFragment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeCombinedFragmentItemProvider alternativeCombinedFragmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.AlternativeCombinedFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternativeCombinedFragmentAdapter() {
		if (alternativeCombinedFragmentItemProvider == null) {
			alternativeCombinedFragmentItemProvider = new AlternativeCombinedFragmentItemProvider(this);
		}

		return alternativeCombinedFragmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.Note} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteItemProvider noteItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNoteAdapter() {
		if (noteItemProvider == null) {
			noteItemProvider = new NoteItemProvider(this);
		}

		return noteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.elsys.sequenceDiagram.BendPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BendPointItemProvider bendPointItemProvider;

	/**
	 * This creates an adapter for a {@link org.elsys.sequenceDiagram.BendPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBendPointAdapter() {
		if (bendPointItemProvider == null) {
			bendPointItemProvider = new BendPointItemProvider(this);
		}

		return bendPointItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (diagramItemProvider != null) diagramItemProvider.dispose();
		if (lifelineItemProvider != null) lifelineItemProvider.dispose();
		if (activationBarItemProvider != null) activationBarItemProvider.dispose();
		if (returnConnectionItemProvider != null) returnConnectionItemProvider.dispose();
		if (sendConnectionItemProvider != null) sendConnectionItemProvider.dispose();
		if (parallelCombinedFragmentItemProvider != null) parallelCombinedFragmentItemProvider.dispose();
		if (alternativeCombinedFragmentItemProvider != null) alternativeCombinedFragmentItemProvider.dispose();
		if (breakCombinedFragmentItemProvider != null) breakCombinedFragmentItemProvider.dispose();
		if (loopCombinedFragmentItemProvider != null) loopCombinedFragmentItemProvider.dispose();
		if (optionCombinedFragmentItemProvider != null) optionCombinedFragmentItemProvider.dispose();
		if (noteItemProvider != null) noteItemProvider.dispose();
		if (bendPointItemProvider != null) bendPointItemProvider.dispose();
	}

}