package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.Connection;

public class BendpointCommand extends Command {
	private Connection conn;
	private int index;
	private Point location;
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}

	protected Connection getConn() {
		return conn;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	protected int getIndex() {
		return index;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	protected Point getLocation() {
		return location;
	}
}
