package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.gef.figures.ActivationBarFigure;
import org.elsys.sequenceDiagram.gef.policies.ActivationBarResizablePolicy;
import org.elsys.sequenceDiagram.gef.policies.ComponentPolicy;
import org.elsys.sequenceDiagram.gef.policies.NodePolicy;
import org.elsys.sequenceDiagram.impl.AbstractElementImpl;
import org.elsys.sequenceDiagram.impl.ActivationBarImpl;

public class ActivationBarEditPart extends AbstractElementEditPart implements
		NodeEditPart{

	@Override
	protected IFigure createFigure() {
		ActivationBar bar = getCastedModel();
		ActivationBarFigure f = new ActivationBarFigure(bar.getHeight());
		return f;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		if (ActivationBarImpl.SIZE.equals(prop)) {
			refreshVisuals();
		} else if (ActivationBarImpl.SENT.equals(prop)) {
			refreshSourceConnections();
		} else if (ActivationBarImpl.RECEIVED.equals(prop)){
			refreshTargetConnections();
		}
	}

	private ActivationBar getCastedModel() {
		return (ActivationBar) getModel();
	}

	private ActivationBarFigure getActivationBarFigure() {
		return (ActivationBarFigure) getFigure();

	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new NodePolicy());
	}

	protected void refreshVisuals() {
		Rectangle constraint = getFigure().getBounds();
		constraint.height = getCastedModel().getHeight();
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getActivationBarFigure(), constraint);
	}

	protected List getModelSourceConnections() {
		return getCastedModel().getSentConnections();
	}

	protected List getModelTargetConnections() {
		return getCastedModel().getReceivedConnections();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return getActivationBarFigure().getOutAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return getActivationBarFigure().getInAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return getActivationBarFigure().getOutAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return getActivationBarFigure().getInAnchor();
	}
}
