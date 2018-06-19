package week1;

/**
 * @author Ann Katrin Kuessner
 * @version 1.0
 * @see https://open.sap.com/courses/java1
 * 
 *      This code was used in the course Object-Oriented Programming in Java on openSAP in unit 1.9.0 : Conditions
 */

public class Conditions {

	public static void main(String[] args) {
		Detective2 duke = new Detective2();
		Weather weather = new Weather();

		if (weather.isSunny()) {
			duke.putOnSunglasses();
		} else {
			duke.goOutside();
		}

		if (weather.isSunny()) {
			duke.putOnSunglasses();
		} else if (weather.isRainy()) {
			duke.fetchUmbrella();
		} else {
			duke.goOutside();
		}
	}

}
