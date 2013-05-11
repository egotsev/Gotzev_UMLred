package org.elsys.sequenceDiagram.gef.commands;

import org.eclipse.gef.commands.Command;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Lifeline;

public class CreateActivationBarCommand extends Command {

	private ActivationBar bar;
	private Lifeline line;
	private ActivationBar afterBar;
	private int index;

	@Override
	public void execute() {
		if (afterBar == null)
			index = line.getActivationBars().size();
		else
			index = line.getActivationBars().indexOf(afterBar);
		line.addActivationBar(index, bar);
		
	}

	@Override
	public void redo() {
		line.addActivationBar(index, bar);
	}

	@Override
	public void undo() {
		line.removeActivationBar(bar);
	}

	public void setBar(ActivationBar bar) {
		this.bar = bar;
	}

	public void setAfterBar(ActivationBar bar) {
		this.afterBar = bar;
	}

	public void setLifeline(Lifeline line) {
		this.line = line;
	}

}
