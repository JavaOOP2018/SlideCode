package week1;

/**
 * @author      Ann Katrin Kuessner
 * @version 	1.0
 * @see 		https://open.sap.com/courses/java1
 * 
 * This code was used in the course Object-Oriented Programming in Java on openSAP 
 * in unit 1.4.0: Methods
 */

class MethodCalls{
	   void initial(){
		first();
		second();
		System.out.println("Last");
	   }
	   void second(){
		System.out.println("Second");
		third();
	   }
	   void first(){
		System.out.println("First");
	   }
	   void third(){
		System.out.println("Third");
	   }  
}