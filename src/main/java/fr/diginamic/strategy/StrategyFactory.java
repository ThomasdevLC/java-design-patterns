package fr.diginamic.strategy;

public class StrategyFactory {

    public static Strategy getStrategy(TypeTri typeTri) {
        switch (typeTri) {
            case BUBBLE_SORT:
                return new BubbleSortStrategy();
            case INSERTION_SORT:
                return new InsertionSortStrategy();
            case SELECTION_SORT:
                return new SelectionSortStrategy();
            default:
                throw new IllegalArgumentException("Type de tri non reconnu");
        }
    }

    public enum TypeTri {
        BUBBLE_SORT,
        INSERTION_SORT,
        SELECTION_SORT
    }
}
