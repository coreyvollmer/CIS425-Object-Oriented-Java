package edu.buffalostate.cis425.sp17.exercises.vollmer; 

import java.io.IOException;

/* * File: CubeUser.java * * Description: This class creates an instance of the Cube * 
 * class and prints its area and volume. * * Assignment: 1) Create 3 cube objects. 
 * The size of each of the cubes * should be input from the keyboard * 
 * (hint: study the code below) * 2) Print the Side length, Surface area
 *  and Volume to the * users screen for each of the cubes * 3) The program should 
 *  catch input error exceptions and * deal with them in a reasonable manner * */

import java.util.Scanner;

public class CubeUser{
	static Double[] lengths = new Double[3];
	static Cube c1, c2, c3;
	private static Scanner sc;
	
    public static void main(String args[]) throws IOException{	
// HINT: input the side from the keyboard and check for errors and exceptions
    	run();

    } // main()
    
    public static void getInput(){
    	sc = new Scanner(System.in);
    	System.out.print("Enter the size of the first cube's side: ");
    	lengths[0] = sc.nextDouble();
    	
    	System.out.print("Enter the size of the second cube's side: ");
    	lengths[1] = sc.nextDouble();
    	
    	System.out.print("Enter the size of the third cube's side: ");
    	lengths[2] = sc.nextDouble();
    }

    
    public static void run(){
    	try{
    		getInput();
    		print();
    	}catch(Exception e){
    		System.out.println("Error: " + e);
    	}finally{
    		run();
    	}
    	sc.close();
    }
    
    public static void print(){
    	
     	c1 = new Cube(lengths[0]);
    	c2 = new Cube(lengths[1]);
    	c3 = new Cube(lengths[2]);
    	
        System.out.println("Side length of cube1 is " + c1.getLength());
        System.out.println("Surface Area of cube1 is " + c1.calculateSurfaceArea());
        System.out.println("Volume of cube1 is " + 	c1.calculateVolume());
        
        System.out.println("Side length of cube2 is " + c2.getLength());
        System.out.println("Surface Area of cube2 is " + c2.calculateSurfaceArea());
        System.out.println("Volume of cube2 is " + 	c2.calculateVolume());
        
        System.out.println("Side length of cube3 is " + c3.getLength());
        System.out.println("Surface Area of cube3 is " + c3.calculateSurfaceArea());
        System.out.println("Volume of cube3 is " + 	c3.calculateVolume());
    }
    public static class Cube{
    	private double length;
    	
		Cube(double side){
    		this.length = side;
    	}
    	
    	public double getLength(){
    		return length;
    	}
    	
    	public double calculateSurfaceArea(){
    		return length*length*6;
    	}
    	
    	public double calculateVolume(){
    		return length*length*length;
    	}
    }
} // CubeUser


