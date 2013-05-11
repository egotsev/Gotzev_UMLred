package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.geometry.Dimension;

public class LifelineBodyFigure extends Figure {
	public LifelineBodyFigure(){
		FlowLayout layout = new FlowLayout();
		layout.setMinorAlignment(FlowLayout.ALIGN_CENTER);
		layout.setHorizontal(false);
		layout.setMinorSpacing(15);
		layout.setStretchMinorAxis(false);
		setLayoutManager(layout);
	}
	
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension dim = super.getPreferredSize(wHint, hHint);
		if (dim.height < 20) dim.height = 20;
		if (dim.width < 21) dim.width = 21;
		return dim;
	}
}
