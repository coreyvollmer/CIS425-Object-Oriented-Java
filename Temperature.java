package edu.buffalostate.cis425.sp17.exercises.vollmer; 
/* * File: Temperature.java * * Assignment:
 *  1) Add two new methods: * incrementTemp() * decrementTemp() * that increment and decrement the current temperature value *
 *   by one degree respectively *
 *   
 *    2) Add a method: changeTemp( double t ) that adds t to the current temperature *
 *     3) Add a main() method to this class *
 *      4) In the main method: create two instances of the Temperature * object each with a different temperature *
 *       5) Call the getTemp() method in each of the temperature objects * and print the result to the users screen * 
 *       6) Call the incrementTemp(), decrementTemp() and changeTemp(t) * methods several times from the main() 
 *       (use getTemp() to see * if the temperature did change) * Remember that there should not be any print statements in the 
 * Temperature class - The print statements display the temperature 
 * changes should be in the main() method.
 * * Description: This class stores the current temperature. * It contains access methods to set and get the temperature. * */ 
/*
 *
 * @author Corey Vollmer
 *
 */

public class Temperature{
    private double currentTemp;
    
    public static void main(String args[]){
    	Temperature tempObject1 = new Temperature(); // creates first temp object
    	tempObject1.setTemp(60);
    	
    	Temperature tempObject2 = new Temperature(); // creates second temp object
    	tempObject2.setTemp(70);
    	
    	tempObject1.incrementTemp(); // 61
    	tempObject1.incrementTemp(); // 62
    	tempObject1.incrementTemp(); // 63
    	System.out.println(tempObject1.getTemp()); // Prints 63.0   	
    	tempObject1.setTemp(80.3);
    	System.out.println(tempObject1.getTemp()); // Prints 80.3
    	
    	tempObject2.decrementTemp(); // 69
    	tempObject2.decrementTemp(); // 68
    	tempObject2.decrementTemp(); // 67
    	System.out.println(tempObject2.getTemp()); // Prints 67.0  	
    	tempObject2.setTemp(32.8);
    	System.out.println(tempObject2.getTemp()); // Prints 32.8
    }


    public void setTemp(double t){ // setTemp() sets the temperature to the given value * @param t -- the given value
        currentTemp = t;
    } // end setTemp

 /** * getTemp() returns the current temperature */     
    public double getTemp(){
        return currentTemp;
    } // end currentTemp
    
    public double incrementTemp(){
    	return currentTemp++; // increments temp using post incrementing operator 
    } // end incrementTemp
    
    public double decrementTemp(){
    	return currentTemp++; // decrements temp using post decrementing operator 
    } // end decrementTemp
    
    public double changeTemp(double t){ // changeTemp( double t ) adds t to current temperature and * then returns the (new) temperature 
    	return currentTemp + t;
    } // end changeTemp

    } // end Temperature