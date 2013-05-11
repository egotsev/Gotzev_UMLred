package org.elsys.sequenceDiagram.gef.policies;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.gef.commands.CreateActivationBarCommand;
import org.elsys.sequenceDiagram.gef.commands.MoveActivationBarCommand;
import org.elsys.sequenceDiagram.gef.editParts.ActivationBarEditPart;

public class LifelineFlowLayoutEditPolicy extends FlowLayoutEditPolicy {
	
	@Override
	protected Command getAddCommand(Request req) {
		return null;
	}
	
	@Override
	protected Command createAddCommand(EditPart child, EditPart after) {
		if (!(child instanceof ActivationBarEditPart))
			return null;
		CreateActivationBarCommand command = new CreateActivationBarCommand();
		command.setBar((ActivationBar) child.getModel());
		command.setLifeline((Lifeline) getHost().getParent().getModel());
		if (after == null)
			command.setAfterBar(null);
		else
			command.setAfterBar((ActivationBar) after.getModel());
		return command;
	}

	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		ActivationBarResizablePolicy policy = new ActivationBarResizablePolicy();
		policy.setResizeDirections(PositionConstants.NORTH
				| PositionConstants.SOUTH);
		return policy;
	}

	@Override
	protected Command createMoveChildCommand(EditPart child, EditPart after) {
		if (!(child instanceof ActivationBarEditPart))
			return null;
		MoveActivationBarCommand command = new MoveActivationBarCommand();
		command.setBar((ActivationBar) child.getModel());
		if (after == null)
			command.setAfterBar(null);
		else
			command.setAfterBar((ActivationBar) after.getModel());
		command.setLifeline((Lifeline) getHost().getParent().getModel());
		return command;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Object bar = request.getNewObject();
		if (!(bar instanceof ActivationBar))
			return null;
		CreateActivationBarCommand command = new CreateActivationBarCommand();
		command.setBar((ActivationBar) bar);
		command.setLifeline((Lifeline) getHost().getParent().getModel());
		EditPart after = getInsertionReference(request);
		if (after == null)
			command.setAfterBar(null);
		else
			command.setAfterBar((ActivationBar) after.getModel());
		return command;
	}

}
