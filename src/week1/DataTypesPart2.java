package week1;

/**
 * @author      Ann Katrin Kuessner
 * @version 	1.0
 * @see 		https://open.sap.com/courses/java1
 * 
 * This code was used in the course Object-Oriented Programming in Java on openSAP 
 * in unit 1.2.1.0 : Variables: Data Types and Concatenation
 */

public class DataTypesPart2 {

	public static void main(String[] args) {
		print();
		print2();
	}
	
	static void print(){
		String output = "Hello Duke";
		System.out.println(output + "!");
	}
	
	static void print2(){
		String welcome = "Hello";
		String name = "Duke";
		System.out.println(welcome + " " + name);
	}


}
