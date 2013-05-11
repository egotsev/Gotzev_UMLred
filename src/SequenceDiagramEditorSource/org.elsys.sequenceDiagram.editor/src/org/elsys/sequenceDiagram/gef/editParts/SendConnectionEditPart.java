package org.elsys.sequenceDiagram.gef.editParts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.SendConnection;
import org.elsys.sequenceDiagram.SendConnectionType;
import org.elsys.sequenceDiagram.gef.figures.ConnectionFigure;
import org.elsys.sequenceDiagram.gef.figures.SendConnectionFigure;
import org.elsys.sequenceDiagram.impl.ConnectionImpl;

public class SendConnectionEditPart extends ConnectionEditPart {
	
	@Override
	protected IFigure createFigure() {
		SendConnection conn = getCastedModel();
		SendConnectionFigure f = new SendConnectionFigure(conn.getType().toString(),
				conn.getMessage());
		return f;
	}
	
	private SendConnection getCastedModel() {
		return (SendConnection) getModel();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		SendConnectionFigure f = (SendConnectionFigure) getFigure();
		f.setMessage(getCastedModel().getMessage());
		f.setType(getCastedModel().getType().toString());
	}
	
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] {
				new TextPropertyDescriptor(ConnectionImpl.TEXT, "Message"),
				new ComboBoxPropertyDescriptor(ConnectionImpl.TYPE, "Type", 
						new String [] {"synchronous","asynchronous"})
				
		};
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(ConnectionImpl.TEXT))
			return getCastedModel().getMessage();
		else if(id.equals(ConnectionImpl.TYPE)) {
			SendConnectionType type = getCastedModel().getType();
			if (type.equals(SendConnectionType.SYNCHRONOUS))
				return 0;
			if (type.equals(SendConnectionType.ASYNCHRONOUS))
				return 1;
		}
		return null;
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		if (id.equals(ConnectionImpl.TEXT))
			getCastedModel().setMessage((String) value);
		else if(id.equals(ConnectionImpl.TYPE)) {
			if (value.equals(0)) {
				getCastedModel().setType(SendConnectionType.SYNCHRONOUS);
			} else if (value.equals(1)) {
				getCastedModel().setType(SendConnectionType.ASYNCHRONOUS);
			}
		}
	}

}
