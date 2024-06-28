package fr.diginamic.strategy;

public class SelectionSortStrategy implements Strategy {

	@Override
	public void trier(Integer[] tableau) {
		 for (int i = 0; i < tableau.length - 1; i++) {
	            int index = i;
	            for (int j = i + 1; j < tableau.length; j++) {
	                if (tableau[j] < tableau[index]) {
	                    index = j; // recherche de l'index le plus petit
	                }
	            }
	            int plusPetit = tableau[index];
	            tableau[index] = tableau[i];
	            tableau[i] = plusPetit;
	        }
	}

}
