import java.io.IOException;
import java.util.Arrays;


public class UserViewController {

	public static void main(String[] args) throws IOException {
				
	Classroom.readStudentTimeTable("/Users/natasha.ahammed/eclipse-workspace"
	+ "/Summative_BrainstormClasses/src/students.csv");
	      	
	//System.out.println(Classroom.studentsArray);
	Classroom.studentsObjects.get(12).studentInfo();
	System.out.println(Classroom.studentsObjects.size());
	System.out.println(Classroom.studentsObjects);
	
	//Teacher mathTeacher = new Teacher("Math_Teacher", "MCR3U0");
	
	
	Classroom.mathTeacher = new Teacher("Math_Teacher", "MCR3U0");
	
	
	
		
	Classroom.writeStudentTimeTable("/Users/natasha.ahammed/eclipse-workspace"
			+ "/Summative_BrainstormClasses/src/latest.csv");

	}
	
	// Classroom.writeStudentTimeTable(Classroom.studentsArray);

	}

