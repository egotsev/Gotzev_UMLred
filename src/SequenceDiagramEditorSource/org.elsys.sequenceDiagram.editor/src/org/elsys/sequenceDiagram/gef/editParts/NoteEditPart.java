package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeEvent;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.AbstractDiagramElement;
import org.elsys.sequenceDiagram.Note;
import org.elsys.sequenceDiagram.gef.figures.NoteFigure;
import org.elsys.sequenceDiagram.gef.policies.ComponentPolicy;
import org.elsys.sequenceDiagram.impl.AbstractElementImpl;
import org.elsys.sequenceDiagram.impl.NoteImpl;
import org.elsys.sequenceDiagram.provider.NoteItemProvider;
import org.elsys.sequenceDiagram.provider.SequenceDiagramItemProviderAdapterFactory;

public class NoteEditPart extends AbstractDiagramElementEditPart {

	@Override
	protected IFigure createFigure() {
		Note note = getCastedModel();
		Rectangle bounds = new Rectangle(note.getX(), note.getY(),
				note.getWidth(), note.getHeight());
		NoteFigure f = new NoteFigure(bounds, note.getName(), note.getText());
		return f;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		if (NoteImpl.LOC.equals(prop) || NoteImpl.SIZE.equals(prop)
				|| NoteImpl.TEXT.equals(prop) || NoteImpl.NAME.equals(prop)) {
			refreshVisuals();
		}
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentPolicy());
	}

	protected void refreshVisuals() {
		Rectangle bounds = new Rectangle(getCastedModel().getX(),
				getCastedModel().getY(), getCastedModel().getWidth(),
				getCastedModel().getHeight());
		getNoteFigure().setName(getCastedModel().getName());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getFigure(), bounds);
		getNoteFigure().setBounds(bounds);
		getNoteFigure().setFlowPageConstraint();
		getNoteFigure().setText(getCastedModel().getText());
	}

	private NoteFigure getNoteFigure() {
		return (NoteFigure) getFigure();
	}

	private Note getCastedModel() {
		return (Note) getModel();
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] {
				new TextPropertyDescriptor(AbstractElementImpl.NAME, "Name"),
				new TextPropertyDescriptor(AbstractElementImpl.TEXT, "Text") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(AbstractElementImpl.NAME))
			return getCastedModel().getName();
		else if (id.equals(AbstractElementImpl.TEXT))
			return getCastedModel().getText();

		return null;
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		if (id.equals(AbstractElementImpl.NAME))
			getCastedModel().setName((String) value);
		else if (id.equals(AbstractElementImpl.TEXT))
			getCastedModel().setText((String) value);

	}

}
