package fr.diginamic.builder;

public class Allergene  {
	
	
	private String nom;
	private double qteMilligramme;
	
	public Allergene(String nom, double qteMilligramme) {
		this.nom = nom;
		this.qteMilligramme = qteMilligramme;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the qteMilligramme
	 */
	public double getQteMilligramme() {
		return qteMilligramme;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param qteMilligramme the qteMilligramme to set
	 */
	public void setQteMilligramme(double qteMilligramme) {
		this.qteMilligramme = qteMilligramme;
	}
	
	  @Override
	    public String toString() {
	        return "Allergène: " + nom + " - Quantité en milligrammes: " + qteMilligramme;
	    }
	

}
