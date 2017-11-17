package edu.buffalostate.cis425.sp17.exercises.vollmer; 


public class Donor
{
    private String name = "no name";
    private String rating = "none";
    private String address = "";

    /**
     * Donor() constructor sets the object's name and rating
     * @param str -- a String giving the donor's name
     * @param str2 -- a String giving the donor's rating
     */
    public Donor(String inName, String inRating, String inAddress)
    {
        name = inName;
        rating = inRating;
        address = inAddress;
    }
    
    public Donor(String inName, String inRating)
    {
        name = inName;
        rating = inRating;
    }

    /**
     * getName() returns the donor's name
     * @return a String giving the person's name
     */

    
    public void updateRating(Double amt){
    	if(amt==0){
    		this.rating = "none";
    	}
      	if(amt<100){
    		this.rating = "low";
    	}
      	if(amt>=100 && amt <=1000){
    		this.rating = "medium";
    	}
      	if(amt>=1000){
    		this.rating = "high";
    	}
    }
    
    public String getName()
    {
        return name;
    }

    /**
     * getRating() returns the donor's rating
     * @return a String giving the person's rating
     */
    public String getRating()
    {
        if (rating.equals ("high"))
            return "high";
        if (rating.equals ("medium"))
            return "medium";
        if (rating.equals ("low"))
        	return"low";

        return "none";
    }

    /**
     * main() creates three Donor instances and tests this
     *  classes methods.
     */
    public static void main (String argv[])
    {
        Donor donor1 = new Donor("NewDonor", "high");
        System.out.println("Donor's name is " + donor1.getName());
        System.out.println(donor1.getName() + "'s rating is " + donor1.getRating());

        Donor donor2 = new Donor("NewDonor2", "medium");
        System.out.println("Donor's name is " + donor2.getName());
        System.out.println(donor2.getName() + "'s rating is " + donor2.getRating());

        Donor donor3 = new Donor("NewDonor3", "none");
        System.out.println("Donor's name is " + donor3.getName());
        System.out.println(donor3.getName() + "'s rating is " + donor3.getRating());
        
        Donor donor4 = new Donor("NewDonor4","low");
        System.out.println("Donor's name is " + donor4.getName());
        System.out.println(donor4.getName() + "'s rating is " + donor4.getRating());
        
        donor4.updateRating(150.0);
        System.out.println(donor4.getName() + "'s rating is " + donor4.getRating());
    } // main()
} // Donor