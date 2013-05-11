/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram;

import java.beans.PropertyChangeListener;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getAbstractElement()
 * @model abstract="true"
 * @author Emil Gotsev
 */
public interface AbstractElement extends EObject {
	public void addPropertyChangeListener(PropertyChangeListener pcl);
	public void removePropertyChangeListener(PropertyChangeListener pcl);
} // AbstractElement
