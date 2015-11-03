package collegeboard;

import java.util.Scanner;

/**
 * @author Jitendra sonis
 * @version 1.0 Dated 10/29/2015
 */

public class NumberGuessingGame {

	/**
	 * Main method  
	 *
	 */
	public static void main(String[] args) {

		/* variable to store the last max guessed value */
		int maxNum = 100; 
		/* variable to store the last guessed min value */
		int minNum = 0; 
		/* new generated number */
		int newNum; 

		newNum = genRandomNumbers();
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		System.out.println("Guess a number (1-100): ");
		newNum = genRandomNumbers();
		do {
			 System.out.println("Is this the number "+newNum + "? : else type higher or lower");
            response = keyboard.next();
            if (response.equalsIgnoreCase("higher"))
				minNum = newNum;
            else if(response.equalsIgnoreCase("lower"))
				maxNum = newNum;
			else if (!response.equalsIgnoreCase("yes")){
				System.out.println("");	
				System.out.println("Please enter a valid response i.e. higher or lower");
			}
			newNum= genNumbers(maxNum,minNum,response);
			System.out.println("");
       } while (!response.equalsIgnoreCase("yes"));
	}

	/*
	 * Generates random generated number
	 * @returns an int
	 * 
	 */
	public static int genRandomNumbers() {
		int genNum = (int) (Math.random() * 99 + 1);
		return genNum;
	}

	
	/*
	 * Returns a number based on the current max and min number specified by the user
	 * @returns a calculated number based on the current max and min and the users last response 
	 */
	public static int genNumbers(int max, int min, String resp) {
		int diff;
		int genNum;
		diff = max - min;

		if (resp.equalsIgnoreCase("lower")) {
			genNum = max - diff / 2;
		} else {
			genNum = min + diff / 2;
		}
		return genNum;
	}
}
