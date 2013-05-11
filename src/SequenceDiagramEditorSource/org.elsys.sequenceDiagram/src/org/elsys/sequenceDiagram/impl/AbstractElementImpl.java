/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.elsys.sequenceDiagram.AbstractElement;
import org.elsys.sequenceDiagram.SequenceDiagramPackage;

public abstract class AbstractElementImpl extends EObjectImpl implements
		AbstractElement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequenceDiagramPackage.Literals.ABSTRACT_ELEMENT;
	}

	public static final String SIZE = "size", SIZE_WIDTH = "width",
			SIZE_HEIGHT = "height", LOC = "location", LOC_X = "x", LOC_Y = "y",
			NAME = "name", TEXT = "text", CONDITION = "condition",
			CHILD = "children", SENT = "sent", RECEIVED = "received", CONNECTION="connection",
			TYPE = "type", BENDPOINT = "bendpoint";

	transient protected PropertyChangeSupport listeners = new PropertyChangeSupport(
			this);

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		listeners.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		listeners.removePropertyChangeListener(pcl);
	}

	protected void firePropertyChange(String propName, Object old,
			Object newValue) {
		listeners.firePropertyChange(propName, old, newValue);
	}

	// private void readObject(ObjectInputStream in) throws IOException,
	// ClassNotFoundException {
	// in.defaultReadObject();
	// listeners = new PropertyChangeSupport(this);
	// }

} // AbstractElementImpl
