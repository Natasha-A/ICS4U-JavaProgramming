import java.io.IOException;
import java.util.Arrays;


public class User_MainProgram {

	public static void main(String[] args) throws IOException {
		
				
	Classroom.readStudentTimeTable("/Users/natasha.ahammed/eclipse-workspace/"
			+ "Summative_BrainstormClasses/src/students.csv");
	
	Classroom.writeStudentTimeTable("/Users/natasha.ahammed/eclipse-workspace"
			+ "/Summative_BrainstormClasses/src/latest.csv");
	
	//System.out.println(Classroom.studentsArray);
	Classroom.studentsObjects.get(12).studentInfo();
	System.out.println(Classroom.studentsObjects.size());
	System.out.println(Classroom.studentsObjects);
		
	Classroom classroom_Math = new Classroom();
	Classroom classroom_Physics = new Classroom();
	Classroom classroom_English = new Classroom();
	
	classroom_Math.teacher = new Teacher("Teacher_Math", "MCR3U0");
	classroom_Physics.teacher = new Teacher("Teacher_Physics", "SPH3U0");
	classroom_English.teacher = new Teacher("Teacher_English", "ENG3U0");
		
	Classroom.readAssessments("/Users/natasha.ahammed/eclipse-workspace/"
			+ "Summative_BrainstormClasses/src/assessments.csv");
	Classroom.writeAssessments("/Users/natasha.ahammed/eclipse-workspace/"
			+ "Summative_BrainstormClasses/src/assessments.csv");
	System.out.println(Classroom.assessmentsList);
	System.out.println(Classroom.assessmentsObjects.get(0).date);

	// Classroom.writeStudentTimeTable(Classroom.studentsArray);
	
	// IDEAS FOR MAIN PROGRAM 
	// Programmer inputs classroom which then assigns values for each type. 
	/*if (classroom_1.teacher.getLogin() == true) { //RUN MAIN PROGRAM 
		System.out.println(classroom_1.teacher.name);
		/// continue with menu 
		 * 
		 * 
		 * 	System.out.println("Select your teacher name to access system: ");
	} */
	
		
	}

}