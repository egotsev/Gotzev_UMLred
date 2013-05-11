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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elsys.sequenceDiagram.ActivationBar;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.SequenceDiagramPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Lifeline</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.impl.LifelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.LifelineImpl#getActivationBars <em>Activation Bars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends AbstractDiagramElementImpl implements
		Lifeline {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Lifeline";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivationBars()
	 * <em>Activation Bars</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getActivationBars()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivationBar> activationBars;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequenceDiagramPackage.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @author Emil Gotsev
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		firePropertyChange(NAME, oldName, name);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SequenceDiagramPackage.LIFELINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationBar> getActivationBars() {
		if (activationBars == null) {
			activationBars = new EObjectContainmentWithInverseEList<ActivationBar>(ActivationBar.class, this, SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS, SequenceDiagramPackage.ACTIVATION_BAR__LIFELINE);
		}
		return activationBars;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivationBars()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS:
				return ((InternalEList<?>)getActivationBars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequenceDiagramPackage.LIFELINE__NAME:
				return getName();
			case SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS:
				return getActivationBars();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SequenceDiagramPackage.LIFELINE__NAME:
				setName((String)newValue);
				return;
			case SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS:
				getActivationBars().clear();
				getActivationBars().addAll((Collection<? extends ActivationBar>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SequenceDiagramPackage.LIFELINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS:
				getActivationBars().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SequenceDiagramPackage.LIFELINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SequenceDiagramPackage.LIFELINE__ACTIVATION_BARS:
				return activationBars != null && !activationBars.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public void addActivationBar(int index, ActivationBar bar) {
		activationBars.add(index, bar);
		firePropertyChange(CHILD, null, bar);
	}

	@Override
	public void removeActivationBar(ActivationBar bar) {
		activationBars.remove(bar);
		firePropertyChange(CHILD, null, bar);
	}

	@Override
	public void moveActivationBar(int index, ActivationBar bar) {
		try {
			activationBars.move(index, bar);
			firePropertyChange(CHILD, null, bar);
		} catch (IndexOutOfBoundsException e) {
			return;
		}
	}

} // LifelineImpl
