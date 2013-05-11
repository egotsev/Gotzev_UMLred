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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.BendPoint;
import org.elsys.sequenceDiagram.Connection;
import org.elsys.sequenceDiagram.SequenceDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.impl.ConnectionImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.ConnectionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.ConnectionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.ConnectionImpl#getBendPoints <em>Bend Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectionImpl extends AbstractElementImpl implements Connection {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected ActivationBar sender;
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected ActivationBar receiver;
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @author Emil Gotsev
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBendPoints() <em>Bend Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<BendPoint> bendPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequenceDiagramPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @author Emil Gotsev
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		firePropertyChange(TEXT, oldMessage, message);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequenceDiagramPackage.CONNECTION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BendPoint> getBendPoints() {
		if (bendPoints == null) {
			bendPoints = new EObjectContainmentEList<BendPoint>(BendPoint.class, this, SequenceDiagramPackage.CONNECTION__BEND_POINTS);
		}
		return bendPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequenceDiagramPackage.CONNECTION__BEND_POINTS:
				return ((InternalEList<?>)getBendPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationBar getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (ActivationBar)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceDiagramPackage.CONNECTION__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationBar basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(ActivationBar newSender) {
		ActivationBar oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequenceDiagramPackage.CONNECTION__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationBar getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (ActivationBar)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceDiagramPackage.CONNECTION__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationBar basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(ActivationBar newReceiver) {
		ActivationBar oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequenceDiagramPackage.CONNECTION__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequenceDiagramPackage.CONNECTION__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case SequenceDiagramPackage.CONNECTION__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case SequenceDiagramPackage.CONNECTION__MESSAGE:
				return getMessage();
			case SequenceDiagramPackage.CONNECTION__BEND_POINTS:
				return getBendPoints();
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
			case SequenceDiagramPackage.CONNECTION__SENDER:
				setSender((ActivationBar)newValue);
				return;
			case SequenceDiagramPackage.CONNECTION__RECEIVER:
				setReceiver((ActivationBar)newValue);
				return;
			case SequenceDiagramPackage.CONNECTION__MESSAGE:
				setMessage((String)newValue);
				return;
			case SequenceDiagramPackage.CONNECTION__BEND_POINTS:
				getBendPoints().clear();
				getBendPoints().addAll((Collection<? extends BendPoint>)newValue);
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
			case SequenceDiagramPackage.CONNECTION__SENDER:
				setSender((ActivationBar)null);
				return;
			case SequenceDiagramPackage.CONNECTION__RECEIVER:
				setReceiver((ActivationBar)null);
				return;
			case SequenceDiagramPackage.CONNECTION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case SequenceDiagramPackage.CONNECTION__BEND_POINTS:
				getBendPoints().clear();
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
			case SequenceDiagramPackage.CONNECTION__SENDER:
				return sender != null;
			case SequenceDiagramPackage.CONNECTION__RECEIVER:
				return receiver != null;
			case SequenceDiagramPackage.CONNECTION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case SequenceDiagramPackage.CONNECTION__BEND_POINTS:
				return bendPoints != null && !bendPoints.isEmpty();
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
		result.append(" (message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void addBendPoint(int index, BendPoint bp) {
		getBendPoints().add(index, bp);
		firePropertyChange(BENDPOINT, null, null);
	}
	
	@Override
	public void removeBendPoint(int index) {
		getBendPoints().remove(index);
		firePropertyChange(BENDPOINT, null, null);
	}
	
	@Override
	public void moveBendPoint(int index, int x, int y) {
		BendPoint bp = getBendPoints().get(index);
		bp.setX(x);
		bp.setY(y);
		firePropertyChange(BENDPOINT, null, null);
	}

} //ConnectionImpl
