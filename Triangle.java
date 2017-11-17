package edu.buffalostate.cis425.sp17.exercises.vollmer; 

/*
 *
 * File: Triangle.java
 *
 * Create a Java class named Triangle that represents a "triangle" 
 * with the following characteristics:
 * 
 * 1) The class has three private integer instance variables 
 *    (S1, S2, S3) to store the sides of the triangle.
 * 2) This class has two constructors:
 *    Constructor #1 - has no parameters and initializes the 
 *    triangle's sides to 0
 *    Constructor #2 - has three integer parameters that 
 *    initializes the triangle's sides
 * 3) This class has a method calculatePerimeter( ) which 
 *    returns the perimeter (s1+s2+s3) of the triangle as an 
 *    integer
 * 4) This class contains a main( ) method which creates an 
 *    instance of the triangle object with 
 *    S1=10, S2=5, S3=2 and computes the object's perimeter 
 *    (via calculatePerimeter) and outputs the result to the 
 *    user's screen.
 *
 */

public class Triangle {

	private int side1, side2, side3;

	public Triangle () {

	}

	public Triangle (int s1, int s2, int s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}

	public int calculatePerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	public static void main( String args[] ) {
		Triangle t = new Triangle(10,5,2);
		System.out.println("The perimeter of t is: " + t.calculatePerimeter() );
	}
}