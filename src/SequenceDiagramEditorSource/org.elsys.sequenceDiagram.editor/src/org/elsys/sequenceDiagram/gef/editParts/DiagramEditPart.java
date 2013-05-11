package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.ConnectionRouter.NullConnectionRouter;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.ShortestPathConnectionRouter;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.gef.figures.DiagramFigure;
import org.elsys.sequenceDiagram.gef.policies.SequenceXYLayoutEditPolicy;
import org.elsys.sequenceDiagram.impl.DiagramImpl;

public class DiagramEditPart extends AbstractElementEditPart {

	@Override
	protected IFigure createFigure() {
		ConnectionLayer connLayer = (ConnectionLayer)getLayer(LayerConstants.CONNECTION_LAYER);
		connLayer.setConnectionRouter(new BendpointConnectionRouter());
		return new DiagramFigure();
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		if (DiagramImpl.CHILD.equals(prop)){
			refreshChildren();
		}
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new SequenceXYLayoutEditPolicy());
		
	}

	public void activate() {
		if (isActive())
			return;
		super.activate();
		getCastedModel().addPropertyChangeListener(this);
	}

	public void deactivate() {
		if (!isActive())
			return;
		super.deactivate();
		getCastedModel().removePropertyChangeListener(this);
	}

	private Diagram getCastedModel() {
		return (Diagram) getModel();
	}

	protected List getModelChildren() {
		List<Object> children = new ArrayList<Object>();
		children.addAll(getCastedModel().getLifelines());
		children.addAll(getCastedModel().getNotes());
		children.addAll(getCastedModel().getCombinedFragments());
		return children;
	}

}
