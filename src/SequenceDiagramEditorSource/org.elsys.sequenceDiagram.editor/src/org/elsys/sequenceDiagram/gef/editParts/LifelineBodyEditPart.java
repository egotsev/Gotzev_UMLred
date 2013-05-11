package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.gef.figures.LifelineBodyFigure;
import org.elsys.sequenceDiagram.gef.policies.LifelineFlowLayoutEditPolicy;
import org.elsys.sequenceDiagram.impl.AbstractElementImpl;
import org.elsys.sequenceDiagram.impl.LifelineImpl;

public class LifelineBodyEditPart extends AbstractGraphicalEditPart implements
		PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		if (LifelineImpl.CHILD.equals(prop)){
			refreshChildren();
		}
	}

	@Override
	public void activate() {
		if (isActive())
			return;
		super.activate();
		((Lifeline) getParent().getModel()).addPropertyChangeListener(this);
	}

	@Override
	public void deactivate() {
		if (!isActive())
			return;
		super.deactivate();
		((Lifeline) getParent().getModel()).removePropertyChangeListener(this);
	}

	@Override
	protected IFigure createFigure() {
		LifelineBodyFigure f = new LifelineBodyFigure();
		return f;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new LifelineFlowLayoutEditPolicy());
	}

	@Override
	protected List getModelChildren() {
		List<Object> children = new ArrayList<Object>();
		children.addAll(getCastedModel());
		return children;
	}

	private List getCastedModel() {
		return (List<ActivationBar>) getModel();
	}

	private LifelineBodyFigure getBodyFigure() {
		return (LifelineBodyFigure) getFigure();
	}

	@Override
	protected void refreshVisuals() {
		Rectangle r = new Rectangle(getFigure().getBounds().x, getFigure()
				.getBounds().y, -1, -1);
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getBodyFigure(), r);
	}
}
