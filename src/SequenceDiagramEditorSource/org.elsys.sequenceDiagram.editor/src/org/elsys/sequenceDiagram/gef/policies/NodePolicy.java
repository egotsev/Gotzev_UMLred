package org.elsys.sequenceDiagram.gef.policies;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.gef.commands.ConnectionCommand;
import org.elsys.sequenceDiagram.gef.editParts.ActivationBarEditPart;

public class NodePolicy extends GraphicalNodeEditPolicy {

	protected Connection createDummyConnection(Request req) {
		PolylineConnection conn = new PolylineConnection();
		return conn;
	}

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		ConnectionCommand command = (ConnectionCommand) request
				.getStartCommand();
		command.setReceiver(getActivationBar());
		return command;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		ConnectionCommand command = new ConnectionCommand();
		command.setConnection(request.getNewObject());
		command.setSender(getActivationBar());
		request.setStartCommand(command);
		return command;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		ConnectionCommand cmd = new ConnectionCommand();
		cmd.setConnection(request.getConnectionEditPart().getModel());
		cmd.setReceiver(getActivationBar());
		cmd.setSender(((org.elsys.sequenceDiagram.Connection) request
				.getConnectionEditPart().getModel()).getSender());
		return cmd;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		ConnectionCommand cmd = new ConnectionCommand();
		cmd.setConnection(request.getConnectionEditPart().getModel());
		cmd.setSender(getActivationBar());
		cmd.setReceiver(((org.elsys.sequenceDiagram.Connection) request
				.getConnectionEditPart().getModel()).getReceiver());
		return cmd;
	}

	private ActivationBar getActivationBar() {
		return (ActivationBar) getHost().getModel();
	}
}
