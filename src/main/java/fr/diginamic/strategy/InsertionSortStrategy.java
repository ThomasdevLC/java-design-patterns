package fr.diginamic.strategy;

public class InsertionSortStrategy  implements Strategy {
    @Override
    public void trier(Integer[] tableau) {
        for (int k = 1; k < tableau.length; k++) {
            int temp = tableau[k];
            int j = k - 1;
            while (j >= 0 && temp < tableau[j]) {
                tableau[j + 1] = tableau[j];
                j--;
            }
            tableau[j + 1] = temp;
        }
    }
}
