/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.tests;

import junit.textui.TestRunner;

import org.elsys.sequenceDiagram.LoopCombinedFragment;
import org.elsys.sequenceDiagram.SequenceDiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loop Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopCombinedFragmentTest extends OptionalCombinedFragmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoopCombinedFragmentTest.class);
	}

	/**
	 * Constructs a new Loop Combined Fragment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCombinedFragmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loop Combined Fragment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LoopCombinedFragment getFixture() {
		return (LoopCombinedFragment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceDiagramFactory.eINSTANCE.createLoopCombinedFragment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LoopCombinedFragmentTest
