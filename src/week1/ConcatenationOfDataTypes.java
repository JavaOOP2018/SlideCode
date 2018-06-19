package week1;

/**
 * @author      Ann Katrin Kuessner
 * @version 	1.0
 * @see 		https://open.sap.com/courses/java1
 * 
 * This code was used in the course Object-Oriented Programming in Java on openSAP 
 * in unit 1.2.2.0 : Variables: Data Types and Concatenation
 */

public class ConcatenationOfDataTypes {

	public static void main(String[] args) {
		print();
		printWithNumbers();
		printAssignments();
	}
	
	static void print(){
		String first = "5";
		String second = "5";
		System.out.println(first + second);
	}
	
	static void printWithNumbers(){
		int number1 = 5;
		int number2 = 5;
		System.out.println(number1 + number2);
	}
	
	static void printAssignments(){
		int number1 = 5;
		int number2 = 5;
		number1 = number1 + number2; 
		System.out.println(number1);

	}


}
