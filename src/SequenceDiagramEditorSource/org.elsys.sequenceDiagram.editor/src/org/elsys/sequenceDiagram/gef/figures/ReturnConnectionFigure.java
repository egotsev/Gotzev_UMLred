package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;

public class ReturnConnectionFigure extends ConnectionFigure {
	
	public ReturnConnectionFigure(String m) {
		super(m);
		setLineStyle(Graphics.LINE_DASH);
		setTargetDecoration(new PolylineDecoration());
	}
	
	
}
