package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.ParagraphTextLayout;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

public class NoteFigure extends Figure {
	private Label name;
	private FlowPage flowPage;
	private TextFlow text;
	private static Color FG_COLOR = 
		new Color(ColorConstants.tooltipBackground.getDevice(), 172, 172, 172);
	private static Color TEXT_FG_COLOR = 
		new Color(ColorConstants.tooltipBackground.getDevice(), 113, 113, 113);
	private static Font TEXT_FONT = 
		new Font(ColorConstants.tooltipBackground.getDevice(), "Arial", 9, SWT.BOLD | SWT.ITALIC);
	public NoteFigure(Rectangle b, String n, String t){
		bounds = b;
		name = new Label(n);
		name.setFont(TEXT_FONT);
		name.setForegroundColor(TEXT_FG_COLOR);
		setOpaque(false);
		setBackgroundColor(ColorConstants.button);
		flowPage = new FlowPage();
		text = new TextFlow(t);
		text.setLayoutManager(new ParagraphTextLayout(text));
		text.setOpaque(false);
		text.setForegroundColor(TEXT_FG_COLOR);
		flowPage.add(text);
		setLayoutManager(new XYLayout());
		add(name, new Rectangle(5, 5, -1, -1));
		add(flowPage);
	}
	
	public NoteFigure() {}
	
	public void setName(String n){
		name.setText(n);
		repaint();
	}
	
	public void setText(String t){
		text.setText(t);
		repaint();
	}
	
	@Override
	protected void paintFigure(Graphics g) {
		super.paintFigure(g);
		g.setForegroundColor(FG_COLOR);
		Rectangle r = getBounds();
		g.drawRectangle(r.x, r.y, r.width -1, r.height -1);
		g.drawLine(r.x, r.y + 21, r.x + r.width - 1, r.y + 21);
	}

	public void setFlowPageConstraint() {
		setConstraint(flowPage, new Rectangle(5, 26, getBounds().width - 2, getBounds().height));
		repaint();
	}
}
