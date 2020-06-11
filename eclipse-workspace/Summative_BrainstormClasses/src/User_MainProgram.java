import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;


public class User_MainProgram {

	public static void main(String[] args) throws IOException {
		
	String studentsFile = "/Users/natasha.ahammed/eclipse-workspace/"
			+ "Summative_BrainstormClasses/src/students.csv";
	
	String assessmentsFile = "/Users/natasha.ahammed/eclipse-workspace/"
			+ "Summative_BrainstormClasses/src/assessments.csv";
				
	Classroom.readFiles(studentsFile, assessmentsFile);
	
	
	//Classroom.studentsObjects.get(0).studentInfo();
	//System.out.println(Classroom.studentsObjects.size());
	//System.out.println(Classroom.studentsObjects);
		
	// as soon as user enters, create class!!
	Classroom classroom_Math = new Classroom();
	Classroom classroom_Physics = new Classroom();
	Classroom classroom_English = new Classroom();
	
	classroom_Math.teacher = new Teacher("Teacher_Math", "MCR3U0");
	classroom_Physics.teacher = new Teacher("Teacher_Physics", "SPH3U0");
	classroom_English.teacher = new Teacher("Teacher_English", "ENG3U0");
	//System.out.println(Classroom.assessmentsList);
	//System.out.println(Classroom.assessmentsObjects.get(0).date);
	
	classroom_Math.buildClass();
	classroom_Physics.buildClass();
	classroom_Physics.displayAssessmentsForClass();
	//classroom_English.buildClass();
	//System.out.println(classroom_English.classList.size());
	//System.out.println(classroom_English.teacher.name);
	
	//Classroom.deleteStudent();
	//Classroom.writeFiles(studentsFile, assessmentsFile);
	//classroom_Math.displayStudentsInClass();
	//classroom_Math.deleteAssessment();
	//classroom_Physics.displayStudentsInClass();
	
	//System.out.println(classroom_Math.classList.size());

	//System.out.println(classroom_Physics.classList.size());
	//classroom_Math.displayAssessmentsForClass();

	classroom_Math.deleteAssessmentForClass();
			
	//Classroom.writeFiles(studentsFile, assessmentsFile);

	/*
	
	while (checkInput) {
		Scanner enterStudentIndex = new Scanner(System.in);
    	System.out.println("Select index # to delete student:");
    	String studentIndex = enterStudentIndex.nextLine();
    	
    	try {
    	
		if (0 < Integer.parseInt(studentIndex) && 
				Integer.parseInt(studentIndex) <= (lengthList+1)) {
			System.out.println("Deleted! " + studentsObjects.
					get((Integer.parseInt(studentIndex)-1)).studentName);
			studentsObjects.remove((Integer.parseInt(studentIndex)-1));
			checkInput = false;
		} else {
			System.out.println("Incorrect index.");
			checkInput = true;
		}
    	} catch (NumberFormatException e) {
    		System.out.println("Incorrect input.");
    		checkInput = true;
    	}
    	*/
	//System.out.println(Classroom.assessmentsObjects.get(8).date);
	
	// Classroom.writeFiles(studentsFile, assessmentsFile);


	// IDEAS FOR MAIN PROGRAM 
	// Programmer inputs classroom which then assigns values for each type. 
	/*if (classroom_1.teacher.getLogin() == true) { //RUN MAIN PROGRAM 
		System.out.println(classroom_1.teacher.name);
		/// continue with menu 
		 * menu includes list of create classroom objects to select from 
		 * 
		 * 	System.out.println("Select your teacher name to access system: ");
		 * 
		 * 
		 *IDEA FOR USER DRIVEN PROGRAM --- wait it isn't a class of objects :(
		 *make use of self for each 'classroom object' */ 

	// NOTES  - any changes to will only be saved once write() at end....
	// will not reflect changes until saved
		
	}

}