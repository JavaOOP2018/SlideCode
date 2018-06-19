package week1;

/**
 * @author Ann Katrin Kuessner
 * @version 1.0
 * @see https://open.sap.com/courses/java1
 * 
 *      This code was used in the course Object-Oriented Programming in Java on openSAP in unit 1.8.0 : Comparisons
 */

public class Comparisons {

	static void compareWithEquals() {
		int a = 2;
		int b = 3;
		int c = 2;
		System.out.println("a == b: " + (a == b));
		System.out.println("a == c: " + (a == c));
		System.out.println("b == c: " + (b == c));
	}

	static void compareWithSmallerBiggerOrEquals() {
		double a = 2.0;
		double b = 3.0;
		double c = 2.0;
		System.out.println("a >  b: " + (a > b));
		System.out.println("a <  b: " + (a < b));
		System.out.println("a >= c: " + (a >= c));
	}

	static void compareObjects() {
		String first = "Hello";
		String second = new String("Hello");
		boolean doNotDoThis = (first == second);
		boolean doThat = first.equals(second);
	}
}
