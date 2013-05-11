/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage
 * @generated
 */
public interface SequenceDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequenceDiagramFactory eINSTANCE = org.elsys.sequenceDiagram.impl.SequenceDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * Returns a new object of class '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lifeline</em>'.
	 * @generated
	 */
	Lifeline createLifeline();

	/**
	 * Returns a new object of class '<em>Activation Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Bar</em>'.
	 * @generated
	 */
	ActivationBar createActivationBar();

	/**
	 * Returns a new object of class '<em>Return Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Connection</em>'.
	 * @generated
	 */
	ReturnConnection createReturnConnection();

	/**
	 * Returns a new object of class '<em>Send Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Connection</em>'.
	 * @generated
	 */
	SendConnection createSendConnection();

	/**
	 * Returns a new object of class '<em>Parallel Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Combined Fragment</em>'.
	 * @generated
	 */
	ParallelCombinedFragment createParallelCombinedFragment();

	/**
	 * Returns a new object of class '<em>Break Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Combined Fragment</em>'.
	 * @generated
	 */
	BreakCombinedFragment createBreakCombinedFragment();

	/**
	 * Returns a new object of class '<em>Loop Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Combined Fragment</em>'.
	 * @generated
	 */
	LoopCombinedFragment createLoopCombinedFragment();

	/**
	 * Returns a new object of class '<em>Option Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Combined Fragment</em>'.
	 * @generated
	 */
	OptionCombinedFragment createOptionCombinedFragment();

	/**
	 * Returns a new object of class '<em>Alternative Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Combined Fragment</em>'.
	 * @generated
	 */
	AlternativeCombinedFragment createAlternativeCombinedFragment();

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	Note createNote();

	/**
	 * Returns a new object of class '<em>Bend Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bend Point</em>'.
	 * @generated
	 */
	BendPoint createBendPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SequenceDiagramPackage getSequenceDiagramPackage();

} //SequenceDiagramFactory
