package org.elsys.sequenceDiagram.gef.editParts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.ParallelCombinedFragment;
import org.elsys.sequenceDiagram.gef.figures.ParallelFigure;
import org.elsys.sequenceDiagram.impl.AbstractElementImpl;

public class ParallelEditPart extends CombinedFragmentEditPart {

	@Override
	protected IFigure createFigure() {
		ParallelCombinedFragment par = getCastedModel();
		ParallelFigure f = new ParallelFigure("PAR", new Point(par.getX(),
				par.getY()));
		return f;
	}

	private ParallelCombinedFragment getCastedModel() {
		return (ParallelCombinedFragment) getModel();
	}

	private ParallelFigure getParallelFigure() {
		return (ParallelFigure) getFigure();
	}

	@Override
	protected void refreshVisuals() {
		Rectangle r = new Rectangle(getCastedModel().getX(), getCastedModel()
				.getY(), getCastedModel().getWidth(), getCastedModel()
				.getHeight());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getParallelFigure(), r);
		getParallelFigure().setMidlineLocation(
				new Point(0, getCastedModel().getMidlineY()));
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] { new TextPropertyDescriptor(
				AbstractElementImpl.LOC, "Middle line Y") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(AbstractElementImpl.LOC))
			return getCastedModel().getMidlineY()+"";

		return null;
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		try {
			if (id.equals(AbstractElementImpl.LOC))
				getCastedModel().setMidlineY(Integer.parseInt((String) value));
		} catch (NumberFormatException e) {
		}
	}
}
