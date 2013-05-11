package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

public abstract class CombinedFragmentFigure extends Figure {
	protected Label name;
	protected RoundedRectangle rec;
	private static Color FG_COLOR = 
		new Color(ColorConstants.tooltipBackground.getDevice(), 80, 80, 80);
	private static Font TEXT_FONT = 
		new Font(ColorConstants.tooltipBackground.getDevice(), "Arial", 8, SWT.BOLD);
	public CombinedFragmentFigure(String n) {
		name = new Label(n);
		name.setFont(TEXT_FONT);
		setForegroundColor(FG_COLOR);
		rec = new RoundedRectangle();
		setLayoutManager(new XYLayout());
		if (name.getText() == "BREAK") {
			add(rec, new Rectangle(0, 0, 50, 20));
			add(name, new Rectangle(4, 3, -1, -1));
		} else {
			add(rec, new Rectangle(0, 0, 40, 20));
			add(name, new Rectangle(7, 3, -1, -1));
		}
		setOpaque(false);
	}

	public void setName(String n) {
		name.setText(n);
		repaint();
	}

	@Override
	protected void paintFigure(Graphics g) {
		Rectangle r = new Rectangle(getBounds());
		r.height -= 1;
		r.width -= 1;
		g.setForegroundColor(FG_COLOR);
		g.drawRoundRectangle(r, 10, 10);
	}
}
