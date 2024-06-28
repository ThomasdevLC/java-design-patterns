package fr.diginamic.builder;

public class ProduitCreate {
	  public static void main(String[] args) {
	        Produit produit = Produit.builder()
	                .addNom("Produit A")
	                .addGrade("A")
	                .addCategorie("Catégorie A")
	                .addMarque("Marque A")
	                .addAllergene("Allergène A", 50.0)
	                .addAdditif("Additif A", 20.0)
	                .addIngredient("Ingrédient A", 100.0)
	                .build();

	        System.out.println("Produit: " + produit.getNom());
	        System.out.println("Grade: " + produit.getGrade());
	        System.out.println("Catégorie: " + produit.getCategorie().getNom());
	        System.out.println("Marque: " + produit.getMarque().getNom());
	        System.out.println("Allergènes: " + produit.getAllergenes());
	        System.out.println("Additifs: " + produit.getAdditifs());
	        System.out.println("Ingrédients: " + produit.getIngredients());
	    }
}
