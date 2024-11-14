package fr.diginamic.banque;

/**
 * La classe Livret A hérite de la classe CompteBancaire
 * @author Diginamic
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A
	 */
	private double tauxRemuneration;


	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0.0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Méthode permettant d'appliquer la rémunération annuelle au solde du Livret A
	 * Vérifie si le type de compte est LA,
	 * si oui, rajoute au solde actuel les intérêts calculés en fonction du taux de rémunération
	 */
	public void appliquerRemuAnnuelle(){
		if (getType().equals("LA")){
			setSolde(getSolde() + getSolde()*tauxRemuneration/100);
		}
	}

	/**
	 * Getter permettant d'obtenir le tauxRemuneration
	 * @return un double correspondant au tauxRemuneration
	 */
	public double getTauxRemuneration() {

		return tauxRemuneration;
	}

	/**
	 * Setter permettant de définir le taux de rémunération du LivretA
	 * @param tauxRemuneration à définir
	 */
	public void setTauxRemuneration(double tauxRemuneration) {

		this.tauxRemuneration = tauxRemuneration;
	}
}
