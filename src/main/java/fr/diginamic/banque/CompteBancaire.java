package fr.diginamic.banque;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;


    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    private String type;

    /**
     * Constructeur
     * @param solde
     * @param decouvert
     * @param type
     */
    public CompteBancaire(String type, double solde, double decouvert) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Méthode permettant d'ajouter un montant au solde du compte
     * @param montant
     */
    public void ajouterMontant(double montant) {

        this.solde += montant;
    }

    /**
     * Méthode permettant de débiter le montant donné du solde si les conditions sont remplies.
     * <p>POur un CC, le montant est débité si le solde après débit n'est pas inférieur au découverte autorisé</p>
     * <p>POur un LA, le montant est débité si le solde après débit reste positif </p>
     * retourne un bouleen	 *
     *
     * @param montant à débiter du solde
     * @return true si le montant a été débité avec succès, false sinon
     */
    public void debiterMontant(double montant) {
        if (type.equals("CC")) {
            if (this.solde - montant > decouvert) {
                this.solde = solde - montant;
            }
        } else if (type.equals("LA")) {
            if (this.solde - montant > 0) {
                this.solde = solde - montant;
            }
        }
    }

    /**
     * Getter permettant de retourner le solde actuel du compte
     * @return retourne la solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter permettant de définir le solde du compte
     * @param solde à définir
     */
    public void setSolde(double solde) {

        this.solde = solde;
    }

    /**
     * Getter permettant de retourner le montant de la découverte
     * @return le montant en double de la découverte
     */
    public double getDecouvert() {

        return decouvert;
    }

    /**
     * Setter permettant de définir le montant de la découverte
     * @param decouvert à définir
     */
    public void setDecouvert(double decouvert) {

        this.decouvert = decouvert;
    }

    /**
     * Getter permettant d'obtenir le type du compte
     *
     * @return le type en String
     */
    public String getType() {

        return type;
    }

    /**
     * Setter permettant de définir le type du compte
     *
     * @param type à définir
     */
    public void setType(String type) {

        this.type = type;
    }
}
