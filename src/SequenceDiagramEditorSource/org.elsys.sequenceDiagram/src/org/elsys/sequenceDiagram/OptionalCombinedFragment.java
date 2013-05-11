/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.OptionalCombinedFragment#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getOptionalCombinedFragment()
 * @model abstract="true"
 * @generated
 */
public interface OptionalCombinedFragment extends CombinedFragment {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getOptionalCombinedFragment_Condition()
	 * @model default=""
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.OptionalCombinedFragment#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // OptionalCombinedFragment
