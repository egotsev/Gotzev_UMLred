/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resizable Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.ResizableDiagramElement#getWidth <em>Width</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.ResizableDiagramElement#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getResizableDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface ResizableDiagramElement extends AbstractDiagramElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getResizableDiagramElement_Width()
	 * @model default="100"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.ResizableDiagramElement#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

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
	 * @see org.elsys.sequenceDiagram.SequenceDiagramPackage#getResizableDiagramElement_Height()
	 * @model default="50"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.elsys.sequenceDiagram.ResizableDiagramElement#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // ResizableDiagramElement
