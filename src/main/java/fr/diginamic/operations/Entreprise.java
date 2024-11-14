package fr.diginamic.operations;

import java.util.Date;

/**
 *La classe représente une entreprise
 */
public class Entreprise {

	/**
	 * Numéro du siret
	 */
	private int siret;
	/**
	 * Nom de l'entreprise
	 */
	private String nom;
	/**
	 * Adresse de l'entreprise
	 */
	private String adresse;
	/**
	 * Date de création de l'entreprise
	 */
	private Date dateCreation;

	/**
	 * Constante représentant le capital maximum de l'entreprise
	 */
	public static final int CAPITAL_MAX = 3_000_000;

	/**
	 * Méthode affichant le statut de l'entreprise
	 */
	public void afficherStatut(){
		
	}

	/**
	 * Constructeur
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * Getter permet d'obtenir le siret
	 * @return le numéro du siret - un entier naturel
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Définir un numéro de siret
	 * @param siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter permet d'obtenir le nom de l'entreprise
	 * @return un String
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter permet de définir le nom de l'entreprise
	 * @param nom
	 * 	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter permet d'obtenir l'adresse de l'entreprise
	 * @return un String
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter permet de définir l'adresse de l'entreprise
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter permet d'obtenir la date de création de l'entreprise
	 * @return une date
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter permet de définir la date de création de l'entreprise
	 * @param dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
