package edu.buffalostate.cis425.sp17.exercises.vollmer; 

/* * File: NumberAdder.java * * Description: This class adds its two instance variables *
 *  when the getSum() method is called. * * Assignment: 
 *  1) Add a getDifference method (to subtract num1-num2) *
 *   2) Add a getMult method to multiply the numbers *
 *    3) Add a getDiv method to divide the numbers num1/num2 * - check if num2 is not equal to 0.0 before division * 
 *    - if num2 is 0.0 return the value: Double.NaN *
 *     4) Test the new methods in the main() and display the output */
 /*
 *
 * @author Corey Vollmer
 *
 */ 

public class NumberAdder{
    private double num1;
    private double num2;

    public static void main(String args[]){  // creates two instances of this class and tests its * setNums() and getSum() methods */  
        NumberAdder adder1 = new NumberAdder(); // Create two instances
        NumberAdder adder2 = new NumberAdder();
        adder1.setNums(10,15);                  // Set the instances' values
        adder2.setNums(100,200);
        System.out.println("Sum of adder1 = " + adder1.getSum());  // Print the values
        System.out.println("Sum of adder2 = " + adder2.getSum());
        
        System.out.println("Difference of adder1 = " + getDifference(adder1));
        System.out.println("Difference of adder2 = " + getDifference(adder2));
        
        System.out.println("Product of adder1 = " + getMult(adder1));
        System.out.println("Product of adder2 = " + getMult(adder2));
  
        System.out.println("Quotient of adder1 = " + getDiv(adder1));
        System.out.println("Quotient of adder2 = " + getDiv(adder2));
        
        adder1.setNums(50, 0);
        System.out.println("Quotient of 50/0 = " + getDiv(adder1));
        
    } // end main
    
    public void setNums(double n1, double n2){ // sets the two instance variables from the given parameters
        num1 = n1;
        num2 = n2;
    } // end setNums

  public double getSum(){
        return num1 + num2 ;
    } // end getSum
  
  public static double getDifference(NumberAdder nA){
	  return nA.num1 - nA.num2;
  } // end getDifference

  public static double getMult(NumberAdder nA){
	  return nA.num1 * nA.num2;
  } // end getMult
  
  public static double getDiv(NumberAdder nA){
	  if(nA.num2 ==0.0){
		  return Double.NaN;
	  } // end if
	  return nA.num1/nA.num2;
  } // end getDiv
} // end NumberAdder