package Intro;

import java.io.BufferedReader;

/**
 * @author      Ann Katrin Kuessner
 * @version 	1.0
 * @see 		https://open.sap.com/courses/java1
 * 
 * This code was used in the course Object-Oriented Programming in Java on openSAP 
 * in unit I.1.0 : Introduction to Programming
 */

import java.io.IOException;
import java.io.InputStreamReader;

public class GuessANumber {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 100);
		
		boolean userHasGuessedCorrectly = false;
		
		while(userHasGuessedCorrectly == false){
			int userGuess  = getUserGuess();
			if(userGuess == number){
				System.out.println("Congratulations");
				userHasGuessedCorrectly = true;
		   	}else if(userGuess < number){
		   		System.out.println("Too low");
		   	}else if(userGuess > number){
		   		System.out.println("Too high");
		    }	
		}
	}

	private static int getUserGuess(){
		try{
			InputStreamReader read = new InputStreamReader(System.in);
    		BufferedReader in = new BufferedReader(read);
    		System.out.println("Enter a number between 0 and 99:");
    		return Integer.parseInt(in.readLine());
		}catch(NumberFormatException e) {
    		System.out.println("Not a valid input");
    		return getUserGuess();
    	}catch(IOException e){
    		System.out.println("Not a valid input");
    		return getUserGuess();
    	}
    }  
}
