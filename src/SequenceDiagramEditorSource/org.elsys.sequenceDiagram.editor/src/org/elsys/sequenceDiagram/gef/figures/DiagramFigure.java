package org.elsys.sequenceDiagram.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ScalableFreeformLayeredPane;

public class DiagramFigure extends FreeformLayer {
	public DiagramFigure() {
		new FreeformLayer();
		setLayoutManager(new FreeformLayout());
		setBorder(new MarginBorder(5));
	}
}
