package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.FanRouter;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.graphics.Color;

public abstract class ConnectionFigure extends PolylineConnection {
	
	protected Label message;
	private static Color FG_COLOR = 
		new Color(ColorConstants.tooltipBackground.getDevice(), 60, 60, 60);
	public ConnectionFigure(String m){
		setForegroundColor(FG_COLOR);
		setConnectionRouter(new FanRouter());
		MidpointLocator locator = new MidpointLocator(this, 0);
		message = new Label(m);
		message.setOpaque(true);
		add(message, locator);
		ConnectionEndpointLocator sourceEndpointLocator = 
            new ConnectionEndpointLocator(this, false);
		sourceEndpointLocator.setVDistance(15);
	}
	
	public void setMessage(String mid){
		message.setText(mid);
		repaint();
	}

}
