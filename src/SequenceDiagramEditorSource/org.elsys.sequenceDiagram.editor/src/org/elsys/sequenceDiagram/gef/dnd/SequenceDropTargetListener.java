package org.elsys.sequenceDiagram.gef.dnd;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreationFactory;
import org.elsys.sequenceDiagram.gef.model.SequenceModelFactory;

public class SequenceDropTargetListener extends
		TemplateTransferDropTargetListener {

	public SequenceDropTargetListener(EditPartViewer viewer) {
		super(viewer);
	}
	
	protected CreationFactory getFactory(Object template) {
		return new SequenceModelFactory((String) template);
	}

}
