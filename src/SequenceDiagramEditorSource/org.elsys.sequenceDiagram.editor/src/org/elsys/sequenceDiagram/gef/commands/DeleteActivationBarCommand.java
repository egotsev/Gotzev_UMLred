package org.elsys.sequenceDiagram.gef.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Connection;
import org.elsys.sequenceDiagram.Lifeline;

public class DeleteActivationBarCommand extends Command {

	private ActivationBar activationBar;
	private int index;
	private Lifeline lifeline;
	private List<Connection> sentConnections = new ArrayList<Connection>();
	private List<Connection> receivedConnections = new ArrayList<Connection>();
	
	@Override
	public void execute() {
		deleteConnections();
		lifeline.removeActivationBar(activationBar);
	}
	
	@Override
	public void undo() {
		lifeline.addActivationBar(index, activationBar);
		restoreConnections();
	}
	
	@Override
	public void redo() {
		execute();
	}
	
	private void deleteConnections() {
		for (int i = 0; i < sentConnections.size(); i++){
			Connection conn = sentConnections.get(i);
			conn.getReceiver().removeReceivedConnection(conn);
			activationBar.removeSentConnection(conn);
		}
		for (int i = 0; i < receivedConnections.size(); i++){
			Connection conn = receivedConnections.get(i);
			activationBar.removeReceivedConnection(conn);
			conn.getSender().removeSentConnection(conn);
		}
	}
	
	private void restoreConnections() {
		for (int i = 0; i < sentConnections.size(); i++){
			Connection conn = sentConnections.get(i);
			conn.getReceiver().addReceivedConnection(conn);
			activationBar.addSentConnection(conn);
		}
		for (int i = 0; i < receivedConnections.size(); i++){
			Connection conn = receivedConnections.get(i);
			activationBar.addReceivedConnection(conn);
			conn.getSender().addSentConnection(conn);
		}
	}
	
	public void setActivationBar(ActivationBar ab) {
		activationBar = ab;
	}

	public ActivationBar getActivationBar() {
		return activationBar;
	}

	public void setLifeline(Lifeline l) {
		lifeline = l;
		index = lifeline.getActivationBars().indexOf(activationBar);
		sentConnections.addAll(activationBar.getSentConnections());
		receivedConnections.addAll(activationBar.getReceivedConnections());
	}
	
	public Lifeline getLifeline() {
		return lifeline;
	}
}
