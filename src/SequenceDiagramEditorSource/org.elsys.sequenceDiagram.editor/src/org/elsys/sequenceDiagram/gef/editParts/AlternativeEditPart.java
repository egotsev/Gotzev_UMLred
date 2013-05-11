package org.elsys.sequenceDiagram.gef.editParts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.AlternativeCombinedFragment;
import org.elsys.sequenceDiagram.gef.figures.AlternativeFigure;
import org.elsys.sequenceDiagram.impl.AbstractElementImpl;

public class AlternativeEditPart extends CombinedFragmentEditPart {

	@Override
	protected IFigure createFigure() {
		AlternativeCombinedFragment alt = getCastedModel();
		AlternativeFigure f = new AlternativeFigure("ALT", alt.getCondition(),
				new Point(0, alt.getMidlineY()));
		return f;
	}

	private AlternativeCombinedFragment getCastedModel() {
		return (AlternativeCombinedFragment) getModel();
	}

	private AlternativeFigure getAlternativeFigure() {
		return (AlternativeFigure) getFigure();
	}

	@Override
	protected void refreshVisuals() {
		Rectangle r = new Rectangle(getCastedModel().getX(), getCastedModel()
				.getY(), getCastedModel().getWidth(), getCastedModel()
				.getHeight());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getAlternativeFigure(), r);
		getAlternativeFigure().setCondition(getCastedModel().getCondition());
		getAlternativeFigure().setMidlineLocation(
				new Point(0, getCastedModel().getMidlineY()));

	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] {
				new TextPropertyDescriptor(AbstractElementImpl.CONDITION, "If-Else Condition"),
				new TextPropertyDescriptor(AbstractElementImpl.LOC,
						"Middle line Y") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(AbstractElementImpl.CONDITION))
			return getCastedModel().getCondition();
		else if (id.equals(AbstractElementImpl.LOC))
			return getCastedModel().getMidlineY()+"";

		return null;
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		if (id.equals(AbstractElementImpl.CONDITION))
			getCastedModel().setCondition((String) value);
		else if (id.equals(AbstractElementImpl.LOC))
			try {
				getCastedModel().setMidlineY(Integer.parseInt((String) value));
			} catch (NumberFormatException e) {
			}
	}

}
