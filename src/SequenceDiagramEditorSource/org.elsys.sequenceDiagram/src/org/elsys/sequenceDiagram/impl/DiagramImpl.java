/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elsys.sequenceDiagram.AbstractDiagramElement;
import org.elsys.sequenceDiagram.CombinedFragment;
import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.Lifeline;
import org.elsys.sequenceDiagram.Note;
import org.elsys.sequenceDiagram.SequenceDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elsys.sequenceDiagram.impl.DiagramImpl#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.DiagramImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.elsys.sequenceDiagram.impl.DiagramImpl#getCombinedFragments <em>Combined Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends AbstractElementImpl implements Diagram {
	/**
	 * The cached value of the '{@link #getLifelines() <em>Lifelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifelines()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> lifelines;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> notes;

	/**
	 * The cached value of the '{@link #getCombinedFragments() <em>Combined Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<CombinedFragment> combinedFragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequenceDiagramPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getLifelines() {
		if (lifelines == null) {
			lifelines = new EObjectContainmentEList<Lifeline>(Lifeline.class, this, SequenceDiagramPackage.DIAGRAM__LIFELINES);
		}
		return lifelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Note>(Note.class, this, SequenceDiagramPackage.DIAGRAM__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CombinedFragment> getCombinedFragments() {
		if (combinedFragments == null) {
			combinedFragments = new EObjectContainmentEList<CombinedFragment>(CombinedFragment.class, this, SequenceDiagramPackage.DIAGRAM__COMBINED_FRAGMENTS);
		}
		return combinedFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequenceDiagramPackage.DIAGRAM__LIFELINES:
				return ((InternalEList<?>)getLifelines()).basicRemove(otherEnd, msgs);
			case SequenceDiagramPackage.DIAGRAM__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case SequenceDiagramPackage.DIAGRAM__COMBINED_FRAGMENTS:
				return ((InternalEList<?>)getCombinedFragments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequenceDiagramPackage.DIAGRAM__LIFELINES:
				return getLifelines();
			case SequenceDiagramPackage.DIAGRAM__NOTES:
				return getNotes();
			case SequenceDiagramPackage.DIAGRAM__COMBINED_FRAGMENTS:
				return getCombinedFragments();
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
			case SequenceDiagramPackage.DIAGRAM__LIFELINES:
				getLifelines().clear();
				getLifelines().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case SequenceDiagramPackage.DIAGRAM__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case SequenceDiagramPackage.DIAGRAM__COMBINED_FRAGMENTS:
				getCombinedFragments().clear();
				getCombinedFragments().addAll((Collection<? extends CombinedFragment>)newValue);
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
			case SequenceDiagramPackage.DIAGRAM__LIFELINES:
				getLifelines().clear();
				return;
			case SequenceDiagramPackage.DIAGRAM__NOTES:
				getNotes().clear();
				return;
			case SequenceDiagramPackage.DIAGRAM__COMBINED_FRAGMENTS:
				getCombinedFragments().clear();
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
			case SequenceDiagramPackage.DIAGRAM__LIFELINES:
				return lifelines != null && !lifelines.isEmpty();
			case SequenceDiagramPackage.DIAGRAM__NOTES:
				return notes != null && !notes.isEmpty();
			case SequenceDiagramPackage.DIAGRAM__COMBINED_FRAGMENTS:
				return combinedFragments != null && !combinedFragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void addElement(AbstractDiagramElement e) {
		if (e instanceof Lifeline){
			lifelines.add((Lifeline) e);
		} else if (e instanceof CombinedFragment){
			combinedFragments.add((CombinedFragment) e);
		} else if (e instanceof Note){
			notes.add((Note) e);
		}
		firePropertyChange(CHILD, null, e);
	}

	@Override
	public void removeElement(AbstractDiagramElement e) {
		if (e instanceof Lifeline){
			lifelines.remove((Lifeline) e);
		} else if (e instanceof CombinedFragment){
			combinedFragments.remove((CombinedFragment) e);
		} else if (e instanceof Note){
			notes.remove((Note) e);
		}
		firePropertyChange(CHILD, null, e);
	}

} //DiagramImpl
