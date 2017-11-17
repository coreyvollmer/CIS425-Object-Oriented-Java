package edu.buffalostate.cis425.sp16.exercises.vollmer;

import java.text.DecimalFormat;

/* 
 * File: Average.java
 * 
 * Write a program that inputs 10 integers from the keyboard and 
 * computes their average.
 * if the user enters 9999, the program exits early, and outputs 
 * the average of the numbers entered so far.
 */

/*
 *
 * @author Corey Vollmer
 *
 */

//
// If you are against me using the double data type I will create a version that follows your description more strictly.
//

import java.util.Scanner;

public class Average {
	
	private static double ave = 0, num = 0, sum = 0, cnt = 0;
	private static int numOfValues = 10; // This value can easily change the number of inputs
	
	public static void main(String args[]) {
		run(); // Get user input
		finalOut(); // Calculate and output average
	} // end main
	
	private static void run(){ // computes an average from a set of input values
		Scanner sc = new Scanner(System.in);
		System.out.println("Integer/Double Averaging Program");
		System.out.println("Enter " + numOfValues + " Numbers");
		for (int i = 1; i <= numOfValues; i++) {
			num = 0;
			System.out.print("Enter Number " + i + ": ");
			try {
				num = sc.nextDouble();
			} catch (Exception e) {
				System.out.println("An error has occured.");
				System.out.println("Error: " + e);
				i--; // keep correct count
				sc = new Scanner(System.in); // Reset the state of sc object to	eliminate error
				continue; // Continues to next for loop iteration
			} // end catch
			cnt++;
			sum = sum + num;
			if(num == 9999){
				break;
			}	
		} // end for
		sc.close();
	} // end run
	
	private static void finalOut(){ // Displays the final result in the console
		ave = sum / cnt;
		
		DecimalFormat df = new DecimalFormat(".###"); // Formats the output to a maximum of 3 decimal places.
		System.out.println("The average of " + (int) cnt + " numbers is " + df.format(ave));
	} // end finalOut
} // end class Average