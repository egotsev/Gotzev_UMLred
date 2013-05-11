package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.AbstractDiagramElement;
import org.elsys.sequenceDiagram.ResizableDiagramElement;

public class SetConstraintCommand extends Command {
	private Point oldPos, newPos;
	private Dimension oldDim, newDim;
	private AbstractDiagramElement element;
	
	@Override
	public void execute() {
		oldPos = new Point(element.getX(), element.getY());
		element.setX(newPos.x);
		element.setY(newPos.y);
		if (element instanceof ResizableDiagramElement){
			oldDim = new Dimension(((ResizableDiagramElement) element).getWidth(),
					((ResizableDiagramElement) element).getHeight());
			((ResizableDiagramElement) element).setWidth(newDim.width);
			((ResizableDiagramElement) element).setHeight(newDim.height);
		}
	}
	
	@Override
	public void redo() {
		element.setX(newPos.x);
		element.setY(newPos.y);
		if (element instanceof ResizableDiagramElement){
			((ResizableDiagramElement) element).setWidth(newDim.width);
			((ResizableDiagramElement) element).setHeight(newDim.height);
		}
	}
	
	@Override
	public void undo() {
		element.setX(oldPos.x);
		element.setY(oldPos.y);
		if (element instanceof ResizableDiagramElement){
			((ResizableDiagramElement) element).setWidth(oldDim.width);
			((ResizableDiagramElement) element).setHeight(oldDim.height);
		}
	}
	
	public void setLocation(Rectangle r) {
		setLocation(r.getLocation());
		setSize(r.getSize());
	}
	
	public void setSize(Dimension size) {
		newDim = size;
	}

	public void setLocation(Point p) {
		newPos = p;
	}

	public void setChild(AbstractDiagramElement object) {
		element = object;
	}
}
