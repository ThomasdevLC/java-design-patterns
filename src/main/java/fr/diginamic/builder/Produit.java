package fr.diginamic.builder;

import java.util.List;

public class Produit {
    private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private List<Allergene> allergenes;
    private List<Additif> additifs;
    private List<Ingredient> ingredients;

    public Produit(String nom, String grade, Categorie categorie, Marque marque,
                   List<Allergene> allergenes, List<Additif> additifs, List<Ingredient> ingredients) {
        this.nom = nom;
        this.grade = grade;
        this.categorie = categorie;
        this.marque = marque;
        this.allergenes = allergenes;
        this.additifs = additifs;
        this.ingredients = ingredients;
    }

    // Getter methods
    public String getNom() {
        return nom;
    }

    public String getGrade() {
        return grade;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    // Static method to create a new ProduitBuilder instance
    public static ProduitBuilder builder() {
        return new ProduitBuilder();
    }
}

