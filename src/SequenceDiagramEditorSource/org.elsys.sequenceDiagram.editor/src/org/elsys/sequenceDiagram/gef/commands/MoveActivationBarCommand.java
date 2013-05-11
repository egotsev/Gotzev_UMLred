package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Lifeline;

public class MoveActivationBarCommand extends Command {

	private ActivationBar bar;
	private ActivationBar afterBar;
	private Lifeline line;
	private int newPos;
	private int oldPos;

	@Override
	public void execute() {
		if (!line.equals(bar.getLifeline()))
			return;
		if (afterBar != null) {
			newPos = line.getActivationBars().indexOf(afterBar);
			oldPos = line.getActivationBars().indexOf(bar);
			if (! (newPos < oldPos))
				newPos -= 1;
			if (newPos == oldPos)
				return;
			line.moveActivationBar(newPos, bar);
		} else {
			newPos = line.getActivationBars().size() - 1;
			oldPos = line.getActivationBars().indexOf(bar);
			line.moveActivationBar(newPos, bar);
		}
	}

	@Override
	public void redo() {
		line.moveActivationBar(newPos, bar);
	}

	@Override
	public void undo() {
		line.moveActivationBar(oldPos, bar);
	}

	public void setBar(ActivationBar bar) {
		this.bar = bar;
	}

	public void setAfterBar(ActivationBar after) {
		this.afterBar = after;
	}

	public void setLifeline(Lifeline line) {
		this.line = line;
	}

}
