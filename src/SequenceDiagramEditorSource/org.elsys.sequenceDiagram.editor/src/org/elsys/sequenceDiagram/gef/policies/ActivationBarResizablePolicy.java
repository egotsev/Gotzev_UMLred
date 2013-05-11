package org.elsys.sequenceDiagram.gef.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.gef.commands.ResizeActivationBarCommand;

public class ActivationBarResizablePolicy extends ResizableEditPolicy {
	protected Command getResizeCommand(ChangeBoundsRequest request) {
		ResizeActivationBarCommand command = new ResizeActivationBarCommand();
		command.setActivationBar((ActivationBar) getHost().getModel());
		command.setHeight(request.getSizeDelta().height);
		return command;
	}
}
