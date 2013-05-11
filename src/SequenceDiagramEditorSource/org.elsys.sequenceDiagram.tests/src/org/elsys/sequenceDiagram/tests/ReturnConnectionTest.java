/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.tests;

import junit.textui.TestRunner;

import org.elsys.sequenceDiagram.ReturnConnection;
import org.elsys.sequenceDiagram.SequenceDiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Return Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnConnectionTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReturnConnectionTest.class);
	}

	/**
	 * Constructs a new Return Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Return Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReturnConnection getFixture() {
		return (ReturnConnection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceDiagramFactory.eINSTANCE.createReturnConnection());
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

} //ReturnConnectionTest
