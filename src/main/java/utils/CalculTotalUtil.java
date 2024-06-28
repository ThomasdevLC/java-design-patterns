package utils;

public class CalculTotalUtil {

	public static double calculerTotal(double montantBase, int nbPlaces, boolean isPremium, double reduction) {
		double total = montantBase * nbPlaces;
		if (isPremium) {
			total *= (1 - reduction / 100.0);
		}
		return total;
	}
}
