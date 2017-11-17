package edu.buffalostate.cis425.sp17.assignments.vollmer;

//@Author Corey Vollmer

public class CIS425_Course {

	
	
	private static int capacity, seatsFilled;
	private static CIS425_Student[] students;
	private static CIS425_Course course;
		
	
    public CIS425_Course(int cap) {
    	 capacity = cap;
    	 seatsFilled = 0;
    	 students = new CIS425_Student[capacity];
    	 addStudent("Sally Smarty", 3);
         addStudent("Phil Phailure", 3);
    }
     
    public static boolean addStudent( String name, int num_exams ) {
    	 	if(seatsFilled <= capacity){
    	 		CIS425_Student temp = new CIS425_Student(name, num_exams);
    	 		students[seatsFilled] = temp;
    	 		//students[seatsFilled].setInfo(name,num_exams);
    	 		//System.out.println(seatsFilled);
    	 		//System.out.println(students[seatsFilled++].getName());
    	 		seatsFilled++;
    	 		return true;
    	 	}
		return false;
	}
     
    public static CIS425_Student findStudent(String name) {
    	 for(int i=0;i<students.length; i++){
    		 //System.out.println("loop");
    		 //System.out.println(name + " "+i + " " + students[i].getName());
    		 if(name.equals(students[i].getName())){
    			 return students[i];
    		 } 
    	 }
    	 return null;
	}
     
    public static double computeAverage(int exam){
    	int sum = 0;
    	
    	for(int i=0;i<seatsFilled;i++){
    	//	System.out.println(students[i].getGrade(exam));
    		sum += students[i].getGrade(exam);
    	}
    	
    	try{
    		return sum/seatsFilled; 
    	}catch(Exception e){
    		System.out.println("Error: " + e);
    	}
    	return 0.0;
    	
    }
     
    public static void main(String[] args){
    	course = new CIS425_Course(30);
  
    	System.out.println(getNameAndGrade("Sally Smarty"));
    	System.out.println(getNameAndGrade("Phil Phailure"));
    	
	
    	findStudent("Sally Smarty").setGrade(0, 100);
    	findStudent("Phil Phailure").setGrade(0,60);
    	if(findStudent("Sally Smarty").setGrade(0, 100) && findStudent("Phil Phailure").setGrade(0,60)){
    	 	System.out.println("Grades have successfully been added");
    	}
    	System.out.println(getNameAndGrade("Sally Smarty"));
    	System.out.println(getNameAndGrade("Phil Phailure"));
    	
    	System.out.println("Class average for exam 1 is: " + computeAverage(0));
    }
//    
    public static String getNameAndGrade(String name){
    	String message = name + "'s exam grades are";
    	message += findStudent(name).getAllGrades();
    	return message + ".";
    }
     


} // CIS425_Course class