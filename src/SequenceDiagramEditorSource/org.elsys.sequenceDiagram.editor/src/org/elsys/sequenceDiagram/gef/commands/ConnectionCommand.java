package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.ui.views.navigator.GotoActionGroup;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Connection;

public class ConnectionCommand extends Command {

	private Connection connection;
	private ActivationBar oldReceiver, receiver;
	private ActivationBar oldSender, sender;

	@Override
	public void execute() {
		if (receiver != null) {
			if (oldReceiver != null)
				oldReceiver.removeReceivedConnection(connection);
			connection.setReceiver(receiver);
			receiver.addReceivedConnection(connection);
		}
		if (sender != null) {
			if (oldSender != null)
				oldSender.removeSentConnection(connection);
			connection.setSender(sender);
			sender.addSentConnection(connection);
		}
	}

	@Override
	public void redo() {
		execute();
	}

	@Override
	public void undo() {
		sender = connection.getSender();
		receiver = connection.getReceiver();
		sender.removeSentConnection(connection);
		receiver.removeReceivedConnection(connection);
		connection.setSender(oldSender);
		connection.setReceiver(oldReceiver);
		if (oldSender != null)
			oldSender.addSentConnection(connection);
		if (oldReceiver != null)
			oldReceiver.addReceivedConnection(connection);
	}

	public void setSender(ActivationBar bar) {
		sender = bar;
	}

	public void setReceiver(ActivationBar bar) {
		receiver = bar;
	}

	public void setConnection(Object conn) {
		connection = (Connection) conn;
		oldReceiver = connection.getReceiver();
		oldSender = connection.getSender();
	}

}
