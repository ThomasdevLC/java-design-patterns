package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElementFactoryTest {

	@Test
    public void testCreateIngredient() {
        Element ingredient = ElementFactory.create("Sucre", 5.0, Unite.MILLI_GRAMMES, "ingredient");
 
        assertEquals("Sucre", ingredient.getNom());
        assertEquals(5.0, ingredient.getValeur(), 0.0001);
        assertEquals(Unite.MILLI_GRAMMES, ingredient.getUnite());
    }

    @Test
    public void testCreateAdditif() {
        Element additif = ElementFactory.create("Colorant", 0.1, Unite.MICRO_GRAMMES, "additif");
        assertNotNull(additif);
        assertTrue(additif instanceof Ingredient); 
        assertEquals("Colorant", additif.getNom());
        assertEquals(0.1, additif.getValeur(), 0.0001);
        assertEquals(Unite.MICRO_GRAMMES, additif.getUnite());
    }

    @Test
    public void testCreateAllergene() {
        Element allergene = ElementFactory.create("Arachides", 2.0, Unite.MILLI_GRAMMES, "allergene");
        assertNotNull(allergene);
        assertTrue(allergene instanceof Allergene);
        assertEquals("Arachides", allergene.getNom());
        assertEquals(2.0, allergene.getValeur(), 0.0001);
        assertEquals(Unite.MILLI_GRAMMES, allergene.getUnite());
    }

    @Test
    public void testInvalidType() {
        Element element = ElementFactory.create("Test", 1.0, Unite.MICRO_GRAMMES, "autre");
        assertNull(element);
    }
}
