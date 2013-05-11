package org.elsys.sequenceDiagram.gef.commands;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Connection;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.Lifeline;

public class DeleteLifelineCommand extends Command {

	private Lifeline lifeline;
	private Diagram diagram;
	private List<ActivationBar> activationBars = new ArrayList<ActivationBar>();
	private List<Connection> connections = new ArrayList<Connection>();
	@Override
	public void execute() {
		deleteConnections();
		deleteActivationBars();
		diagram.removeElement(lifeline);
	}

	@Override
	public void undo() {
		diagram.addElement(lifeline);
		restoreActivationBars();
		restoreConnections();
	}
	
	@Override
	public void redo() {
		execute();
	}
	
	private void deleteActivationBars() {
		for (int i = 0; i < activationBars.size(); i++) {
			lifeline.removeActivationBar(activationBars.get(i));
		}
	}
	
	private void deleteConnections() {
		for (int i = 0; i < connections.size(); i++){
			Connection conn = connections.get(i);
			conn.getReceiver().removeReceivedConnection(conn);
			conn.getSender().removeSentConnection(conn);
		}
	}

	private void restoreActivationBars() {
		for (int i = 0; i < activationBars.size(); i++) {
			lifeline.addActivationBar(i, activationBars.get(i));
		}
	}
	public void restoreConnections() {
		for (int i = 0; i < connections.size(); i++){
			Connection conn = connections.get(i);
			conn.getReceiver().addReceivedConnection(conn);
			conn.getSender().addSentConnection(conn);
		}
	}
	
	public void setLifeline(Lifeline l) {
		lifeline = l;
		activationBars.addAll(lifeline.getActivationBars());
		for (int i = 0; i < activationBars.size(); i++) {
			connections.addAll(activationBars.get(i).getSentConnections());
			connections.addAll(activationBars.get(i).getReceivedConnections());
		}
	}
	
	public Lifeline getLifeline() {
		return lifeline;
	}

	public void setDiagram(Diagram d) {
		diagram = d;
	}
	
	public Diagram getDiagram() {
		return diagram;
	}

}
