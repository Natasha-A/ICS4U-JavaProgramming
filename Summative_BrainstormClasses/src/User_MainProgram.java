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
		
	Classroom classroom_Math = new Classroom();
	Classroom classroom_Physics = new Classroom();
	Classroom classroom_English = new Classroom();
	
	classroom_Math.teacher = new Teacher("Teacher_Math", "MCR3U0");
	classroom_Physics.teacher = new Teacher("Teacher_Physics", "SPH3U0");
	classroom_English.teacher = new Teacher("Teacher_English", "ENG3U0");
	//System.out.println(Classroom.assessmentsList);
	//System.out.println(Classroom.assessmentsObjects.get(0).date);
	
	//classroom_Math.buildClass();
	//classroom_English.buildClass();
	//System.out.println(classroom_English.classList.size());
	//System.out.println(classroom_English.teacher.name);
	
	//Classroom.deleteStudent();
	//Classroom.writeFiles(studentsFile, assessmentsFile);
	//classroom_Math.addAssessment();
	System.out.println(Assessment.addDescription());

	
/*
    Date now = new Date(0);

    SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
    System.out.println(simpleDateformat.format(now));

    simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
    System.out.println(simpleDateformat.format(now));

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format

*/

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

	
		
	}

}