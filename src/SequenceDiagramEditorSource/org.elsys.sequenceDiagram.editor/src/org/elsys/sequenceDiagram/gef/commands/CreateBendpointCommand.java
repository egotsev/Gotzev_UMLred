package org.elsys.sequenceDiagram.gef.commands;

import org.elsys.sequenceDiagram.BendPoint;
import org.elsys.sequenceDiagram.impl.BendPointImpl;


public class CreateBendpointCommand extends BendpointCommand {
	
	@Override
	public void execute() {
		BendPoint point = new BendPointImpl();
		point.setX(getLocation().x);
		point.setY(getLocation().y);
		getConn().addBendPoint(getIndex(), point);
	}
	
	@Override
	public void undo() {
		getConn().removeBendPoint(getIndex());
	}
	
	@Override
	public void redo() {
		execute();
	}
}
