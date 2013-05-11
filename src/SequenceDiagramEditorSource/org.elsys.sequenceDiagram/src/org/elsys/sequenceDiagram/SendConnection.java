/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.SendConnection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getSendConnection()
 * @model
 * @generated
 */
public interface SendConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.elsys.sequenceDiagram.SendConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.elsys.sequenceDiagram.SendConnectionType
	 * @see #setType(SendConnectionType)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getSendConnection_Type()
	 * @model default=""
	 * @generated
	 */
	SendConnectionType getType();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.SendConnection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.elsys.sequenceDiagram.SendConnectionType
	 * @see #getType()
	 * @generated
	 */
	void setType(SendConnectionType value);

} // SendConnection
