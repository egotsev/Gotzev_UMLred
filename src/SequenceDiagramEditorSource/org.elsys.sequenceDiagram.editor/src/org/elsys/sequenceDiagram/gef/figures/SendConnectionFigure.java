package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.elsys.sequenceDiagram.SendConnectionType;

public class SendConnectionFigure extends ConnectionFigure {
	
	public SendConnectionFigure(String type, String m) {
		super(m);
		if(type == "asynchronous"){
			setTargetDecoration(new PolylineDecoration());
		}else {
			setFilledDecoration();
		}
	}

	private void setFilledDecoration() {
		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		setTargetDecoration(decoration);
	}

	public void setType(String type) {
		if(type == "asynchronous"){
			setTargetDecoration(new PolylineDecoration());
		}else {
			setFilledDecoration();
		}
		repaint();
	}
	
}
