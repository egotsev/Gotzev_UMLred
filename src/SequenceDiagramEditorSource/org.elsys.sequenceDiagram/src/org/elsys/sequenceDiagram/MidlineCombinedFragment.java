/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Midline Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.MidlineCombinedFragment#getMidlineY <em>Midline Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getMidlineCombinedFragment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MidlineCombinedFragment extends EObject {
	/**
	 * Returns the value of the '<em><b>Midline Y</b></em>' attribute.
	 * The default value is <code>"25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midline Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midline Y</em>' attribute.
	 * @see #setMidlineY(int)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getMidlineCombinedFragment_MidlineY()
	 * @model default="25"
	 * @generated
	 */
	int getMidlineY();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.MidlineCombinedFragment#getMidlineY <em>Midline Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midline Y</em>' attribute.
	 * @see #getMidlineY()
	 * @generated
	 */
	void setMidlineY(int value);

} // MidlineCombinedFragment
