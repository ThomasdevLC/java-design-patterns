package fr.diginamic.strategy;

import fr.diginamic.strategy.StrategyFactory;
import fr.diginamic.strategy.StrategyFactory.TypeTri;

public class DemoTri2 {

 public static void main(String[] args) {
     Strategy triBubble = StrategyFactory.getStrategy(TypeTri.BUBBLE_SORT);
     Strategy triInsertion = StrategyFactory.getStrategy(TypeTri.INSERTION_SORT);
     Strategy triSelection = StrategyFactory.getStrategy(TypeTri.SELECTION_SORT);

     System.out.println("Bubble Sort:");
     Integer[] array1 = {12, -5, 7, 0, 8, 4, -3, 9, 15};
     triBubble.trier(array1);
     afficherTableau(array1);
     System.out.println("");

     System.out.println("insertion Sort:");
     Integer[] array2 = {12, -5, 7, 0, 8, 4, -3, 9, 15};
     triInsertion.trier(array2);
     afficherTableau(array2);
     System.out.println("");

     System.out.println("selection Sort:");
     Integer[] array3 = {12, -5, 7, 0, 8, 4, -3, 9, 15};
     triSelection.trier(array3);
     afficherTableau(array3);
 }

 private static void afficherTableau(Integer[] tableau) {
     for (int i = 0; i < tableau.length; i++) {
         System.out.print(tableau[i] + " ");
     }
 }
}
