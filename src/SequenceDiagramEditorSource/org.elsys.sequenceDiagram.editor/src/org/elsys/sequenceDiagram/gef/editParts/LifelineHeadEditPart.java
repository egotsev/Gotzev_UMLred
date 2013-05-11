package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.gef.figures.LifelineHeadFigure;
import org.elsys.sequenceDiagram.impl.LifelineImpl;

public class LifelineHeadEditPart extends AbstractGraphicalEditPart implements
		PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		if (LifelineImpl.NAME.equals(prop)) {
			refreshVisuals();
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
		LifelineHeadFigure f = new LifelineHeadFigure(getCastedModel());
		return f;
	}

	private String getCastedModel() {
		return (String) getModel();
	}

	private LifelineHeadFigure getHeadFigure() {
		return (LifelineHeadFigure) getFigure();
	}

	@Override
	protected void refreshVisuals() {
		setModel(((Lifeline) getParent().getModel()).getName());
		getHeadFigure().setName(getCastedModel());
		Rectangle r = getFigure().getBounds();
		r.height = -1;
		r.width = -1;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
