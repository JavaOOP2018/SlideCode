package week1;

/**
 * @author      Ann Katrin Kuessner
 * @version 	1.0
 * @see 		https://open.sap.com/courses/java1
 * 
 * This code was used in the course Object-Oriented Programming in Java on openSAP 
 * in unit 1.7.1.0 : Boolean Logic
 */

class BooleanFun{

	void computations(){
		boolean first = true;
		boolean second = false;
		boolean resultAnd = first && second;
		boolean resultOr = first || second;
		boolean resultNot = !first;
		boolean resultEquals = (first == second); 
		boolean resultNotEquals = (first != second); 
	}
	
	boolean isTrue(){
		return true;
	}

}
