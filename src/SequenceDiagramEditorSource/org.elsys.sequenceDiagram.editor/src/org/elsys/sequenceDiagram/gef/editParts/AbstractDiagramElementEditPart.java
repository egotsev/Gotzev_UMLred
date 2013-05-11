package org.elsys.sequenceDiagram.gef.editParts;

import org.eclipse.ui.views.properties.IPropertySource;

public abstract class AbstractDiagramElementEditPart extends
		AbstractElementEditPart implements IPropertySource {

	@Override
	public Object getEditableValue() {
		return null;
	}

	@Override
	public void resetPropertyValue(Object id) {

	}

	@Override
	public boolean isPropertySet(Object id) {
		return true;
	}
}
