/**
 */
package bowling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Tournament#getMatchups <em>Matchups</em>}</li>
 *   <li>{@link bowling.Tournament#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchups</em>' containment reference.
	 * @see #setMatchups(Matchup)
	 * @see bowling.BowlingPackage#getTournament_Matchups()
	 * @model containment="true"
	 * @generated
	 */
	Matchup getMatchups();

	/**
	 * Sets the value of the '{@link bowling.Tournament#getMatchups <em>Matchups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchups</em>' containment reference.
	 * @see #getMatchups()
	 * @generated
	 */
	void setMatchups(Matchup value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bowling.TournamentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bowling.TournamentType
	 * @see #setType(TournamentType)
	 * @see bowling.BowlingPackage#getTournament_Type()
	 * @model
	 * @generated
	 */
	TournamentType getType();

	/**
	 * Sets the value of the '{@link bowling.Tournament#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bowling.TournamentType
	 * @see #getType()
	 * @generated
	 */
	void setType(TournamentType value);

} // Tournament
