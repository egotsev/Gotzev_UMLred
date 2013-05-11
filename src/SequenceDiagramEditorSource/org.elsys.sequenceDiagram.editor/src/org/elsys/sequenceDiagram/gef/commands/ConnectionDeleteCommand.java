package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Connection;

public class ConnectionDeleteCommand extends Command {

	private Connection con;
	private ActivationBar sender, receiver;
	
	public ConnectionDeleteCommand(Connection connection) {
		con = connection;
		sender = con.getSender();
		receiver = con.getReceiver();
	}
	
	@Override
	public void execute() {
		receiver.removeReceivedConnection(con);
		sender.removeSentConnection(con);
	}
	
	@Override
	public void undo() {
		receiver.addReceivedConnection(con);
		sender.addSentConnection(con);
	}
	
	@Override
	public void redo() {
		execute();
	}

}
