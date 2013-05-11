package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.gef.figures.LifelineFigure;
import org.elsys.sequenceDiagram.gef.policies.ComponentPolicy;
import org.elsys.sequenceDiagram.impl.AbstractElementImpl;
import org.elsys.sequenceDiagram.impl.LifelineImpl;
import org.elsys.sequenceDiagram.provider.LifelineItemProvider;
import org.elsys.sequenceDiagram.provider.SequenceDiagramItemProviderAdapterFactory;

public class LifelineEditPart extends AbstractDiagramElementEditPart {

	@Override
	protected IFigure createFigure() {
		Rectangle rect = new Rectangle(getCastedModel().getX(),
				getCastedModel().getY(), -1, -1);
		LifelineFigure f = new LifelineFigure(rect);
		return f;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		if (LifelineImpl.LOC.equals(prop)) {
			refreshVisuals();
		}
	}

	private Lifeline getCastedModel() {
		return (Lifeline) getModel();
	}

	private LifelineFigure getLifelineFigure() {
		return (LifelineFigure) getFigure();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentPolicy());
	}

	protected void refreshVisuals() {
		Rectangle bounds = new Rectangle(getCastedModel().getX(),
				getCastedModel().getY(), -1, -1);
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getLifelineFigure(), bounds);
	}

	protected List getModelChildren() {
		List<Object> children = new ArrayList<Object>();
		children.add(getCastedModel().getName());
		children.add(getCastedModel().getActivationBars());
		return children;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] { new TextPropertyDescriptor(
				AbstractElementImpl.NAME, "Name") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		return getCastedModel().getName();
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		getCastedModel().setName((String) value);
	}

}
