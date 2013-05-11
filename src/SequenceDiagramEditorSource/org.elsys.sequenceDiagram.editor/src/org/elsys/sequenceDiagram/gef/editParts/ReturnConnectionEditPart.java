package org.elsys.sequenceDiagram.gef.editParts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.Connection;
import org.elsys.sequenceDiagram.ReturnConnection;
import org.elsys.sequenceDiagram.gef.figures.ConnectionFigure;
import org.elsys.sequenceDiagram.gef.figures.ReturnConnectionFigure;
import org.elsys.sequenceDiagram.impl.ConnectionImpl;

public class ReturnConnectionEditPart extends ConnectionEditPart {

	@Override
	protected IFigure createFigure() {
		ReturnConnection conn = getCastedModel();
		ReturnConnectionFigure f = new ReturnConnectionFigure(
				conn.getMessage());
		return f;
	}

	private ReturnConnection getCastedModel() {
		return (ReturnConnection) getModel();
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		((ConnectionFigure) getFigure()).setMessage(
				getCastedModel().getMessage());
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] {
				new TextPropertyDescriptor(ConnectionImpl.TEXT, "Message")
		};
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(ConnectionImpl.TEXT))
			return getCastedModel().getMessage();
		return null;
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		if (id.equals(ConnectionImpl.TEXT))
			getCastedModel().setMessage((String) value);
	}

}
