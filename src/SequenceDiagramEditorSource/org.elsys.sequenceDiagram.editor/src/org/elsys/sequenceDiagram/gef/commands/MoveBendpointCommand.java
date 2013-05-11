package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.draw2d.geometry.Point;
import org.elsys.sequenceDiagram.BendPoint;

public class MoveBendpointCommand extends BendpointCommand {
	
	private Point oldLocation = new Point();
	
	@Override
	public void execute() {
		BendPoint bp = getConn().getBendPoints().get(getIndex());
		oldLocation.x = bp.getX();
		oldLocation.y = bp.getY();
		getConn().moveBendPoint(getIndex(), getLocation().x, getLocation().y);
	}
	
	@Override
	public void undo() {
		getConn().moveBendPoint(getIndex(), oldLocation.x, oldLocation.y);
	}
	
	@Override
	public void redo() {
		getConn().moveBendPoint(getIndex(), getLocation().x, getLocation().y);
	}
}
