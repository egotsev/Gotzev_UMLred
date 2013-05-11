package org.elsys.sequenceDiagram.gef.policies;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.ResizableDiagramElement;
import org.elsys.sequenceDiagram.gef.commands.DeleteActivationBarCommand;
import org.elsys.sequenceDiagram.gef.commands.DeleteLifelineCommand;
import org.elsys.sequenceDiagram.gef.commands.DeleteResizableElementCommand;

public class ComponentPolicy extends ComponentEditPolicy {
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		List<EditPart> parts = deleteRequest.getEditParts();
		for (EditPart part : parts) {
			System.out.println(part.getClass().toString());
		}
		System.out.println("End of request");
		if (getHost().getModel() instanceof ResizableDiagramElement) {
			DeleteResizableElementCommand command = new DeleteResizableElementCommand();
			command.setChild((ResizableDiagramElement) getHost().getModel());
			command.setParent((Diagram) getHost().getParent().getModel());
			return command;
		} else if (getHost().getModel() instanceof Lifeline) {
			DeleteLifelineCommand command = new DeleteLifelineCommand();
			command.setLifeline((Lifeline) getHost().getModel());
			command.setDiagram((Diagram) getHost().getParent().getModel());
			return command;
		} else if (getHost().getModel() instanceof ActivationBar) {
			DeleteActivationBarCommand command = new DeleteActivationBarCommand();
			command.setActivationBar((ActivationBar) getHost().getModel());
			command.setLifeline((Lifeline) getHost().getParent().getParent().getModel());
			return command;
		}
		return super.createDeleteCommand(deleteRequest);
	}
}
