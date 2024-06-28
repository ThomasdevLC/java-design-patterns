package fr.diginamic.builder;

import static org.junit.Assert.*;


import org.junit.Test;

public class ProduitBuilderTest {


    @Test
    public void testProduitBuilder() {
        Produit produit = Produit.builder()
                .addNom("Produit A")
                .addGrade("A")
                .addCategorie("Catégorie A")
                .addMarque("Marque A")
                .addAllergene("Allergène A", 50.0)
                .addAdditif("Additif A", 20.0)
                .addIngredient("Ingrédient A", 100.0)
                .build();

        assertEquals("Produit A", produit.getNom());
        assertEquals("A", produit.getGrade());
        assertEquals("Catégorie A", produit.getCategorie().getNom());
        assertEquals("Marque A", produit.getMarque().getNom());
        assertEquals(1, produit.getAllergenes().size()); 
        assertEquals("Allergène A", produit.getAllergenes().get(0).getNom()); 
        assertEquals(1, produit.getAdditifs().size()); 
        assertEquals("Additif A", produit.getAdditifs().get(0).getNom()); 
        assertEquals(1, produit.getIngredients().size()); 
        assertEquals("Ingrédient A", produit.getIngredients().get(0).getNom()); 
    }

}
