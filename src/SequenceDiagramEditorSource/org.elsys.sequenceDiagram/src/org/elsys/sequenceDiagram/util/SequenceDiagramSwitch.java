/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.elsys.sequenceDiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage
 * @generated
 */
public class SequenceDiagramSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SequenceDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = SequenceDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SequenceDiagramPackage.ABSTRACT_ELEMENT: {
				AbstractElement abstractElement = (AbstractElement)theEObject;
				T result = caseAbstractElement(abstractElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = caseAbstractElement(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.ABSTRACT_DIAGRAM_ELEMENT: {
				AbstractDiagramElement abstractDiagramElement = (AbstractDiagramElement)theEObject;
				T result = caseAbstractDiagramElement(abstractDiagramElement);
				if (result == null) result = caseAbstractElement(abstractDiagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.LIFELINE: {
				Lifeline lifeline = (Lifeline)theEObject;
				T result = caseLifeline(lifeline);
				if (result == null) result = caseAbstractDiagramElement(lifeline);
				if (result == null) result = caseAbstractElement(lifeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.ACTIVATION_BAR: {
				ActivationBar activationBar = (ActivationBar)theEObject;
				T result = caseActivationBar(activationBar);
				if (result == null) result = caseAbstractElement(activationBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseAbstractElement(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.RETURN_CONNECTION: {
				ReturnConnection returnConnection = (ReturnConnection)theEObject;
				T result = caseReturnConnection(returnConnection);
				if (result == null) result = caseConnection(returnConnection);
				if (result == null) result = caseAbstractElement(returnConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.SEND_CONNECTION: {
				SendConnection sendConnection = (SendConnection)theEObject;
				T result = caseSendConnection(sendConnection);
				if (result == null) result = caseConnection(sendConnection);
				if (result == null) result = caseAbstractElement(sendConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.RESIZABLE_DIAGRAM_ELEMENT: {
				ResizableDiagramElement resizableDiagramElement = (ResizableDiagramElement)theEObject;
				T result = caseResizableDiagramElement(resizableDiagramElement);
				if (result == null) result = caseAbstractDiagramElement(resizableDiagramElement);
				if (result == null) result = caseAbstractElement(resizableDiagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.COMBINED_FRAGMENT: {
				CombinedFragment combinedFragment = (CombinedFragment)theEObject;
				T result = caseCombinedFragment(combinedFragment);
				if (result == null) result = caseResizableDiagramElement(combinedFragment);
				if (result == null) result = caseAbstractDiagramElement(combinedFragment);
				if (result == null) result = caseAbstractElement(combinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.MIDLINE_COMBINED_FRAGMENT: {
				MidlineCombinedFragment midlineCombinedFragment = (MidlineCombinedFragment)theEObject;
				T result = caseMidlineCombinedFragment(midlineCombinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.PARALLEL_COMBINED_FRAGMENT: {
				ParallelCombinedFragment parallelCombinedFragment = (ParallelCombinedFragment)theEObject;
				T result = caseParallelCombinedFragment(parallelCombinedFragment);
				if (result == null) result = caseCombinedFragment(parallelCombinedFragment);
				if (result == null) result = caseMidlineCombinedFragment(parallelCombinedFragment);
				if (result == null) result = caseResizableDiagramElement(parallelCombinedFragment);
				if (result == null) result = caseAbstractDiagramElement(parallelCombinedFragment);
				if (result == null) result = caseAbstractElement(parallelCombinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.OPTIONAL_COMBINED_FRAGMENT: {
				OptionalCombinedFragment optionalCombinedFragment = (OptionalCombinedFragment)theEObject;
				T result = caseOptionalCombinedFragment(optionalCombinedFragment);
				if (result == null) result = caseCombinedFragment(optionalCombinedFragment);
				if (result == null) result = caseResizableDiagramElement(optionalCombinedFragment);
				if (result == null) result = caseAbstractDiagramElement(optionalCombinedFragment);
				if (result == null) result = caseAbstractElement(optionalCombinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT: {
				AlternativeCombinedFragment alternativeCombinedFragment = (AlternativeCombinedFragment)theEObject;
				T result = caseAlternativeCombinedFragment(alternativeCombinedFragment);
				if (result == null) result = caseOptionalCombinedFragment(alternativeCombinedFragment);
				if (result == null) result = caseMidlineCombinedFragment(alternativeCombinedFragment);
				if (result == null) result = caseCombinedFragment(alternativeCombinedFragment);
				if (result == null) result = caseResizableDiagramElement(alternativeCombinedFragment);
				if (result == null) result = caseAbstractDiagramElement(alternativeCombinedFragment);
				if (result == null) result = caseAbstractElement(alternativeCombinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.BREAK_COMBINED_FRAGMENT: {
				BreakCombinedFragment breakCombinedFragment = (BreakCombinedFragment)theEObject;
				T result = caseBreakCombinedFragment(breakCombinedFragment);
				if (result == null) result = caseOptionalCombinedFragment(breakCombinedFragment);
				if (result == null) result = caseCombinedFragment(breakCombinedFragment);
				if (result == null) result = caseResizableDiagramElement(breakCombinedFragment);
				if (result == null) result = caseAbstractDiagramElement(breakCombinedFragment);
				if (result == null) result = caseAbstractElement(breakCombinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.LOOP_COMBINED_FRAGMENT: {
				LoopCombinedFragment loopCombinedFragment = (LoopCombinedFragment)theEObject;
				T result = caseLoopCombinedFragment(loopCombinedFragment);
				if (result == null) result = caseOptionalCombinedFragment(loopCombinedFragment);
				if (result == null) result = caseCombinedFragment(loopCombinedFragment);
				if (result == null) result = caseResizableDiagramElement(loopCombinedFragment);
				if (result == null) result = caseAbstractDiagramElement(loopCombinedFragment);
				if (result == null) result = caseAbstractElement(loopCombinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.OPTION_COMBINED_FRAGMENT: {
				OptionCombinedFragment optionCombinedFragment = (OptionCombinedFragment)theEObject;
				T result = caseOptionCombinedFragment(optionCombinedFragment);
				if (result == null) result = caseOptionalCombinedFragment(optionCombinedFragment);
				if (result == null) result = caseCombinedFragment(optionCombinedFragment);
				if (result == null) result = caseResizableDiagramElement(optionCombinedFragment);
				if (result == null) result = caseAbstractDiagramElement(optionCombinedFragment);
				if (result == null) result = caseAbstractElement(optionCombinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseResizableDiagramElement(note);
				if (result == null) result = caseAbstractDiagramElement(note);
				if (result == null) result = caseAbstractElement(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SequenceDiagramPackage.BEND_POINT: {
				BendPoint bendPoint = (BendPoint)theEObject;
				T result = caseBendPoint(bendPoint);
				if (result == null) result = caseAbstractElement(bendPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractElement(AbstractElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDiagramElement(AbstractDiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationBar(ActivationBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnConnection(ReturnConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendConnection(SendConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resizable Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resizable Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResizableDiagramElement(ResizableDiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midline Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midline Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidlineCombinedFragment(MidlineCombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelCombinedFragment(ParallelCombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakCombinedFragment(BreakCombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalCombinedFragment(OptionalCombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopCombinedFragment(LoopCombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionCombinedFragment(OptionCombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeCombinedFragment(AlternativeCombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bend Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bend Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBendPoint(BendPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SequenceDiagramSwitch
