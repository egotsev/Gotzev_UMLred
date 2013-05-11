/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.elsys.sequenceDiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceDiagramFactoryImpl extends EFactoryImpl implements SequenceDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SequenceDiagramFactory init() {
		try {
			SequenceDiagramFactory theSequenceDiagramFactory = (SequenceDiagramFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.elsys.sequenceDiagram"); 
			if (theSequenceDiagramFactory != null) {
				return theSequenceDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SequenceDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SequenceDiagramPackage.DIAGRAM: return createDiagram();
			case SequenceDiagramPackage.LIFELINE: return createLifeline();
			case SequenceDiagramPackage.ACTIVATION_BAR: return createActivationBar();
			case SequenceDiagramPackage.RETURN_CONNECTION: return createReturnConnection();
			case SequenceDiagramPackage.SEND_CONNECTION: return createSendConnection();
			case SequenceDiagramPackage.PARALLEL_COMBINED_FRAGMENT: return createParallelCombinedFragment();
			case SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT: return createAlternativeCombinedFragment();
			case SequenceDiagramPackage.BREAK_COMBINED_FRAGMENT: return createBreakCombinedFragment();
			case SequenceDiagramPackage.LOOP_COMBINED_FRAGMENT: return createLoopCombinedFragment();
			case SequenceDiagramPackage.OPTION_COMBINED_FRAGMENT: return createOptionCombinedFragment();
			case SequenceDiagramPackage.NOTE: return createNote();
			case SequenceDiagramPackage.BEND_POINT: return createBendPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SequenceDiagramPackage.SEND_CONNECTION_TYPE:
				return createSendConnectionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SequenceDiagramPackage.SEND_CONNECTION_TYPE:
				return convertSendConnectionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationBar createActivationBar() {
		ActivationBarImpl activationBar = new ActivationBarImpl();
		return activationBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnConnection createReturnConnection() {
		ReturnConnectionImpl returnConnection = new ReturnConnectionImpl();
		return returnConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendConnection createSendConnection() {
		SendConnectionImpl sendConnection = new SendConnectionImpl();
		return sendConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelCombinedFragment createParallelCombinedFragment() {
		ParallelCombinedFragmentImpl parallelCombinedFragment = new ParallelCombinedFragmentImpl();
		return parallelCombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakCombinedFragment createBreakCombinedFragment() {
		BreakCombinedFragmentImpl breakCombinedFragment = new BreakCombinedFragmentImpl();
		return breakCombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCombinedFragment createLoopCombinedFragment() {
		LoopCombinedFragmentImpl loopCombinedFragment = new LoopCombinedFragmentImpl();
		return loopCombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionCombinedFragment createOptionCombinedFragment() {
		OptionCombinedFragmentImpl optionCombinedFragment = new OptionCombinedFragmentImpl();
		return optionCombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeCombinedFragment createAlternativeCombinedFragment() {
		AlternativeCombinedFragmentImpl alternativeCombinedFragment = new AlternativeCombinedFragmentImpl();
		return alternativeCombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BendPoint createBendPoint() {
		BendPointImpl bendPoint = new BendPointImpl();
		return bendPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendConnectionType createSendConnectionTypeFromString(EDataType eDataType, String initialValue) {
		SendConnectionType result = SendConnectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSendConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagramPackage getSequenceDiagramPackage() {
		return (SequenceDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SequenceDiagramPackage getPackage() {
		return SequenceDiagramPackage.eINSTANCE;
	}

} //SequenceDiagramFactoryImpl
