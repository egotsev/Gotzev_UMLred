package org.elsys.sequenceDiagram.gef.editParts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.elsys.sequenceDiagram.BreakCombinedFragment;
import org.elsys.sequenceDiagram.gef.figures.OptionalFigure;
import org.elsys.sequenceDiagram.impl.AbstractElementImpl;

public class BreakEditPart extends CombinedFragmentEditPart {

	@Override
	protected IFigure createFigure() {
		BreakCombinedFragment br = getCastedModel();
		OptionalFigure f = new OptionalFigure("BREAK", br.getCondition());
		return f;
	}

	private BreakCombinedFragment getCastedModel() {
		return (BreakCombinedFragment) getModel();
	}
	
	private OptionalFigure getOptionalFigure() {
		return (OptionalFigure) getFigure();
	}
	
	@Override
	protected void refreshVisuals() {
		Rectangle r = new Rectangle(getCastedModel().getX(), getCastedModel().getY(), 
				getCastedModel().getWidth(), getCastedModel().getHeight());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, getOptionalFigure(), r);
		getOptionalFigure().setCondition(getCastedModel().getCondition());
	}
	
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] {
				new TextPropertyDescriptor(AbstractElementImpl.CONDITION, "Break Condition") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(AbstractElementImpl.CONDITION))
			return getCastedModel().getCondition();

		return null;
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		if (id.equals(AbstractElementImpl.CONDITION))
			getCastedModel().setCondition((String) value);

	}

}
