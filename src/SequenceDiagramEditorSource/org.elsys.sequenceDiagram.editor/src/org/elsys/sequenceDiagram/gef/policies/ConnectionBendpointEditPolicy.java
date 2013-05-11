package org.elsys.sequenceDiagram.gef.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;
import org.elsys.sequenceDiagram.Connection;
import org.elsys.sequenceDiagram.gef.commands.CreateBendpointCommand;
import org.elsys.sequenceDiagram.gef.commands.DeleteBendpointCommand;
import org.elsys.sequenceDiagram.gef.commands.MoveBendpointCommand;

public class ConnectionBendpointEditPolicy extends BendpointEditPolicy {

	@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		CreateBendpointCommand command = new CreateBendpointCommand();
		command.setConn((Connection) request.getSource().getModel());
		command.setIndex(request.getIndex());
		command.setLocation(request.getLocation());
		return command;
	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		DeleteBendpointCommand command = new DeleteBendpointCommand();
		command.setConn((Connection) request.getSource().getModel());
		command.setIndex(request.getIndex());
		command.setLocation(request.getLocation());
		return command;
	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		MoveBendpointCommand command = new MoveBendpointCommand();
		command.setConn((Connection) request.getSource().getModel());
		command.setIndex(request.getIndex());
		command.setLocation(request.getLocation());
		return command;
	}

}
