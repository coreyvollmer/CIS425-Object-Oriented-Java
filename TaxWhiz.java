package edu.buffalostate.cis425.sp17.exercises.vollmer;

/*
*
* @author Corey Vollmer
*
*/

import java.text.DecimalFormat;

public class TaxWhiz { // TaxWhiz() constructor creates an object with * a given tax rate * @param t -- the given tax rate
	public double taxRate, basePrice, salesTax, total;
    public static String dfTotal; // decimal formatted total for receipt spacing calculation
    public static int recieptCount = 1; // to be able to identify between separate receipts


	public static void main(String args[]) {
		TaxWhiz tWObject1 = new TaxWhiz(8.75); // 8.75% tax rate
		tWObject1.basePrice = 59.99; // The price tag value
		tWObject1.salesTax = calcTax(tWObject1.basePrice, tWObject1); // calculates sales tax value
		tWObject1.total = tWObject1.basePrice + tWObject1.salesTax; // calculates total price
		printReciept(tWObject1);

		TaxWhiz tWObject2 = new TaxWhiz(4.75); // 4.75% tax rate
		tWObject2.basePrice = 169.99; // The price tag value
		tWObject2.salesTax = calcTax(tWObject2.basePrice, tWObject2); // calculates sales tax value
		tWObject2.total = tWObject2.basePrice + tWObject2.salesTax; // calculates total price
		printReciept(tWObject2);
		
		tWObject1.taxRate++; // increments tax rate by 1%
		tWObject1.salesTax = calcTax(tWObject1.basePrice, tWObject1); // calculates new sales tax value
		tWObject1.total = tWObject1.basePrice + tWObject1.salesTax; // calculates new total price
		printReciept(tWObject1);
		
		tWObject2.taxRate++;  // increments tax rate by 1%
		tWObject2.salesTax = calcTax(tWObject2.basePrice, tWObject2); // calculates new sales tax value
		tWObject2.total = tWObject2.basePrice + tWObject2.salesTax; // calculates new total price
		printReciept(tWObject2);
	}

	public TaxWhiz(double t) {
		taxRate = t;
	}

	public static double calcTax(double purchase, TaxWhiz tW) { 
		return (tW.taxRate/100) * purchase;
	}

	public void changeTax(double t) { 
		taxRate = t;
	}

	private static void printReciept(TaxWhiz tW) {
		DecimalFormat df = new DecimalFormat(".##");
		System.out.println();
		System.out.println("-----Generated Reciept-----");
		System.out.println("---------------------------");
		if(Double.toString(tW.basePrice).length()==5){ // case for ##.##
			System.out.print("Item:                ");
		}
		else if(Double.toString(tW.basePrice).length()==6){ // case for ###.##
			System.out.print("Item:               ");
		}
	
		System.out.println("$" + tW.basePrice);
		System.out.println();
		System.out.print("Tax Rate:             ");
		System.out.println(tW.taxRate + "%");
		System.out.print("Sales Tax:            ");
		System.out.println("$" + df.format(tW.salesTax));
		System.out.println("---------------------------");
		dfTotal = df.format(tW.total);
		if(dfTotal.length()==5){ // case for ##.##
			System.out.print("Total:               ");
		}
		else if(dfTotal.length()==6){ // case for ###.##
			System.out.print("Total:              ");
		}
		System.out.println("$" + df.format(tW.total));
		System.out.println("---------------------------");
		System.out.println("---Thank you, come again---");
		System.out.println("-----Reciept #0000000" + recieptCount++ + "-----");
		
		System.out.println();
	}

} // end TaxWhiz