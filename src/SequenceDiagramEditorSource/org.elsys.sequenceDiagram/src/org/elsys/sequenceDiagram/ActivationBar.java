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
 * A representation of the model object '<em><b>Activation Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.ActivationBar#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.ActivationBar#getSentConnections <em>Sent Connections</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.ActivationBar#getReceivedConnections <em>Received Connections</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.ActivationBar#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getActivationBar()
 * @model
 * @generated
 */
public interface ActivationBar extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.elsys.sequenceDiagram.Lifeline#getActivationBars <em>Activation Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' container reference.
	 * @see #setLifeline(Lifeline)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getActivationBar_Lifeline()
	 * @see org.elsys.sequenceDiagram.Lifeline#getActivationBars
	 * @model opposite="activationBars" transient="false"
	 * @generated
	 */
	Lifeline getLifeline();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.ActivationBar#getLifeline <em>Lifeline</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifeline</em>' container reference.
	 * @see #getLifeline()
	 * @generated
	 */
	void setLifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Sent Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.elsys.sequenceDiagram.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sent Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Connections</em>' containment reference list.
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getActivationBar_SentConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getSentConnections();

	/**
	 * Returns the value of the '<em><b>Received Connections</b></em>' reference list.
	 * The list contents are of type {@link org.elsys.sequenceDiagram.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Connections</em>' reference list.
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getActivationBar_ReceivedConnections()
	 * @model
	 * @generated
	 */
	EList<Connection> getReceivedConnections();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getActivationBar_Height()
	 * @model default="50"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.ActivationBar#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);
	
	void addSentConnection(Connection conn);
	void removeSentConnection(Connection conn);
	void addReceivedConnection(Connection conn);
	void removeReceivedConnection(Connection conn);

} // ActivationBar
