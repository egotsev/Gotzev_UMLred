/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.elsys.sequenceDiagram.BendPoint;
import org.elsys.sequenceDiagram.SequenceDiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bend Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BendPointTest extends AbstractElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BendPointTest.class);
	}

	/**
	 * Constructs a new Bend Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BendPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bend Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BendPoint getFixture() {
		return (BendPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceDiagramFactory.eINSTANCE.createBendPoint());
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

} //BendPointTest
