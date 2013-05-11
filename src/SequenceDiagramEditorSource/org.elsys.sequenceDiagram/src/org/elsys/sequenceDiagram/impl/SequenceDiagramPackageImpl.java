/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.elsys.sequenceDiagram.AbstractDiagramElement;
import org.elsys.sequenceDiagram.AbstractElement;
import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.AlternativeCombinedFragment;
import org.elsys.sequenceDiagram.BendPoint;
import org.elsys.sequenceDiagram.BreakCombinedFragment;
import org.elsys.sequenceDiagram.CombinedFragment;
import org.elsys.sequenceDiagram.Connection;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.LoopCombinedFragment;
import org.elsys.sequenceDiagram.MidlineCombinedFragment;
import org.elsys.sequenceDiagram.Note;
import org.elsys.sequenceDiagram.OptionCombinedFragment;
import org.elsys.sequenceDiagram.OptionalCombinedFragment;
import org.elsys.sequenceDiagram.ParallelCombinedFragment;
import org.elsys.sequenceDiagram.ResizableDiagramElement;
import org.elsys.sequenceDiagram.ReturnConnection;
import org.elsys.sequenceDiagram.SendConnection;
import org.elsys.sequenceDiagram.SendConnectionType;
import org.elsys.sequenceDiagram.SequenceDiagramFactory;
import org.elsys.sequenceDiagram.SequenceDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceDiagramPackageImpl extends EPackageImpl implements SequenceDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDiagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resizableDiagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midlineCombinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelCombinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakCombinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalCombinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopCombinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionCombinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeCombinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bendPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sendConnectionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SequenceDiagramPackageImpl() {
		super(eNS_URI, SequenceDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SequenceDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SequenceDiagramPackage init() {
		if (isInited) return (SequenceDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(SequenceDiagramPackage.eNS_URI);

		// Obtain or create and register package
		SequenceDiagramPackageImpl theSequenceDiagramPackage = (SequenceDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SequenceDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SequenceDiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSequenceDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theSequenceDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSequenceDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SequenceDiagramPackage.eNS_URI, theSequenceDiagramPackage);
		return theSequenceDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractElement() {
		return abstractElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_Lifelines() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_Notes() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_CombinedFragments() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDiagramElement() {
		return abstractDiagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDiagramElement_X() {
		return (EAttribute)abstractDiagramElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDiagramElement_Y() {
		return (EAttribute)abstractDiagramElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeline() {
		return lifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifeline_Name() {
		return (EAttribute)lifelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_ActivationBars() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationBar() {
		return activationBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationBar_Lifeline() {
		return (EReference)activationBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationBar_SentConnections() {
		return (EReference)activationBarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationBar_ReceivedConnections() {
		return (EReference)activationBarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationBar_Height() {
		return (EAttribute)activationBarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Message() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_BendPoints() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Sender() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Receiver() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnConnection() {
		return returnConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendConnection() {
		return sendConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendConnection_Type() {
		return (EAttribute)sendConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResizableDiagramElement() {
		return resizableDiagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResizableDiagramElement_Width() {
		return (EAttribute)resizableDiagramElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResizableDiagramElement_Height() {
		return (EAttribute)resizableDiagramElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragment() {
		return combinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidlineCombinedFragment() {
		return midlineCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidlineCombinedFragment_MidlineY() {
		return (EAttribute)midlineCombinedFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelCombinedFragment() {
		return parallelCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakCombinedFragment() {
		return breakCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalCombinedFragment() {
		return optionalCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionalCombinedFragment_Condition() {
		return (EAttribute)optionalCombinedFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopCombinedFragment() {
		return loopCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionCombinedFragment() {
		return optionCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeCombinedFragment() {
		return alternativeCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Name() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Text() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBendPoint() {
		return bendPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBendPoint_X() {
		return (EAttribute)bendPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBendPoint_Y() {
		return (EAttribute)bendPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSendConnectionType() {
		return sendConnectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagramFactory getSequenceDiagramFactory() {
		return (SequenceDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractElementEClass = createEClass(ABSTRACT_ELEMENT);

		diagramEClass = createEClass(DIAGRAM);
		createEReference(diagramEClass, DIAGRAM__LIFELINES);
		createEReference(diagramEClass, DIAGRAM__NOTES);
		createEReference(diagramEClass, DIAGRAM__COMBINED_FRAGMENTS);

		abstractDiagramElementEClass = createEClass(ABSTRACT_DIAGRAM_ELEMENT);
		createEAttribute(abstractDiagramElementEClass, ABSTRACT_DIAGRAM_ELEMENT__X);
		createEAttribute(abstractDiagramElementEClass, ABSTRACT_DIAGRAM_ELEMENT__Y);

		lifelineEClass = createEClass(LIFELINE);
		createEAttribute(lifelineEClass, LIFELINE__NAME);
		createEReference(lifelineEClass, LIFELINE__ACTIVATION_BARS);

		activationBarEClass = createEClass(ACTIVATION_BAR);
		createEReference(activationBarEClass, ACTIVATION_BAR__LIFELINE);
		createEReference(activationBarEClass, ACTIVATION_BAR__SENT_CONNECTIONS);
		createEReference(activationBarEClass, ACTIVATION_BAR__RECEIVED_CONNECTIONS);
		createEAttribute(activationBarEClass, ACTIVATION_BAR__HEIGHT);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__SENDER);
		createEReference(connectionEClass, CONNECTION__RECEIVER);
		createEAttribute(connectionEClass, CONNECTION__MESSAGE);
		createEReference(connectionEClass, CONNECTION__BEND_POINTS);

		returnConnectionEClass = createEClass(RETURN_CONNECTION);

		sendConnectionEClass = createEClass(SEND_CONNECTION);
		createEAttribute(sendConnectionEClass, SEND_CONNECTION__TYPE);

		resizableDiagramElementEClass = createEClass(RESIZABLE_DIAGRAM_ELEMENT);
		createEAttribute(resizableDiagramElementEClass, RESIZABLE_DIAGRAM_ELEMENT__WIDTH);
		createEAttribute(resizableDiagramElementEClass, RESIZABLE_DIAGRAM_ELEMENT__HEIGHT);

		combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);

		midlineCombinedFragmentEClass = createEClass(MIDLINE_COMBINED_FRAGMENT);
		createEAttribute(midlineCombinedFragmentEClass, MIDLINE_COMBINED_FRAGMENT__MIDLINE_Y);

		parallelCombinedFragmentEClass = createEClass(PARALLEL_COMBINED_FRAGMENT);

		optionalCombinedFragmentEClass = createEClass(OPTIONAL_COMBINED_FRAGMENT);
		createEAttribute(optionalCombinedFragmentEClass, OPTIONAL_COMBINED_FRAGMENT__CONDITION);

		alternativeCombinedFragmentEClass = createEClass(ALTERNATIVE_COMBINED_FRAGMENT);

		breakCombinedFragmentEClass = createEClass(BREAK_COMBINED_FRAGMENT);

		loopCombinedFragmentEClass = createEClass(LOOP_COMBINED_FRAGMENT);

		optionCombinedFragmentEClass = createEClass(OPTION_COMBINED_FRAGMENT);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__NAME);
		createEAttribute(noteEClass, NOTE__TEXT);

		bendPointEClass = createEClass(BEND_POINT);
		createEAttribute(bendPointEClass, BEND_POINT__X);
		createEAttribute(bendPointEClass, BEND_POINT__Y);

		// Create enums
		sendConnectionTypeEEnum = createEEnum(SEND_CONNECTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diagramEClass.getESuperTypes().add(this.getAbstractElement());
		abstractDiagramElementEClass.getESuperTypes().add(this.getAbstractElement());
		lifelineEClass.getESuperTypes().add(this.getAbstractDiagramElement());
		activationBarEClass.getESuperTypes().add(this.getAbstractElement());
		connectionEClass.getESuperTypes().add(this.getAbstractElement());
		returnConnectionEClass.getESuperTypes().add(this.getConnection());
		sendConnectionEClass.getESuperTypes().add(this.getConnection());
		resizableDiagramElementEClass.getESuperTypes().add(this.getAbstractDiagramElement());
		combinedFragmentEClass.getESuperTypes().add(this.getResizableDiagramElement());
		parallelCombinedFragmentEClass.getESuperTypes().add(this.getCombinedFragment());
		parallelCombinedFragmentEClass.getESuperTypes().add(this.getMidlineCombinedFragment());
		optionalCombinedFragmentEClass.getESuperTypes().add(this.getCombinedFragment());
		alternativeCombinedFragmentEClass.getESuperTypes().add(this.getOptionalCombinedFragment());
		alternativeCombinedFragmentEClass.getESuperTypes().add(this.getMidlineCombinedFragment());
		breakCombinedFragmentEClass.getESuperTypes().add(this.getOptionalCombinedFragment());
		loopCombinedFragmentEClass.getESuperTypes().add(this.getOptionalCombinedFragment());
		optionCombinedFragmentEClass.getESuperTypes().add(this.getOptionalCombinedFragment());
		noteEClass.getESuperTypes().add(this.getResizableDiagramElement());
		bendPointEClass.getESuperTypes().add(this.getAbstractElement());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagram_Lifelines(), this.getLifeline(), null, "lifelines", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_Notes(), this.getNote(), null, "notes", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_CombinedFragments(), this.getCombinedFragment(), null, "combinedFragments", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDiagramElementEClass, AbstractDiagramElement.class, "AbstractDiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractDiagramElement_X(), ecorePackage.getEInt(), "x", "0", 0, 1, AbstractDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDiagramElement_Y(), ecorePackage.getEInt(), "y", "0", 0, 1, AbstractDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLifeline_Name(), ecorePackage.getEString(), "name", "Lifeline", 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifeline_ActivationBars(), this.getActivationBar(), this.getActivationBar_Lifeline(), "activationBars", null, 0, -1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationBarEClass, ActivationBar.class, "ActivationBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivationBar_Lifeline(), this.getLifeline(), this.getLifeline_ActivationBars(), "lifeline", null, 0, 1, ActivationBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationBar_SentConnections(), this.getConnection(), null, "sentConnections", null, 0, -1, ActivationBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationBar_ReceivedConnections(), this.getConnection(), null, "receivedConnections", null, 0, -1, ActivationBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationBar_Height(), ecorePackage.getEInt(), "height", "50", 0, 1, ActivationBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Sender(), this.getActivationBar(), null, "sender", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Receiver(), this.getActivationBar(), null, "receiver", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Message(), ecorePackage.getEString(), "message", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_BendPoints(), this.getBendPoint(), null, "bendPoints", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnConnectionEClass, ReturnConnection.class, "ReturnConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendConnectionEClass, SendConnection.class, "SendConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendConnection_Type(), this.getSendConnectionType(), "type", "", 0, 1, SendConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resizableDiagramElementEClass, ResizableDiagramElement.class, "ResizableDiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResizableDiagramElement_Width(), ecorePackage.getEInt(), "width", "100", 0, 1, ResizableDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResizableDiagramElement_Height(), ecorePackage.getEInt(), "height", "50", 0, 1, ResizableDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midlineCombinedFragmentEClass, MidlineCombinedFragment.class, "MidlineCombinedFragment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMidlineCombinedFragment_MidlineY(), ecorePackage.getEInt(), "midlineY", "25", 0, 1, MidlineCombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelCombinedFragmentEClass, ParallelCombinedFragment.class, "ParallelCombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionalCombinedFragmentEClass, OptionalCombinedFragment.class, "OptionalCombinedFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionalCombinedFragment_Condition(), ecorePackage.getEString(), "condition", "", 0, 1, OptionalCombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeCombinedFragmentEClass, AlternativeCombinedFragment.class, "AlternativeCombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(breakCombinedFragmentEClass, BreakCombinedFragment.class, "BreakCombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopCombinedFragmentEClass, LoopCombinedFragment.class, "LoopCombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionCombinedFragmentEClass, OptionCombinedFragment.class, "OptionCombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Name(), ecorePackage.getEString(), "name", "Note", 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Text(), ecorePackage.getEString(), "text", "Note text", 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bendPointEClass, BendPoint.class, "BendPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBendPoint_X(), ecorePackage.getEInt(), "x", "0", 0, 1, BendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBendPoint_Y(), ecorePackage.getEInt(), "y", "0", 0, 1, BendPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sendConnectionTypeEEnum, SendConnectionType.class, "SendConnectionType");
		addEEnumLiteral(sendConnectionTypeEEnum, SendConnectionType.SYNCHRONOUS);
		addEEnumLiteral(sendConnectionTypeEEnum, SendConnectionType.ASYNCHRONOUS);

		// Create resource
		createResource(eNS_URI);
	}

} //SequenceDiagramPackageImpl
