package edu.buffalostate.cis425.sp17.assignments.vollmer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//@author: Corey Vollmer

public class ReadCSV {
	
	private static String[] months;
	private static String[] monthName;
	private static String[] days;
	public static void main(String args[]){
		if(createStructure()){
			display();
		}
	}
	
	
	//reads file and creates basic array structures
	public static boolean createStructure(){
		readFile();
		return true;
	}
	
	//lines that strictly read file for clean code
	public static void readFile(){
		String csvFile = "src/edu/buffalostate/cis425/cis425_io.txt";
		String line = "";
		String[] lineSplit = new String[3];
		months = new String[12];
		monthName = new String[12];
		days = new String[12];
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			int i = 0;
			while((line = br.readLine()) != null){
				lineSplit = line.split(",");
				months[i] = lineSplit[0];
				monthName[i] = lineSplit[1];
				days[i] = lineSplit[2];
				i++;
			}
		} catch( IOException e){
			e.printStackTrace();
		}
	}
	
	//display console andd format
	public static void display(){
		System.out.println("--------------------------");
		System.out.println("| No | Month Name | Days |");
		System.out.println("--------------------------");
		String line = "";
		for(int i=0;i<12; i++){
			System.out.print("|");
			System.out.printf("%4s"," "+months[i]+" ");
			System.out.print("|");
			System.out.printf("%-12s"," "+monthName[i]);
			System.out.print("|");		
			System.out.printf("%6s"," " + days[i]+" ");		
			System.out.println("|");
		}
		System.out.println("--------------------------");
	}
}
