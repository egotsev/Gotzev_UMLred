package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.ActivationBar;

public class ResizeActivationBarCommand extends Command {

	private int newHeight, oldHeight;
	private ActivationBar bar;

	@Override
	public void execute() {
		oldHeight = bar.getHeight();
		bar.setHeight(newHeight);
	}

	@Override
	public void redo() {
		bar.setHeight(newHeight);
	}

	@Override
	public void undo() {
		bar.setHeight(oldHeight);
	}

	public void setHeight(int height) {
		newHeight += height;
	}

	public void setActivationBar(ActivationBar model) {
		bar = model;
		newHeight+=bar.getHeight();
	}

}
