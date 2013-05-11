package org.elsys.sequenceDiagram.gef.model;

import org.eclipse.gef.requests.CreationFactory;
import org.elsys.sequenceDiagram.gef.SequencePalette;
import org.elsys.sequenceDiagram.impl.SequenceDiagramFactoryImpl;

public class SequenceModelFactory extends SequenceDiagramFactoryImpl implements CreationFactory {
	String template;

	public SequenceModelFactory(String temp) {
		template = temp;
	}

	@Override
	public Object getNewObject() {
		if (SequencePalette.LIFELINE.equals(template)) {
			return createLifeline();
		}
		if (SequencePalette.ACTIVATION_BAR.equals(template)) {
			return createActivationBar();
		}
		if (SequencePalette.NOTE.equals(template)) {
			return createNote();
		}
		if (SequencePalette.ALT_CF.equals(template)) {
			return createAlternativeCombinedFragment();
		}
		if (SequencePalette.OPT_CF.equals(template)) {
			return createOptionCombinedFragment();
		}
		if (SequencePalette.LOOP_CF.equals(template)) {
			return createLoopCombinedFragment();
		}
		if (SequencePalette.BREAK_CF.equals(template)) {
			return createBreakCombinedFragment();
		}
		if (SequencePalette.PARALLEL_CF.equals(template)) {
			return createParallelCombinedFragment();
		}
		if (SequencePalette.SEND_CONN.equals(template)) {
			return createSendConnection();
		}
		if (SequencePalette.RETURN_CONN.equals(template)) {
			return createReturnConnection();
		}
		return null;
	}

	@Override
	public Object getObjectType() {
		return template;
	}

}
