package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.DeviceData;
import org.eclipse.swt.graphics.GCData;

public class LifelineFigure extends Figure {

	public LifelineFigure(Rectangle rect) {
		setBounds(rect);
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		layout.setSpacing(25);
		layout.setStretchMinorAxis(false);
		setLayoutManager(layout);
		setOpaque(true);
	}

	public LifelineFigure() {
	}

	protected void paintFigure(Graphics g) {
		Rectangle r = getBounds();
		Device device = g.getFont().getDevice();
		Color color = new Color(device, 113, 113, 113);
		g.setForegroundColor(color);
		g.drawLine(r.x + r.width / 2, r.y, r.x + r.width / 2, r.y + r.height);
		g.drawLine(r.x + r.width / 2-1, r.y, r.x + r.width / 2-1, r.y + r.height);
		g.drawLine(r.x + r.width / 2-2, r.y, r.x + r.width / 2-2, r.y + r.height);
		color.dispose();
	}

	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension newDim = super.getPreferredSize(wHint, hHint);
		if (newDim.height < 60)
			newDim.height = 60;
		if (newDim.width < 100)
			newDim.width = 100;
		return newDim;
	}

}
