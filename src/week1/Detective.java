package week1;

/**
 * @author      Ann Katrin Kuessner
 * @version 	1.0
 * @see 		https://open.sap.com/courses/java1
 * 
 * This code was used in the course Object-Oriented Programming in Java on openSAP 
 * in unit 1.1.0 : Classes and Objects
 * in unit 1.4.0 : Methods
 * in unit 1.5.0 : Attributes
 * in unit 1.6.0 : Methods with Return Values
 */

public class Detective {
	
	//attributes at the top of the class body
	String name;
	//String name = "Duke";
	int age;
	//more attributes
	boolean married;
	
	String lastname;
	
	
	//methods below attributes
	void speak(){
		System.out.println("Hello");
		//...
	}
	
	void speak2(){
		String name = getName();
		System.out.println("Hello " + name);
	}
	
	void speak3(){
		System.out.println("Hello " + getName());
	}
	
	void walk(){
		//...
	}
	
	void sayHelloWorld(){
		speak();
		System.out.println("World");
	}
	
	String getName(){
		return "Duke";
	}
	
	void sayHi(){
		String me = getName();
		System.out.println("Hi, I am " + me);
	}
	
	
	void sayName(){
		System.out.println(name + " " + lastname);
	}
	
}
