package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.AbstractDiagramElement;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.ResizableDiagramElement;

public class CreateCommand extends Command {
	private Diagram parent;
	private AbstractDiagramElement child;
	private Dimension size;
	private Point location;

	public CreateCommand() {
	}

	public void execute() {
		child.setX(location.x);
		child.setY(location.y);
		if (size == null) {
			parent.addElement(child);
			return;
		}
		if (child instanceof ResizableDiagramElement) {
			((ResizableDiagramElement) child).setWidth(size.width);
			((ResizableDiagramElement) child).setHeight(size.height);
		}
		parent.addElement(child);
	}

	public void setParent(Diagram diagram) {
		parent = diagram;
	}

	public void setChild(AbstractDiagramElement c) {
		child = c;
	}

	public void redo() {
		execute();
	}

	public void undo() {
		parent.removeElement(child);
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void setSize(Dimension size) {
		this.size = size;
	}
}
