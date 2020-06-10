import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Classroom {// Feature class - manages schedules for class 
    static  List<List<String>> studentsList = new ArrayList<List<String>>(); // Stores Students as array lists from file 
    static List<Student> studentsObjects = new ArrayList<Student>(); // Student objects, includes user modifications 
	static List<List<String>> assessmentsList = new ArrayList<List<String>>(); // compiles assessments from file 
	static List<Assessment> assessmentsObjects = new ArrayList<Assessment>(); // stores as individual assessments 
	public Teacher teacher; // teacher for classroom  
    public List<Student> classList = new ArrayList<Student>();  // Students for each class 
    public static String[] coursesGrade11 = {"SPH3U0", "FSP3U0", "ICS3U0", "MCR3U0",
                                                     "ENG3C0", "PAL3O0", "ENG3U0", "SCH3U0",
                                                     "TTJ3C0", "AWP3O0", "TCJ3C0", "AVI3M0",
                                                     "SVN3M0", "HNC3C0", "SPP3OF", "CHW3M0",
                                                     "SBI3U0", "ADA3M0", "MEL3E0", "TGJ3M0",
                                                     "FSF3U0", "CGF3M0", "PPL3OM"};
    
    // READING FILES
    public static void readFiles(String studentsDirectory, String assessmentsDirectory) throws IOException {
    	String row_Student; 
	    BufferedReader csvReader_S = new BufferedReader(new FileReader(studentsDirectory)); 

	    // Input Data - read through each line of csv file by splitting data by comma delimiter
    	try {
			while ((row_Student = csvReader_S.readLine()) != null ) { 
				List<String> data = Arrays.asList(row_Student.split(","));
				studentsList.add(data); 
			}
			csvReader_S.close();
		    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File does not exist.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error in reading file.");
		}
		
		// Create Student Objects - Attribute each line of data (array) as a Student object		
			for (int x = 0; x < studentsList.size(); x++) {
				try {
					if (studentsList.get(x) != null) {
						String name = studentsList.get(x).get(0);
						String grade = studentsList.get(x).get(1);
						String course1 = studentsList.get(x).get(2);
						String course2 = studentsList.get(x).get(3);
						String course3 = studentsList.get(x).get(4);
						String course4 =studentsList.get(x).get(5);
						Student.studentCounter += 1; // counts # of students 

						Student student = new Student(name, grade, course1,
				    		course2, course3, course4);
			
						studentsObjects.add(student); /// append object to list	
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Index error - Could not add Student.");
					e.printStackTrace();
				}			
			}
			
		// Repeating reading and creating objects for assessments 
		String row_Assessment;
		BufferedReader csvReader_A = new BufferedReader(new FileReader(assessmentsDirectory));
			
			try {
				while ((row_Assessment = csvReader_A.readLine()) != null) {
					List<String> data_A = Arrays.asList(row_Assessment.split(","));
					assessmentsList.add(data_A); 
				}
				csvReader_A.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("File does not exist.");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error in reading file.");
			}
			
			// Create Assessments Objects	
			for (int x = 0; x < assessmentsList.size(); x++) {
				try {
					if (assessmentsList.get(x) != null) {
						String date = assessmentsList.get(x).get(0);
						String courseName = assessmentsList.get(x).get(1);
						String teacher = assessmentsList.get(x).get(2);
						String type = assessmentsList.get(x).get(3);
						String description = assessmentsList.get(x).get(4);
						
						Assessment assessment = new Assessment(date, courseName, teacher,
					    		type, description);
				
						assessmentsObjects.add(assessment); /// append object to list	
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Index error - Could not add Assessment.");
					e.printStackTrace();
				}		
			}	
		}
    
    // **** WRITING TO FILE *****
	public static void writeFiles(String studentsDirectory, String assessmentsDirectory) throws IOException {
		FileWriter csvWriter_Student = new FileWriter(studentsDirectory); // write back to
		int index_S = 0;
		
		// iterate through studentsObjects to store back as array list and append to file
		while (index_S < studentsObjects.size()) {
			List<List<String>> rows_S = Arrays.asList(
					Arrays.asList(studentsObjects.get(index_S).studentName,
								  studentsObjects.get(index_S).studentGrade,
								  studentsObjects.get(index_S).courseOne,
								  studentsObjects.get(index_S).courseTwo,
								  studentsObjects.get(index_S).courseThree,
								  studentsObjects.get(index_S).courseFour)
								  );
			try {

				for (List<String> rowData: rows_S) { // append each object's properties as row 
					csvWriter_Student.append(String.join(",", rowData));
					csvWriter_Student.append("\n");
				}	
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error in saving file.");
			}
			index_S+=1;
		}
		csvWriter_Student.flush(); 
		csvWriter_Student.close();
		
		// Repeat writing to assessments file 
		FileWriter csvWriter_Assessment = new FileWriter(assessmentsDirectory);
		int index_A = 0;

		while (index_A < assessmentsObjects.size()) {
			List<List<String>> rows_A = Arrays.asList(
					Arrays.asList(assessmentsObjects.get(index_A).date,
								  assessmentsObjects.get(index_A).course,
					              assessmentsObjects.get(index_A).teacher,
					              assessmentsObjects.get(index_A).type,
					              assessmentsObjects.get(index_A).description)
				                  );
			try {

				for (List<String> rowData: rows_A) { // append each object's properties as row 
					csvWriter_Assessment.append(String.join(",", rowData));
					csvWriter_Assessment.append("\n");
				}	
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error in saving file.");
			}
			index_A+=1;
		}
		csvWriter_Assessment.flush(); 
		csvWriter_Assessment.close();
	}
	
	// Assign students to class corresponding to the teacher's subject with 
	// students who have that course in their time table
    public void buildClass() {
    	String classSubject = this.teacher.subject; // Classroom subject by teacher 
    	
        // Reads through each students timetable courses 
    	for (int indexObjects=0; indexObjects < studentsObjects.size(); indexObjects++) {
        	String[] courses = {studentsObjects.get(indexObjects).courseOne,
        	                    studentsObjects.get(indexObjects).courseTwo,
        	                    studentsObjects.get(indexObjects).courseThree, 
        	                    studentsObjects.get(indexObjects).courseFour};
        	// Check if student has 'class subject' in time table, adding to class list if so
    		for (int indexCourses=0; indexCourses < courses.length; indexCourses++) {
    			if (courses[indexCourses].equals(classSubject)) {
    				this.classList.add(studentsObjects.get(indexObjects));
    			} 
    		}
    	}
    } 
    
    public static void displayStudentsList() {
        System.out.println("\n------ Students List -----");
        	for (int index=0; index < studentsObjects.size(); index++) {
        		System.out.println((index+1)+ ": "+ studentsObjects.get(index).studentName);
        	}
    	}
    
    public static void addStudent() {
    	System.out.println("\n------ Add Student -----");
	    String name = Student.enterName();
	    String grade = Student.enterGrade();
	    List<String> courses = Student.enterCourses();  
	    
	    Student student = new Student(name,
	    		grade, courses.get(0), courses.get(1),
	    		courses.get(2), courses.get(3));
	    
	    studentsObjects.add(student);  
    }
    
    public static void deleteStudent() {
    	int lengthList = studentsObjects.size();
    	displayStudentsList();
    	boolean checkInput = true;
    	
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
    	}
    }
    // save changes at this point or at end? choose to save all ...
    public void addAssessment() { // gets added to entire assessments 
    	// database, then read into as assesmentsForClass() based on class type 
    	System.out.println("\n------ Add Assessment ------");
    	try {
			String date = Assessment.enterDate();
			String course = this.teacher.subject;
			String teacher = this.teacher.name;
			String type = Assessment.addType();
			String description = Assessment.addDescription();
			
			Assessment assessment = new Assessment(date, course, teacher,
					type, description);
			assessmentsObjects.add(assessment);

		} catch (IOException e) {
			e.printStackTrace();
	}
    	
    	
    	
    }
}

			
		

	
	
