package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.ResizableDiagramElement;

public class DeleteResizableElementCommand extends Command {

	private ResizableDiagramElement child;
	private Diagram parent;

	@Override
	public void execute() {
		parent.removeElement(child);
	}
	
	@Override
	public void undo() {
		parent.addElement(child);
	}
	
	@Override
	public void redo() {
		parent.removeElement(child);
	}
	
	public void setChild(ResizableDiagramElement c) {
		child = c;
	}
	
	public ResizableDiagramElement getChild() {
		return child;
	}

	public void setParent(Diagram p) {
		parent = p;
	}
	
	public Diagram getParent() {
		return parent;
	}
}
