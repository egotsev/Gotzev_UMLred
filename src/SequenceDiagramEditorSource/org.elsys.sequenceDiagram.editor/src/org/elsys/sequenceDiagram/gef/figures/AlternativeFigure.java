package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class AlternativeFigure extends OptionalFigure {
	private Point midlineLocation;
	private Label elseLabel = new Label("[ELSE]");
	public AlternativeFigure(String n, String c, Point m){
		super(n, c);
		midlineLocation = new Point(m);
		add(elseLabel, new Rectangle(7, midlineLocation.y+5, -1, -1));
	}
	
	public void setMidlineLocation(Point m){
		midlineLocation.setLocation(m);
		setConstraint(elseLabel, new Rectangle(7, midlineLocation.y+5, -1, -1));
		repaint();
	}
	
	@Override
	protected void paintFigure(Graphics g) {
		super.paintFigure(g);
		Rectangle r = getBounds();
		g.drawLine(new Point(r.x, r.y + midlineLocation.y), 
				new Point(r.x + getBounds().width, r.y + midlineLocation.y));
	}

}
