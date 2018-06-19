package week1;

/**
 * @author Ann Katrin Kuessner
 * @version 1.0
 * @see https://open.sap.com/courses/java1
 * 
 *      This code was used in the course Object-Oriented Programming in Java on openSAP in unit 1.5.0 : Attributes
 */

class AccessAttributes {

	public static void main(String[] args) {
		Detective ourDetective = new Detective();
		ourDetective.name = "Duke";
		System.out.println(ourDetective.name);

		ourDetective.name = "Tom";
		System.out.println(ourDetective.name);
		ourDetective.speak();
	}

}
