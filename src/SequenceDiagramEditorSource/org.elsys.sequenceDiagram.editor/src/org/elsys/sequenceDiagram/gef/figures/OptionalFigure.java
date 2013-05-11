package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

public class OptionalFigure extends CombinedFragmentFigure {
	protected Label condition;
	private static Color CONDITION_COLOR = 
		new Color(ColorConstants.tooltipBackground.getDevice(), 56, 108, 171);
	private static Font CONDITION_FONT = 
		new Font(ColorConstants.tooltipBackground.getDevice(), "Arial", 9, SWT.NORMAL);
	public OptionalFigure(String n, String c) {
		super(n);
		condition = new Label(c);
		condition.setForegroundColor(CONDITION_COLOR);
		condition.setOpaque(true);
		condition.setFont(CONDITION_FONT);
		if (name.getText()=="BREAK")
			add(condition, new Rectangle(55, 4, -1, -1));
		else
			add(condition, new Rectangle(45, 4, -1, -1));
	}
	public void setCondition(String c){
		condition.setText(c);
		repaint();
	}
}
