package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeEvent;

import org.eclipse.gef.EditPolicy;
import org.elsys.sequenceDiagram.gef.policies.ComponentPolicy;
import org.elsys.sequenceDiagram.impl.CombinedFragmentImpl;

public abstract class CombinedFragmentEditPart extends AbstractDiagramElementEditPart {

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentPolicy());
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String prop = evt.getPropertyName();
		if(CombinedFragmentImpl.LOC.equals(prop)
				|| CombinedFragmentImpl.SIZE.equals(prop)
				|| CombinedFragmentImpl.CONDITION.equals(prop)){
			refreshVisuals();
		}
	}

}
