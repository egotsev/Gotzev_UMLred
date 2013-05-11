package org.elsys.sequenceDiagram.gef.commands;

import org.elsys.sequenceDiagram.BendPoint;

public class DeleteBendpointCommand extends BendpointCommand{

	private BendPoint bp;
	
	@Override
	public void execute() {
		bp = getConn().getBendPoints().get(getIndex());
		getConn().removeBendPoint(getIndex());
	}
	
	@Override
	public void undo() {
		getConn().addBendPoint(getIndex(), bp);
	}
	
	@Override
	public void redo() {
		getConn().removeBendPoint(getIndex());
	}
}
