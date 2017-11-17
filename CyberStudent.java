package edu.buffalostate.cis425.sp17.exercises.vollmer; 

  /* @author Corey Vollmer
  * @version 1.0 
  * @since Put the date here (2017-04-11)
  */ 

public class CyberStudent {
	
   static boolean State, SubState;  
   //state false = awake, true = asleep
   //state false, substate false = eating, true = working
   //state true, substate false = dreaming, true = snoring
   
   static String Name;

   public CyberStudent(String name) {
	  CyberStudent.Name = name; 
	  CyberStudent.State = true; // sleeping
	  CyberStudent.SubState = false; // dreaming
   } // end CyberStudent()

  public String getName() {
	  return CyberStudent.Name;
   } // end getName

    public static String getState() {
	  if(State){
		  if(SubState){
			  return CyberStudent.Name + " is sleeping and snoring.";
		  }else{
			  return CyberStudent.Name + " is sleeping and dreaming.";
		  }
	  }else if (!State){
		  if(SubState){
			  return CyberStudent.Name + " is awake and working.";
		  }else{
			  return CyberStudent.Name + " is awake and eating.";
		  }	  
	  }
	  return "Unknown State."; 
    } // end getState()

  	public static Boolean Sleep(boolean substate) {
	  if(!State){ // If awake
		  State = true; // go to sleep
		  return true; // success
	  }else{ // if already asleep
		  return false;
	  }

  }   
  
  	public static Boolean Awake(boolean substate) {
	  if(State){ // If asleep
		  State = false; // wake up
		  return true; // success
	  }else{ // if already awake
		  return false; // failure
	  }
	
	}   
 
  	public static boolean Eat(){
  		if(!State){ // If awake
  			if(SubState){ // If not already eating
  				SubState = false; // eat
  				return true; // success
  			}
  		}
		return false; // failure
  	}
  	
 	public static boolean Work(){
  		if(!State){ // If awake
  			if(!SubState){ // If not already working
  				SubState = true; // work
  				return true; // success
  			}
  		}
		return false; // failure
  	}
 	
 	public static boolean Dream(){
 		if(State){ // If asleep
 			if(SubState){ // If Snoring
 				SubState = false; // dream
 				return true; // success
 			}
 		}
  		return false; // failure
  	}
 	
 	public static boolean Snore(){
 		if(State){ // If asleep
 			if(!SubState){ // If dreaming
 				SubState = true; // snore
 				return true; // success
 			}
 		}
  		return true; // failure
  	}


  public static void main( String args[] ) {

    // Hint: Add constructor for student here  
	  CyberStudent entity = new CyberStudent("Corey");
	  
    // Hint: Display student's current name, state, and substate   
	  System.out.println(getState());
	  
    // Hint: add code to change substate to Eat and display new state and substate   
    //       or display that this is an invalid substate    
	  if(CyberStudent.Eat()){
		  System.out.println(getState());
	  }else{
		  System.out.println("This is an invalid substate.");
	  }
	  
    // Hint: add code to change substate to Snore and display new state and substate  
    //       or display that this is an invalid substate 
	  if(CyberStudent.Snore()){
		  System.out.println(getState());
	  }else{
		  System.out.println("This is an invalid substate.");
	  }
	  
    // Hint: add code to change state to Awake(substate) and display new state and substate  

	  if(CyberStudent.Awake(SubState)){
		  System.out.println(getState());
	  }else{
		  System.out.println("This is an invalid substate.");
	  }
	  
    // Hint: add code to change substate to Dream and display new state and substate 
    //       or display that this is an invalid substate    
	  
	  if(CyberStudent.Dream()){
		  System.out.println(getState());
	  }else{
		  System.out.println("This is an invalid substate.");
	  }	  

    // Hint: add code to change substate to Eat and display new state and substate 
    //       or display that this is an invalid substate 
	  
	  if(CyberStudent.Eat()){
		  System.out.println(getState());
	  }else{
		  System.out.println("This is an invalid substate.");
	  }

    System.exit(0);

  } // end main() 
} // end CyberStudent()