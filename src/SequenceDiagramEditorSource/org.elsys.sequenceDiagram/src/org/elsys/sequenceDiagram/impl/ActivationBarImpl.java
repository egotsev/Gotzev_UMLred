/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Connection;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.SequenceDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.impl.ActivationBarImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.ActivationBarImpl#getSentConnections <em>Sent Connections</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.ActivationBarImpl#getReceivedConnections <em>Received Connections</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.ActivationBarImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationBarImpl extends AbstractElementImpl implements ActivationBar {
	/**
	 * The cached value of the '{@link #getSentConnections() <em>Sent Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> sentConnections;

	/**
	 * The cached value of the '{@link #getReceivedConnections() <em>Received Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> receivedConnections;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequenceDiagramPackage.Literals.ACTIVATION_BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline() {
		if (eContainerFeatureID() != SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE) return null;
		return (Lifeline)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifeline(Lifeline newLifeline, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLifeline, SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeline(Lifeline newLifeline) {
		if (newLifeline != eInternalContainer() || (eContainerFeatureID() != SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE && newLifeline != null)) {
			if (EcoreUtil.isAncestor(this, newLifeline))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLifeline != null)
				msgs = ((InternalEObject)newLifeline).eInverseAdd(this, SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS, Lifeline.class, msgs);
			msgs = basicSetLifeline(newLifeline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE, newLifeline, newLifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getSentConnections() {
		if (sentConnections == null) {
			sentConnections = new EObjectContainmentEList<Connection>(Connection.class, this, SequenceDiagramPackage.ACTIVATION_BAR__SENT_CONNECTIONS);
		}
		return sentConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getReceivedConnections() {
		if (receivedConnections == null) {
			receivedConnections = new EObjectResolvingEList<Connection>(Connection.class, this, SequenceDiagramPackage.ACTIVATION_BAR__RECEIVED_CONNECTIONS);
		}
		return receivedConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @author Emil Gotsev
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		firePropertyChange(SIZE, oldHeight, height);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequenceDiagramPackage.ACTIVATION_BAR__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLifeline((Lifeline)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE:
				return basicSetLifeline(null, msgs);
			case SequenceDiagramPackage.ACTIVATION_BAR__SENT_CONNECTIONS:
				return ((InternalEList<?>)getSentConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE:
				return eInternalContainer().eInverseRemove(this, SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS, Lifeline.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE:
				return getLifeline();
			case SequenceDiagramPackage.ACTIVATION_BAR__SENT_CONNECTIONS:
				return getSentConnections();
			case SequenceDiagramPackage.ACTIVATION_BAR__RECEIVED_CONNECTIONS:
				return getReceivedConnections();
			case SequenceDiagramPackage.ACTIVATION_BAR__HEIGHT:
				return getHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE:
				setLifeline((Lifeline)newValue);
				return;
			case SequenceDiagramPackage.ACTIVATION_BAR__SENT_CONNECTIONS:
				getSentConnections().clear();
				getSentConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case SequenceDiagramPackage.ACTIVATION_BAR__RECEIVED_CONNECTIONS:
				getReceivedConnections().clear();
				getReceivedConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case SequenceDiagramPackage.ACTIVATION_BAR__HEIGHT:
				setHeight((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE:
				setLifeline((Lifeline)null);
				return;
			case SequenceDiagramPackage.ACTIVATION_BAR__SENT_CONNECTIONS:
				getSentConnections().clear();
				return;
			case SequenceDiagramPackage.ACTIVATION_BAR__RECEIVED_CONNECTIONS:
				getReceivedConnections().clear();
				return;
			case SequenceDiagramPackage.ACTIVATION_BAR__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE:
				return getLifeline() != null;
			case SequenceDiagramPackage.ACTIVATION_BAR__SENT_CONNECTIONS:
				return sentConnections != null && !sentConnections.isEmpty();
			case SequenceDiagramPackage.ACTIVATION_BAR__RECEIVED_CONNECTIONS:
				return receivedConnections != null && !receivedConnections.isEmpty();
			case SequenceDiagramPackage.ACTIVATION_BAR__HEIGHT:
				return height != HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

	@Override
	public void addSentConnection(Connection conn) {
		sentConnections.add(conn);
		firePropertyChange(SENT, null, conn);
	}

	@Override
	public void addReceivedConnection(Connection conn) {
		receivedConnections.add(conn);
		firePropertyChange(RECEIVED, null, conn);
	}

	@Override
	public void removeSentConnection(Connection conn) {
		sentConnections.remove(conn);
		firePropertyChange(SENT, null, conn);
	}

	@Override
	public void removeReceivedConnection(Connection conn) {
		receivedConnections.remove(conn);
		firePropertyChange(RECEIVED, null, conn);
	}

} //ActivationBarImpl
