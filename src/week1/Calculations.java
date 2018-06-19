package week1;

/**
 * @author      Ann Katrin Kuessner
 * @version 	1.0
 * @see 		https://open.sap.com/courses/java1
 * 
 * This code was used in the course Object-Oriented Programming in Java on openSAP 
 * in unit 1.2.3.0 : Variables : Arithmetic Operations
 */

class Calculations {
	
	static void calculate(){
		int number1 = 42;
		int number2 = 21;
		System.out.println(number1 - number2);
		System.out.println(number1 / number2);
		System.out.println(number2 * 2);
	}
	
	static void calculate2(){
		int number1 = 0;
		number1 = number1 + 2;
		System.out.println(number1);
	}
	
	static void shorthand(){
		int number = 0;
		number += 2;
		number++;

	}
	
	static void nonShorthand(){
		int number = 0;
		number = number + 2;
		number = number + 1;
	}
	
	static void divisionByInt(){
		int number1 = 5;
		number1 = number1 / 2;
		System.out.println(number1);

	}
	
	static void moduloOnInt(){
		int number1 = 5;
		number1 = number1 % 2;
		System.out.println(number1);
	}
	
	static void calculationsWithFloatingPointNumbers(){
		double weight = 42.2;
		weight--;
		weight *= 2;
		
		double number1 = 5;
		number1 /= 2;
		System.out.println(number1);
		
	}
	static void FloatingPointNumersAreEvil(){
		double number1 = 0.3;
		double number2 = 0.1;
		System.out.println(number1 - number2);
	}
	
}
