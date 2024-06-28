package fr.diginamic.factory;

public abstract class Element {

	private String nom;
	private double valeur;
	private Unite unite;
	
	
	public Element(String nom, double valeur, Unite unite) {
		super();
		this.nom = nom;
		this.valeur = valeur;
		this.unite = unite;
	}



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @return the valeur
	 */
	public double getValeur() {
		return valeur;
	}


	/**
	 * @return the unite
	 */
	public Unite getUnite() {
		return unite;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}


	/**
	 * @param unite the unite to set
	 */
	public void setUnite(Unite unite) {
		this.unite = unite;
	}



	@Override
	public String toString() {
		return "Element [nom=" + nom + ", valeur=" + valeur + ", unite=" + unite + "]";
	}
	

}
