package edu.buffalostate.cis425.sp17.exercises.vollmer; 

/*
 * File: NumberCruncher.java
 *
 * Description: This class stores a number and contains
 *  methods to calculate the number's double, triple, and so on.
 *
 * Assignment: 1) add a new method cubeNumber() that returns the number^3 
 *                power (num*num*num)
 *             2) add a new method sixthNumber() that returns the number^6 
 *                power, but it can use only one multiplication in the 
 *                method (can't use num*num*num*num*num*num). Hint use the 
 *                other methods that are available - and do not use the 
 *                Math.pow() function
 *             3) Test cubeNumber() and sixthNumber() in the main method
 */

public class NumberCruncher{
    private double num;

    public NumberCruncher(double number){
        num = number;
    }

    public double getNum(){
        return num;
    }

    public double doubleNum(){
        return num * 2;
    }

    public double tripleNum(){
        return num * 3;
    }

    public double squareNum(){
        return num * num;
    }
    
    public double cubeNum(){
    	return squareNum() * num;
    }

    public double sixthNum(){
    	return cubeNum() * cubeNum();
    }
    public static void main( String args[] ){
        NumberCruncher cruncher1 = new NumberCruncher(10);
        System.out.println("Value of num is " + cruncher1.getNum());
        System.out.println("num doubled is " + 	cruncher1.doubleNum());
        System.out.println("num tripled is " + cruncher1.tripleNum());
        System.out.println("num squared is " + cruncher1.squareNum());
        System.out.println("num cubed is " + cruncher1.cubeNum());
        System.out.println("num to the 6th power is " + cruncher1.sixthNum());

    } // end main
} // end NumberCruncher