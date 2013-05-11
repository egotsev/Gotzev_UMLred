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
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.Diagram#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.Diagram#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.Diagram#getCombinedFragments <em>Combined Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Lifelines</b></em>' containment reference list.
	 * The list contents are of type {@link org.elsys.sequenceDiagram.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifelines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifelines</em>' containment reference list.
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getDiagram_Lifelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lifeline> getLifelines();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.elsys.sequenceDiagram.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getDiagram_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Combined Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link org.elsys.sequenceDiagram.CombinedFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Fragments</em>' containment reference list.
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getDiagram_CombinedFragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<CombinedFragment> getCombinedFragments();
	
	void addElement(AbstractDiagramElement e);
	void removeElement(AbstractDiagramElement e);

} // Diagram
