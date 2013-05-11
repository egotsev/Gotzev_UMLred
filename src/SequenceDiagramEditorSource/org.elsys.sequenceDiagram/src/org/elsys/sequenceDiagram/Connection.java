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
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.Connection#getSender <em>Sender</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.Connection#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.Connection#getMessage <em>Message</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.Connection#getBendPoints <em>Bend Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getConnection_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.Connection#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Bend Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.elsys.sequenceDiagram.BendPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bend Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bend Points</em>' containment reference list.
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getConnection_BendPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<BendPoint> getBendPoints();

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(ActivationBar)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getConnection_Sender()
	 * @model
	 * @generated
	 */
	ActivationBar getSender();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.Connection#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(ActivationBar value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(ActivationBar)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getConnection_Receiver()
	 * @model
	 * @generated
	 */
	ActivationBar getReceiver();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.Connection#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(ActivationBar value);
	
	void addBendPoint(int index, BendPoint bp);
	void removeBendPoint(int index);
	void moveBendPoint(int index, int x, int y);

} // Connection
