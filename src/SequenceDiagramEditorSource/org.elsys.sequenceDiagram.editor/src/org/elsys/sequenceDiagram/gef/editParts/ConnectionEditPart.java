package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.RelativeBendpoint;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.elsys.sequenceDiagram.BendPoint;
import org.elsys.sequenceDiagram.Connection;
import org.elsys.sequenceDiagram.gef.commands.ConnectionDeleteCommand;
import org.elsys.sequenceDiagram.gef.policies.ConnectionBendpointEditPolicy;
import org.elsys.sequenceDiagram.impl.ConnectionImpl;

public abstract class ConnectionEditPart extends AbstractConnectionEditPart implements
		PropertyChangeListener, IPropertySource {

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
	
	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		if (prop.equals(ConnectionImpl.CONNECTION)||prop.equals(ConnectionImpl.TEXT)
				||prop.equals(ConnectionImpl.TYPE))
			refreshVisuals();
		else if (prop.equals(ConnectionImpl.BENDPOINT))
			refreshBendpoints();
	}
	
	private Connection getCastedModel() {
		return (Connection) getModel();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new ConnectionEditPolicy() {
			protected Command getDeleteCommand(GroupRequest request) {
				return new ConnectionDeleteCommand(getCastedModel());
			}		
		});
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new ConnectionBendpointEditPolicy());
	}
	
	@Override
	protected void refreshChildren() {
		super.refreshChildren();
		refreshBendpoints();
	}
	
	protected void refreshBendpoints() {
		if (getConnectionFigure().getConnectionRouter() instanceof ManhattanConnectionRouter)
			return;
		List<BendPoint> modelConstraint = getCastedModel().getBendPoints();
		List<AbsoluteBendpoint> figureConstraint = new ArrayList();
		for (int i = 0; i < modelConstraint.size(); i++) {
			BendPoint bp = (BendPoint) modelConstraint.get(i);
			AbsoluteBendpoint abp = new AbsoluteBendpoint(bp.getX(), bp.getY());
			figureConstraint.add(abp);
		}
		getConnectionFigure().setRoutingConstraint(figureConstraint);
	}

	@Override
	public Object getEditableValue() {
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void resetPropertyValue(Object id) {
		
	}

}
