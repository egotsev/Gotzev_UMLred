package org.elsys.sequenceDiagram.gef.editParts;

import java.beans.PropertyChangeListener;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.AbstractDiagramElement;
import org.elsys.sequenceDiagram.AbstractElement;
import org.elsys.sequenceDiagram.impl.AbstractElementImpl;

public abstract class AbstractElementEditPart extends
		AbstractGraphicalEditPart implements PropertyChangeListener{

	@Override
	public void activate() {
		if (isActive())
			return;
		super.activate();
		getCastedModel().addPropertyChangeListener(this);
	}
	
	@Override
	public void deactivate() {
		if (!isActive())
			return;
		super.deactivate();
		getCastedModel().removePropertyChangeListener(this);
	}
	
	private AbstractElement getCastedModel() {
		return (AbstractElement) getModel();
	}
}
