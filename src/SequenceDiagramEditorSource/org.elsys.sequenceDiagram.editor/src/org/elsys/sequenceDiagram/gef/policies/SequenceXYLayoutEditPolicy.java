package org.elsys.sequenceDiagram.gef.policies;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.elsys.sequenceDiagram.AbstractDiagramElement;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.gef.commands.CreateCommand;
import org.elsys.sequenceDiagram.gef.commands.SetConstraintCommand;
import org.elsys.sequenceDiagram.gef.editParts.LifelineEditPart;

public class SequenceXYLayoutEditPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command createAddCommand(EditPart child, Object constraint) {
		CreateCommand command = new CreateCommand();
		command.setParent((Diagram) getHost().getModel());
		if (!(child instanceof AbstractDiagramElement)) return null;
		command.setChild((AbstractDiagramElement) child.getModel());
		command.setLocation(((Rectangle) constraint).getLocation());
		command.setSize(((Rectangle) constraint).getSize());
		return command;
	}

	protected Command createChangeConstraintCommand(
			ChangeBoundsRequest request, EditPart child, Object constraint) {
		return createChangeConstraintCommand(child, constraint);
	}

	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		SetConstraintCommand command = new SetConstraintCommand();
		command.setLocation((Rectangle) constraint);
		command.setChild((AbstractDiagramElement) child.getModel());
		return command;
	}

	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

	protected Command getCreateCommand(CreateRequest request) {
		Object child = request.getNewObject();
		CreateCommand command = new CreateCommand();
		if (!(child instanceof AbstractDiagramElement)) return null;
		command.setChild((AbstractDiagramElement) child);
		command.setParent((Diagram) getHost().getModel());
		command.setLocation(request.getLocation());
		command.setSize(request.getSize());
		return command;

	}

	/**
	 * Must be implenented in the right way.
	 */
	protected EditPolicy createChildEditPolicy(EditPart child) {
		if (child instanceof LifelineEditPart) {
			NonResizableEditPolicy policy = new NonResizableEditPolicy();
			return policy;
		}
		ResizableEditPolicy policy = new ResizableEditPolicy();
		policy.setResizeDirections(PositionConstants.EAST
				| PositionConstants.WEST | PositionConstants.NORTH
				| PositionConstants.SOUTH);
		return policy;
	}

}