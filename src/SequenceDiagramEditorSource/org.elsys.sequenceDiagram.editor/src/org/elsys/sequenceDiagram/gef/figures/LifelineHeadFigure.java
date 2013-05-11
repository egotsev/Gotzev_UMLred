package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;

public class LifelineHeadFigure extends RectangleFigure {
	private Label name;
	private static Color FG_COLOR = 
		new Color(ColorConstants.tooltipBackground.getDevice(), 113, 113, 113);
	private static Color BG_COLOR =
		new Color(ColorConstants.tooltipBackground.getDevice(), 234, 188, 116);
	private static Font TEXT_FONT = 
		new Font(ColorConstants.tooltipBackground.getDevice(), "Arial", 8, SWT.BOLD);
	
	public LifelineHeadFigure(String n) {
		name = new Label(n);
		name.setForegroundColor(FG_COLOR);
		name.setFont(TEXT_FONT);
		Label fictive = new Label("  ");
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		layout.setSpacing(4);
		layout.setStretchMinorAxis(false);
		setLayoutManager(layout);
		add(fictive);
		add(name);
		setOpaque(true);
		setLineWidth(3);
	}

	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension newDim = super.getPreferredSize(wHint, hHint);
		if (newDim.height < 50)
			newDim.height = 50;
		if (newDim.width < 100)
			newDim.width = 100;
		return newDim;

	}

	public void setName(String n) {
		name.setText("  "+n+"  ");
		repaint();
	}
	
	@Override
	public void paintFigure(Graphics graphics) {
		graphics.setForegroundColor(FG_COLOR);
		graphics.setBackgroundColor(BG_COLOR);
		super.paintFigure(graphics);
	}

}
