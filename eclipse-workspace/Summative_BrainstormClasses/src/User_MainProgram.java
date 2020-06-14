import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
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
	
	//classroom_Math.addAssessment();
	classroom_Math.addStudentsToClass();
	classroom_Physics.addStudentsToClass();
	//classroom_Math.displayAssessmentsForClass();	//classroom_English.buildClass();
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

	classroom_Math.viewMonthlySchedule();
	//classroom_Math.displayOptimalAssessmentDates();
	
	//classroom_Math.addAssessment();
	classroom_Math.displayAssessmentsForClass();

	//Classroom.displayAssessmentsList();
			
	//Classroom.writeFiles(studentsFile, assessmentsFile);
	
	//Assessment.viewUpcomingAssessments(classroom_Math);
	//classroom_Math.addAssessment();
	
	//System.out.println(Classroom.assessmentsObjects.get(8).date);
	
	//Classroom.writeFiles(studentsFile, assessmentsFile);

	// can model for different grades - need to have diiferent teachers for each grade (or each 
    // teacher having mutliple grade classes), and multiple course 
	//  lists for each grade 
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
		
	// NOT FOR MULTIPLE STREAMS OF CLASSES - hence if the same class with same course is created, 
	// all assessments will be attributed to same course, only difference is teacher in which assessment
	// is held towards. 
	// to do so, modifications would be necessary in Teacher by having subclass which includes 'section', while this class 
	}

}