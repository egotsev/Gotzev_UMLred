package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.swt.graphics.Color;

public class ActivationBarFigure extends RectangleFigure {
			
	private ChopboxAnchor out = new ChopboxAnchor(this);
	private ChopboxAnchor in = new ChopboxAnchor(this);
	private static Color FG_COLOR = 
		new Color(ColorConstants.tooltipBackground.getDevice(), 113, 113, 113);
	private static Color BG_COLOR =
		new Color(ColorConstants.tooltipBackground.getDevice(), 155, 192, 145);
	
	public ActivationBarFigure(int height){
		bounds.height = height;
		bounds.width = 21;
		setFill(true);
		setLineWidth(2);
	}
	
	public void setHeight(int h){
		bounds.height = h;
		repaint();
	}
	
	public ChopboxAnchor getOutAnchor(){
		return out;
	}
	
	public ChopboxAnchor getInAnchor() {
		return in;
	}
	
	@Override
	public void paintFigure(Graphics graphics) {
		graphics.setForegroundColor(FG_COLOR);
		graphics.setBackgroundColor(BG_COLOR);
		super.paintFigure(graphics);
	}
}
