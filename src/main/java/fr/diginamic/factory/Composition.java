package fr.diginamic.factory;

public class Composition {

	    public static  void main(String[] args) {
	        Element ingredient = ElementFactory.create("Sucre", 5.0, Unite.MILLI_GRAMMES, "ingredient");
	        Element additif = ElementFactory.create("Colorant", 0.1, Unite.MICRO_GRAMMES, "additif");
	        Element allergene = ElementFactory.create("Arachides", 2.0, Unite.MILLI_GRAMMES, "allergene");

	        System.out.println(ingredient.toString()); 
	        System.out.println(additif.toString());    
	        System.out.println(allergene.toString()); 
	    }
	}


