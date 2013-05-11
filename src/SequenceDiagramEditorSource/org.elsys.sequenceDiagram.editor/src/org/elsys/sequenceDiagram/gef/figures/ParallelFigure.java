package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class ParallelFigure extends CombinedFragmentFigure {
	private Point midlineLocation;
	public ParallelFigure(String n, Point m) {
		super(n);
		midlineLocation = new Point(m);
	}
	
	public void setMidlineLocation(Point m){
		midlineLocation.setLocation(m);
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
