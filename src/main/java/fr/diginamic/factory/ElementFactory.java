package fr.diginamic.factory;

public class ElementFactory {

    public static Element create(String nom, double valeur, Unite unite, String type) {
        
        if (type == null) {
            return null;
        }
        
        if ("ingredient".equals(type)) {  
            return new Ingredient(nom, valeur, unite);
            
        } else if ("additif".equals(type)) {
            return new Additif(nom, valeur, unite);
            
        } else if ("allergene".equals(type)) {
            return new Allergene(nom, valeur, unite);

        } else {
            return null;
        }
    }
}
