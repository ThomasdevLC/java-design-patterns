package fr.diginamic.builder;

public class Additif {
    private String nom;
    private double qteMilligramme;

    public Additif(String nom, double qteMilligramme) {
        this.nom = nom;
        this.qteMilligramme = qteMilligramme;
    }

    // Getters and Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQteMilligramme() {
        return qteMilligramme;
    }

    public void setQteMilligramme(double qteMilligramme) {
        this.qteMilligramme = qteMilligramme;
    }
    @Override
    public String toString() {
        return "Additif: " + nom + " - Quantité en milligrammes: " + qteMilligramme;
    }
}