package edu.buffalostate.cis425.sp17.exercises.vollmer;

/*
*
* @author Corey Vollmer
*
*/ 

public class Box {
	
	private double length, width, height;
	private static double weight;
	
	public Box(){
		length = 0;
		width = 0;
		height = 0;
		weight = 0;
	}
	
	public Box(double len, double wid, double hei, double wei){
		this.length = len;
		this.width = wid;
		this.height = hei;
		this.weight = wei;
	}

	public static void main(String[] args) {
		Box theBox = new Box(1,5,5,2600);
		System.out.println("The box has a volume of " + calculateVolume(theBox) + " cubic feet.");
		System.out.println("The box has a density of " + calculateDensity(theBox) + " pounds per cubic foot.");
	}
	
	public static double calculateVolume(Box box){
		return box.length * box.height * box.width;
	}
	
	public static double calculateDensity(Box box){
		if(calculateVolume(box)==0){
			return Double.NaN;
		}
		return weight/calculateVolume(box);
	}
}
