package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class ProduitBuilder {
    private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private List<Allergene> allergenes = new ArrayList<>();
    private List<Additif> additifs = new ArrayList<>();
    private List<Ingredient> ingredients = new ArrayList<>();

    public ProduitBuilder addNom(String nom) {
        this.nom = nom;
        return this;
    }

    public ProduitBuilder addGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public ProduitBuilder addCategorie(String categorieNom) {
        this.categorie = new Categorie(categorieNom);
        return this;
    }

    public ProduitBuilder addMarque(String marqueNom) {
        this.marque = new Marque(marqueNom);
        return this;
    }

    public ProduitBuilder addAllergene(String allergeneNom, double qteMilligramme) {
        this.allergenes.add(new Allergene(allergeneNom, qteMilligramme));
        return this;
    }

    public ProduitBuilder addAdditif(String additifNom, double qteMilligramme) {
        this.additifs.add(new Additif(additifNom, qteMilligramme));
        return this;
    }

    public ProduitBuilder addIngredient(String ingredientNom, double qteMilligramme) {
        this.ingredients.add(new Ingredient(ingredientNom, qteMilligramme));
        return this;
    }

    public Produit build() {
        return new Produit(nom, grade, categorie, marque, allergenes, additifs, ingredients);
    }
}

