/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.Lifeline#getName <em>Name</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.Lifeline#getActivationBars <em>Activation Bars</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends AbstractDiagramElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Lifeline"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getLifeline_Name()
	 * @model default="Lifeline"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.Lifeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activation Bars</b></em>' containment reference list.
	 * The list contents are of type {@link org.elsys.sequenceDiagram.ActivationBar}.
	 * It is bidirectional and its opposite is '{@link org.elsys.sequenceDiagram.ActivationBar#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Bars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Bars</em>' containment reference list.
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getLifeline_ActivationBars()
	 * @see org.elsys.sequenceDiagram.ActivationBar#getLifeline
	 * @model opposite="lifeline" containment="true"
	 * @generated
	 */
	EList<ActivationBar> getActivationBars();
	void addActivationBar(int index, ActivationBar bar);
	void removeActivationBar(ActivationBar bar);
	void moveActivationBar(int index, ActivationBar bar);
} // Lifeline
