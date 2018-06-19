package week1;

/**
 * @author Ann Katrin Kuessner
 * @version 1.0
 * @see https://open.sap.com/courses/java1
 * 
 *      This code was used in the course Object-Oriented Programming in Java on openSAP in unit 1.10.0 : Deep Dive
 */
public class CodeConventions {
	String title = "Catch villains";

	public static void main(String[] args) {
		Detective2 ourDetective = new Detective2();
		boolean human = ourDetective.isHuman();

		System.out.print("Hello ");
		System.out.print("Duke");
		System.out.println();

	}

	static void calculate(String[] args) {
		double x = 42.1;
		double y = Math.floor(x);
		System.out.println(y);
	}

	static void stringManipulations() {
		String output = "Hello Duke";
		System.out.println(output.charAt(7));
		System.out.println(output.toUpperCase());
	}

}
