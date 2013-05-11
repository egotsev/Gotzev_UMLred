/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.elsys.sequenceDiagram.SequenceDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface SequenceDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequenceDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.elsys.sequenceDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.elsys.sequenceDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequenceDiagramPackage eINSTANCE = org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.AbstractElementImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getAbstractElement()
	 * @generated
	 */
	int ABSTRACT_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.DiagramImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Lifelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LIFELINES = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NOTES = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Combined Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__COMBINED_FRAGMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.AbstractDiagramElementImpl <em>Abstract Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.AbstractDiagramElementImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getAbstractDiagramElement()
	 * @generated
	 */
	int ABSTRACT_DIAGRAM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIAGRAM_ELEMENT__X = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIAGRAM_ELEMENT__Y = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.LifelineImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__X = ABSTRACT_DIAGRAM_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__Y = ABSTRACT_DIAGRAM_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__ACTIVATION_BARS = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.ActivationBarImpl <em>Activation Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.ActivationBarImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getActivationBar()
	 * @generated
	 */
	int ACTIVATION_BAR = 4;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_BAR__LIFELINE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sent Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_BAR__SENT_CONNECTIONS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Received Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_BAR__RECEIVED_CONNECTIONS = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_BAR__HEIGHT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activation Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_BAR_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.ConnectionImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SENDER = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__RECEIVER = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MESSAGE = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bend Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BEND_POINTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.ReturnConnectionImpl <em>Return Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.ReturnConnectionImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getReturnConnection()
	 * @generated
	 */
	int RETURN_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONNECTION__SENDER = CONNECTION__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONNECTION__RECEIVER = CONNECTION__RECEIVER;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONNECTION__MESSAGE = CONNECTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Bend Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONNECTION__BEND_POINTS = CONNECTION__BEND_POINTS;

	/**
	 * The number of structural features of the '<em>Return Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.SendConnectionImpl <em>Send Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.SendConnectionImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getSendConnection()
	 * @generated
	 */
	int SEND_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_CONNECTION__SENDER = CONNECTION__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_CONNECTION__RECEIVER = CONNECTION__RECEIVER;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_CONNECTION__MESSAGE = CONNECTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Bend Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_CONNECTION__BEND_POINTS = CONNECTION__BEND_POINTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_CONNECTION__TYPE = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.ResizableDiagramElementImpl <em>Resizable Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.ResizableDiagramElementImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getResizableDiagramElement()
	 * @generated
	 */
	int RESIZABLE_DIAGRAM_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZABLE_DIAGRAM_ELEMENT__X = ABSTRACT_DIAGRAM_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZABLE_DIAGRAM_ELEMENT__Y = ABSTRACT_DIAGRAM_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZABLE_DIAGRAM_ELEMENT__WIDTH = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZABLE_DIAGRAM_ELEMENT__HEIGHT = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resizable Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZABLE_DIAGRAM_ELEMENT_FEATURE_COUNT = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.CombinedFragmentImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getCombinedFragment()
	 * @generated
	 */
	int COMBINED_FRAGMENT = 9;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__X = RESIZABLE_DIAGRAM_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__Y = RESIZABLE_DIAGRAM_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__WIDTH = RESIZABLE_DIAGRAM_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__HEIGHT = RESIZABLE_DIAGRAM_ELEMENT__HEIGHT;

	/**
	 * The number of structural features of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_FEATURE_COUNT = RESIZABLE_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.MidlineCombinedFragment <em>Midline Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.MidlineCombinedFragment
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getMidlineCombinedFragment()
	 * @generated
	 */
	int MIDLINE_COMBINED_FRAGMENT = 10;

	/**
	 * The feature id for the '<em><b>Midline Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDLINE_COMBINED_FRAGMENT__MIDLINE_Y = 0;

	/**
	 * The number of structural features of the '<em>Midline Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDLINE_COMBINED_FRAGMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.ParallelCombinedFragmentImpl <em>Parallel Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.ParallelCombinedFragmentImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getParallelCombinedFragment()
	 * @generated
	 */
	int PARALLEL_COMBINED_FRAGMENT = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_COMBINED_FRAGMENT__X = COMBINED_FRAGMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_COMBINED_FRAGMENT__Y = COMBINED_FRAGMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_COMBINED_FRAGMENT__WIDTH = COMBINED_FRAGMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_COMBINED_FRAGMENT__HEIGHT = COMBINED_FRAGMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Midline Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_COMBINED_FRAGMENT__MIDLINE_Y = COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_COMBINED_FRAGMENT_FEATURE_COUNT = COMBINED_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.OptionalCombinedFragmentImpl <em>Optional Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.OptionalCombinedFragmentImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getOptionalCombinedFragment()
	 * @generated
	 */
	int OPTIONAL_COMBINED_FRAGMENT = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COMBINED_FRAGMENT__X = COMBINED_FRAGMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COMBINED_FRAGMENT__Y = COMBINED_FRAGMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COMBINED_FRAGMENT__WIDTH = COMBINED_FRAGMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COMBINED_FRAGMENT__HEIGHT = COMBINED_FRAGMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COMBINED_FRAGMENT__CONDITION = COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optional Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COMBINED_FRAGMENT_FEATURE_COUNT = COMBINED_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.BreakCombinedFragmentImpl <em>Break Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.BreakCombinedFragmentImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getBreakCombinedFragment()
	 * @generated
	 */
	int BREAK_COMBINED_FRAGMENT = 14;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.LoopCombinedFragmentImpl <em>Loop Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.LoopCombinedFragmentImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getLoopCombinedFragment()
	 * @generated
	 */
	int LOOP_COMBINED_FRAGMENT = 15;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.AlternativeCombinedFragmentImpl <em>Alternative Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.AlternativeCombinedFragmentImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getAlternativeCombinedFragment()
	 * @generated
	 */
	int ALTERNATIVE_COMBINED_FRAGMENT = 13;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.OptionCombinedFragmentImpl <em>Option Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.OptionCombinedFragmentImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getOptionCombinedFragment()
	 * @generated
	 */
	int OPTION_COMBINED_FRAGMENT = 16;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_COMBINED_FRAGMENT__X = OPTIONAL_COMBINED_FRAGMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_COMBINED_FRAGMENT__Y = OPTIONAL_COMBINED_FRAGMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_COMBINED_FRAGMENT__WIDTH = OPTIONAL_COMBINED_FRAGMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_COMBINED_FRAGMENT__HEIGHT = OPTIONAL_COMBINED_FRAGMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_COMBINED_FRAGMENT__CONDITION = OPTIONAL_COMBINED_FRAGMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Midline Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_COMBINED_FRAGMENT__MIDLINE_Y = OPTIONAL_COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_COMBINED_FRAGMENT_FEATURE_COUNT = OPTIONAL_COMBINED_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_COMBINED_FRAGMENT__X = OPTIONAL_COMBINED_FRAGMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_COMBINED_FRAGMENT__Y = OPTIONAL_COMBINED_FRAGMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_COMBINED_FRAGMENT__WIDTH = OPTIONAL_COMBINED_FRAGMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_COMBINED_FRAGMENT__HEIGHT = OPTIONAL_COMBINED_FRAGMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_COMBINED_FRAGMENT__CONDITION = OPTIONAL_COMBINED_FRAGMENT__CONDITION;

	/**
	 * The number of structural features of the '<em>Break Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_COMBINED_FRAGMENT_FEATURE_COUNT = OPTIONAL_COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COMBINED_FRAGMENT__X = OPTIONAL_COMBINED_FRAGMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COMBINED_FRAGMENT__Y = OPTIONAL_COMBINED_FRAGMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COMBINED_FRAGMENT__WIDTH = OPTIONAL_COMBINED_FRAGMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COMBINED_FRAGMENT__HEIGHT = OPTIONAL_COMBINED_FRAGMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COMBINED_FRAGMENT__CONDITION = OPTIONAL_COMBINED_FRAGMENT__CONDITION;

	/**
	 * The number of structural features of the '<em>Loop Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COMBINED_FRAGMENT_FEATURE_COUNT = OPTIONAL_COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_COMBINED_FRAGMENT__X = OPTIONAL_COMBINED_FRAGMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_COMBINED_FRAGMENT__Y = OPTIONAL_COMBINED_FRAGMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_COMBINED_FRAGMENT__WIDTH = OPTIONAL_COMBINED_FRAGMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_COMBINED_FRAGMENT__HEIGHT = OPTIONAL_COMBINED_FRAGMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_COMBINED_FRAGMENT__CONDITION = OPTIONAL_COMBINED_FRAGMENT__CONDITION;

	/**
	 * The number of structural features of the '<em>Option Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_COMBINED_FRAGMENT_FEATURE_COUNT = OPTIONAL_COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.NoteImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 17;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__X = RESIZABLE_DIAGRAM_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__Y = RESIZABLE_DIAGRAM_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__WIDTH = RESIZABLE_DIAGRAM_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__HEIGHT = RESIZABLE_DIAGRAM_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NAME = RESIZABLE_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TEXT = RESIZABLE_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = RESIZABLE_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.impl.BendPointImpl <em>Bend Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.impl.BendPointImpl
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getBendPoint()
	 * @generated
	 */
	int BEND_POINT = 18;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT__X = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT__Y = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bend Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.elsys.sequenceDiagram.SendConnectionType <em>Send Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.elsys.sequenceDiagram.SendConnectionType
	 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getSendConnectionType()
	 * @generated
	 */
	int SEND_CONNECTION_TYPE = 19;

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element</em>'.
	 * @see org.elsys.sequenceDiagram.AbstractElement
	 * @generated
	 */
	EClass getAbstractElement();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.elsys.sequenceDiagram.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.elsys.sequenceDiagram.Diagram#getLifelines <em>Lifelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifelines</em>'.
	 * @see org.elsys.sequenceDiagram.Diagram#getLifelines()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Lifelines();

	/**
	 * Returns the meta object for the containment reference list '{@link org.elsys.sequenceDiagram.Diagram#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see org.elsys.sequenceDiagram.Diagram#getNotes()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.elsys.sequenceDiagram.Diagram#getCombinedFragments <em>Combined Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combined Fragments</em>'.
	 * @see org.elsys.sequenceDiagram.Diagram#getCombinedFragments()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_CombinedFragments();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.AbstractDiagramElement <em>Abstract Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Diagram Element</em>'.
	 * @see org.elsys.sequenceDiagram.AbstractDiagramElement
	 * @generated
	 */
	EClass getAbstractDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.AbstractDiagramElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.elsys.sequenceDiagram.AbstractDiagramElement#getX()
	 * @see #getAbstractDiagramElement()
	 * @generated
	 */
	EAttribute getAbstractDiagramElement_X();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.AbstractDiagramElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.elsys.sequenceDiagram.AbstractDiagramElement#getY()
	 * @see #getAbstractDiagramElement()
	 * @generated
	 */
	EAttribute getAbstractDiagramElement_Y();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see org.elsys.sequenceDiagram.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.Lifeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.elsys.sequenceDiagram.Lifeline#getName()
	 * @see #getLifeline()
	 * @generated
	 */
	EAttribute getLifeline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.elsys.sequenceDiagram.Lifeline#getActivationBars <em>Activation Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Bars</em>'.
	 * @see org.elsys.sequenceDiagram.Lifeline#getActivationBars()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_ActivationBars();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.ActivationBar <em>Activation Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Bar</em>'.
	 * @see org.elsys.sequenceDiagram.ActivationBar
	 * @generated
	 */
	EClass getActivationBar();

	/**
	 * Returns the meta object for the container reference '{@link org.elsys.sequenceDiagram.ActivationBar#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lifeline</em>'.
	 * @see org.elsys.sequenceDiagram.ActivationBar#getLifeline()
	 * @see #getActivationBar()
	 * @generated
	 */
	EReference getActivationBar_Lifeline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.elsys.sequenceDiagram.ActivationBar#getSentConnections <em>Sent Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sent Connections</em>'.
	 * @see org.elsys.sequenceDiagram.ActivationBar#getSentConnections()
	 * @see #getActivationBar()
	 * @generated
	 */
	EReference getActivationBar_SentConnections();

	/**
	 * Returns the meta object for the reference list '{@link org.elsys.sequenceDiagram.ActivationBar#getReceivedConnections <em>Received Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Received Connections</em>'.
	 * @see org.elsys.sequenceDiagram.ActivationBar#getReceivedConnections()
	 * @see #getActivationBar()
	 * @generated
	 */
	EReference getActivationBar_ReceivedConnections();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.ActivationBar#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.elsys.sequenceDiagram.ActivationBar#getHeight()
	 * @see #getActivationBar()
	 * @generated
	 */
	EAttribute getActivationBar_Height();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.elsys.sequenceDiagram.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.Connection#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.elsys.sequenceDiagram.Connection#getMessage()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link org.elsys.sequenceDiagram.Connection#getBendPoints <em>Bend Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bend Points</em>'.
	 * @see org.elsys.sequenceDiagram.Connection#getBendPoints()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_BendPoints();

	/**
	 * Returns the meta object for the reference '{@link org.elsys.sequenceDiagram.Connection#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.elsys.sequenceDiagram.Connection#getSender()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Sender();

	/**
	 * Returns the meta object for the reference '{@link org.elsys.sequenceDiagram.Connection#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.elsys.sequenceDiagram.Connection#getReceiver()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Receiver();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.ReturnConnection <em>Return Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Connection</em>'.
	 * @see org.elsys.sequenceDiagram.ReturnConnection
	 * @generated
	 */
	EClass getReturnConnection();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.SendConnection <em>Send Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Connection</em>'.
	 * @see org.elsys.sequenceDiagram.SendConnection
	 * @generated
	 */
	EClass getSendConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.SendConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.elsys.sequenceDiagram.SendConnection#getType()
	 * @see #getSendConnection()
	 * @generated
	 */
	EAttribute getSendConnection_Type();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.ResizableDiagramElement <em>Resizable Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resizable Diagram Element</em>'.
	 * @see org.elsys.sequenceDiagram.ResizableDiagramElement
	 * @generated
	 */
	EClass getResizableDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.ResizableDiagramElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.elsys.sequenceDiagram.ResizableDiagramElement#getWidth()
	 * @see #getResizableDiagramElement()
	 * @generated
	 */
	EAttribute getResizableDiagramElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.ResizableDiagramElement#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.elsys.sequenceDiagram.ResizableDiagramElement#getHeight()
	 * @see #getResizableDiagramElement()
	 * @generated
	 */
	EAttribute getResizableDiagramElement_Height();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment</em>'.
	 * @see org.elsys.sequenceDiagram.CombinedFragment
	 * @generated
	 */
	EClass getCombinedFragment();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.MidlineCombinedFragment <em>Midline Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midline Combined Fragment</em>'.
	 * @see org.elsys.sequenceDiagram.MidlineCombinedFragment
	 * @generated
	 */
	EClass getMidlineCombinedFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.MidlineCombinedFragment#getMidlineY <em>Midline Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midline Y</em>'.
	 * @see org.elsys.sequenceDiagram.MidlineCombinedFragment#getMidlineY()
	 * @see #getMidlineCombinedFragment()
	 * @generated
	 */
	EAttribute getMidlineCombinedFragment_MidlineY();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.ParallelCombinedFragment <em>Parallel Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Combined Fragment</em>'.
	 * @see org.elsys.sequenceDiagram.ParallelCombinedFragment
	 * @generated
	 */
	EClass getParallelCombinedFragment();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.BreakCombinedFragment <em>Break Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Combined Fragment</em>'.
	 * @see org.elsys.sequenceDiagram.BreakCombinedFragment
	 * @generated
	 */
	EClass getBreakCombinedFragment();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.OptionalCombinedFragment <em>Optional Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Combined Fragment</em>'.
	 * @see org.elsys.sequenceDiagram.OptionalCombinedFragment
	 * @generated
	 */
	EClass getOptionalCombinedFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.OptionalCombinedFragment#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.elsys.sequenceDiagram.OptionalCombinedFragment#getCondition()
	 * @see #getOptionalCombinedFragment()
	 * @generated
	 */
	EAttribute getOptionalCombinedFragment_Condition();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.LoopCombinedFragment <em>Loop Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Combined Fragment</em>'.
	 * @see org.elsys.sequenceDiagram.LoopCombinedFragment
	 * @generated
	 */
	EClass getLoopCombinedFragment();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.OptionCombinedFragment <em>Option Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Combined Fragment</em>'.
	 * @see org.elsys.sequenceDiagram.OptionCombinedFragment
	 * @generated
	 */
	EClass getOptionCombinedFragment();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.AlternativeCombinedFragment <em>Alternative Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Combined Fragment</em>'.
	 * @see org.elsys.sequenceDiagram.AlternativeCombinedFragment
	 * @generated
	 */
	EClass getAlternativeCombinedFragment();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.elsys.sequenceDiagram.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.Note#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.elsys.sequenceDiagram.Note#getName()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.Note#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.elsys.sequenceDiagram.Note#getText()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Text();

	/**
	 * Returns the meta object for class '{@link org.elsys.sequenceDiagram.BendPoint <em>Bend Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bend Point</em>'.
	 * @see org.elsys.sequenceDiagram.BendPoint
	 * @generated
	 */
	EClass getBendPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.BendPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.elsys.sequenceDiagram.BendPoint#getX()
	 * @see #getBendPoint()
	 * @generated
	 */
	EAttribute getBendPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.elsys.sequenceDiagram.BendPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.elsys.sequenceDiagram.BendPoint#getY()
	 * @see #getBendPoint()
	 * @generated
	 */
	EAttribute getBendPoint_Y();

	/**
	 * Returns the meta object for enum '{@link org.elsys.sequenceDiagram.SendConnectionType <em>Send Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Send Connection Type</em>'.
	 * @see org.elsys.sequenceDiagram.SendConnectionType
	 * @generated
	 */
	EEnum getSendConnectionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SequenceDiagramFactory getSequenceDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.AbstractElementImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getAbstractElement()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.DiagramImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Lifelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__LIFELINES = eINSTANCE.getDiagram_Lifelines();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__NOTES = eINSTANCE.getDiagram_Notes();

		/**
		 * The meta object literal for the '<em><b>Combined Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__COMBINED_FRAGMENTS = eINSTANCE.getDiagram_CombinedFragments();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.AbstractDiagramElementImpl <em>Abstract Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.AbstractDiagramElementImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getAbstractDiagramElement()
		 * @generated
		 */
		EClass ABSTRACT_DIAGRAM_ELEMENT = eINSTANCE.getAbstractDiagramElement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DIAGRAM_ELEMENT__X = eINSTANCE.getAbstractDiagramElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DIAGRAM_ELEMENT__Y = eINSTANCE.getAbstractDiagramElement_Y();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.LifelineImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFELINE__NAME = eINSTANCE.getLifeline_Name();

		/**
		 * The meta object literal for the '<em><b>Activation Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__ACTIVATION_BARS = eINSTANCE.getLifeline_ActivationBars();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.ActivationBarImpl <em>Activation Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.ActivationBarImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getActivationBar()
		 * @generated
		 */
		EClass ACTIVATION_BAR = eINSTANCE.getActivationBar();

		/**
		 * The meta object literal for the '<em><b>Lifeline</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_BAR__LIFELINE = eINSTANCE.getActivationBar_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Sent Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_BAR__SENT_CONNECTIONS = eINSTANCE.getActivationBar_SentConnections();

		/**
		 * The meta object literal for the '<em><b>Received Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_BAR__RECEIVED_CONNECTIONS = eINSTANCE.getActivationBar_ReceivedConnections();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_BAR__HEIGHT = eINSTANCE.getActivationBar_Height();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.ConnectionImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__MESSAGE = eINSTANCE.getConnection_Message();

		/**
		 * The meta object literal for the '<em><b>Bend Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__BEND_POINTS = eINSTANCE.getConnection_BendPoints();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SENDER = eINSTANCE.getConnection_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__RECEIVER = eINSTANCE.getConnection_Receiver();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.ReturnConnectionImpl <em>Return Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.ReturnConnectionImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getReturnConnection()
		 * @generated
		 */
		EClass RETURN_CONNECTION = eINSTANCE.getReturnConnection();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.SendConnectionImpl <em>Send Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.SendConnectionImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getSendConnection()
		 * @generated
		 */
		EClass SEND_CONNECTION = eINSTANCE.getSendConnection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_CONNECTION__TYPE = eINSTANCE.getSendConnection_Type();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.ResizableDiagramElementImpl <em>Resizable Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.ResizableDiagramElementImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getResizableDiagramElement()
		 * @generated
		 */
		EClass RESIZABLE_DIAGRAM_ELEMENT = eINSTANCE.getResizableDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIZABLE_DIAGRAM_ELEMENT__WIDTH = eINSTANCE.getResizableDiagramElement_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIZABLE_DIAGRAM_ELEMENT__HEIGHT = eINSTANCE.getResizableDiagramElement_Height();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.CombinedFragmentImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getCombinedFragment()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.MidlineCombinedFragment <em>Midline Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.MidlineCombinedFragment
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getMidlineCombinedFragment()
		 * @generated
		 */
		EClass MIDLINE_COMBINED_FRAGMENT = eINSTANCE.getMidlineCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Midline Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDLINE_COMBINED_FRAGMENT__MIDLINE_Y = eINSTANCE.getMidlineCombinedFragment_MidlineY();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.ParallelCombinedFragmentImpl <em>Parallel Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.ParallelCombinedFragmentImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getParallelCombinedFragment()
		 * @generated
		 */
		EClass PARALLEL_COMBINED_FRAGMENT = eINSTANCE.getParallelCombinedFragment();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.BreakCombinedFragmentImpl <em>Break Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.BreakCombinedFragmentImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getBreakCombinedFragment()
		 * @generated
		 */
		EClass BREAK_COMBINED_FRAGMENT = eINSTANCE.getBreakCombinedFragment();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.OptionalCombinedFragmentImpl <em>Optional Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.OptionalCombinedFragmentImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getOptionalCombinedFragment()
		 * @generated
		 */
		EClass OPTIONAL_COMBINED_FRAGMENT = eINSTANCE.getOptionalCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL_COMBINED_FRAGMENT__CONDITION = eINSTANCE.getOptionalCombinedFragment_Condition();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.LoopCombinedFragmentImpl <em>Loop Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.LoopCombinedFragmentImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getLoopCombinedFragment()
		 * @generated
		 */
		EClass LOOP_COMBINED_FRAGMENT = eINSTANCE.getLoopCombinedFragment();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.OptionCombinedFragmentImpl <em>Option Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.OptionCombinedFragmentImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getOptionCombinedFragment()
		 * @generated
		 */
		EClass OPTION_COMBINED_FRAGMENT = eINSTANCE.getOptionCombinedFragment();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.AlternativeCombinedFragmentImpl <em>Alternative Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.AlternativeCombinedFragmentImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getAlternativeCombinedFragment()
		 * @generated
		 */
		EClass ALTERNATIVE_COMBINED_FRAGMENT = eINSTANCE.getAlternativeCombinedFragment();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.NoteImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__NAME = eINSTANCE.getNote_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__TEXT = eINSTANCE.getNote_Text();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.impl.BendPointImpl <em>Bend Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.impl.BendPointImpl
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getBendPoint()
		 * @generated
		 */
		EClass BEND_POINT = eINSTANCE.getBendPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEND_POINT__X = eINSTANCE.getBendPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEND_POINT__Y = eINSTANCE.getBendPoint_Y();

		/**
		 * The meta object literal for the '{@link org.elsys.sequenceDiagram.SendConnectionType <em>Send Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.elsys.sequenceDiagram.SendConnectionType
		 * @see org.elsys.sequenceDiagram.impl.SequenceDiagramPackageImpl#getSendConnectionType()
		 * @generated
		 */
		EEnum SEND_CONNECTION_TYPE = eINSTANCE.getSendConnectionType();

	}

} //SequenceDiagramPackage
