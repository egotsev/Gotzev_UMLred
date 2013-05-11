package org.elsys.sequenceDiagram.gef.editParts;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.elsys.sequenceDiagram.*;

public class SequenceEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart editPart = null;
		if(Diagram.class.isInstance(model)) {
			editPart = new DiagramEditPart();
			editPart.setModel(model);
		} else if(Lifeline.class.isInstance(model)){
			editPart = new LifelineEditPart();
			editPart.setModel(model);
		}else if(model instanceof List){
			editPart = new LifelineBodyEditPart();
			editPart.setModel(model);
		} else if((model instanceof String) &&(context instanceof LifelineEditPart)){
			editPart = new LifelineHeadEditPart();
			editPart.setModel(model);
		} else if (ActivationBar.class.isInstance(model)){
			editPart = new ActivationBarEditPart();
			editPart.setModel(model);
		} else if(Note.class.isInstance(model)){
			editPart = new NoteEditPart();
			editPart.setModel(model);
		} else if (CombinedFragment.class.isInstance(model)){
			editPart = createCombinedFragmentEditPart(model);
		} else if (ReturnConnection.class.isInstance(model)){
			editPart = new ReturnConnectionEditPart();
			editPart.setModel(model);
		} else if (SendConnection.class.isInstance(model)){
			editPart = new SendConnectionEditPart();
		}	editPart.setModel(model);
		return editPart;
	}
	
	private CombinedFragmentEditPart createCombinedFragmentEditPart(Object model){
		CombinedFragmentEditPart editPart = null;
		if(AlternativeCombinedFragment.class.isInstance(model)) {
			editPart = new AlternativeEditPart();
			editPart.setModel(model);
		} else if(OptionCombinedFragment.class.isInstance(model)){
			editPart = new OptionEditPart();
			editPart.setModel(model);
		}else if(LoopCombinedFragment.class.isInstance(model)){
			editPart = new LoopEditPart();
			editPart.setModel(model);
		} else if(BreakCombinedFragment.class.isInstance(model)){
			editPart = new BreakEditPart();
			editPart.setModel(model);
		} else if(ParallelCombinedFragment.class.isInstance(model)){
			editPart = new ParallelEditPart();
			editPart.setModel(model);
		}
		return editPart;
	}

}
