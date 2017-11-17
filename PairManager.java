package edu.buffalostate.cis425.sp17.exercises.vollmer;

import java.util.Scanner;

public class PairManager {
	private static int one, two;
	
	PairManager(){
		one = 0;
		two = 0;
	}
	
	public static void main(String[] args){
		PairManager pm = new PairManager(); // Initialize object
		if(getPair()){ // If pairs are set successfully
			System.out.println("The first integer is " +one+ ", the second integer is "+two+"."); // output the pairs
			System.out.println("The average is " + compAverage()+"."); // output the average
			
		}else{ // if pairs aren't set successfully
			System.out.println("Something went wrong ):");
		}
		
	}
	
	private static int getInput(String prompt){
		Scanner reader = new Scanner(System.in);;
		boolean done = false;
		int temp = 0;
		do{
			System.out.println(prompt);
			try{
				temp = reader.nextInt();
				done = true;
			}catch(Exception e){
				System.out.println("Error: "+e);
			}
		}while(!done);

		return temp;
	}
	
	public static boolean getPair(){
		one = getFirst();
		two = getSecond();
		return true;
	}
	
	public static int getFirst(){
		return getInput("Enter the first integer: ");
	}
	
	public static int getSecond(){
		return getInput("Enter the second integer: ");
	}
	
	public static int compAverage(){
		return (one+two)/2;
	}

}
