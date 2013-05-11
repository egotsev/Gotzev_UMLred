/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.elsys.sequenceDiagram.AlternativeCombinedFragment;
import org.elsys.sequenceDiagram.MidlineCombinedFragment;
import org.elsys.sequenceDiagram.SequenceDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.impl.AlternativeCombinedFragmentImpl#getMidlineY <em>Midline Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeCombinedFragmentImpl extends OptionalCombinedFragmentImpl implements AlternativeCombinedFragment {
	/**
	 * The default value of the '{@link #getMidlineY() <em>Midline Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidlineY()
	 * @generated
	 * @ordered
	 */
	protected static final int MIDLINE_Y_EDEFAULT = 25;

	/**
	 * The cached value of the '{@link #getMidlineY() <em>Midline Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidlineY()
	 * @generated
	 * @ordered
	 */
	protected int midlineY = MIDLINE_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeCombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequenceDiagramPackage.Literals.ALTERNATIVE_COMBINED_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMidlineY() {
		return midlineY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @author Emil Gotsev
	 */
	public void setMidlineY(int newMidlineY) {
		int oldMidlineY = midlineY;
		midlineY = newMidlineY;
		firePropertyChange(LOC, oldMidlineY, midlineY);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT__MIDLINE_Y, oldMidlineY, midlineY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT__MIDLINE_Y:
				return getMidlineY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT__MIDLINE_Y:
				setMidlineY((Integer)newValue);
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
			case SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT__MIDLINE_Y:
				setMidlineY(MIDLINE_Y_EDEFAULT);
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
			case SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT__MIDLINE_Y:
				return midlineY != MIDLINE_Y_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MidlineCombinedFragment.class) {
			switch (derivedFeatureID) {
				case SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT__MIDLINE_Y: return SequenceDiagramPackage.MIDLINE_COMBINED_FRAGMENT__MIDLINE_Y;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MidlineCombinedFragment.class) {
			switch (baseFeatureID) {
				case SequenceDiagramPackage.MIDLINE_COMBINED_FRAGMENT__MIDLINE_Y: return SequenceDiagramPackage.ALTERNATIVE_COMBINED_FRAGMENT__MIDLINE_Y;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (midlineY: ");
		result.append(midlineY);
		result.append(')');
		return result.toString();
	}

} //AlternativeCombinedFragmentImpl
