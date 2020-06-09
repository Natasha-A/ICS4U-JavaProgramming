import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Classroom {// Feature class - manages schedules for class 
    static  List<List<String>> studentsList = new ArrayList<List<String>>(); // Stores Students as array lists from file 
    static List<Student> studentsObjects = new ArrayList<Student>(); // Student objects, includes user modifications 
	static List<List<String>> assessmentsList = new ArrayList<List<String>>(); // compiles assessments from file 
	static List<Assessment> assessmentsObjects = new ArrayList<Assessment>(); // stores as individual assessments 
	public Teacher teacher; // teacher for classroom  


    
    // READING FILE 
    public static void readStudentTimeTable(String textFileDirectory) throws IOException {
    	String row; 
		
	    // Input Data - read through each line of csv file by splitting data by comma delimiter
    	try {
    	    BufferedReader csvReader = new BufferedReader(new FileReader(textFileDirectory)); 
			while ((row = csvReader.readLine()) != null ) { 
				List<String> data = Arrays.asList(row.split(","));
				studentsList.add(data); 
			}
			csvReader.close();
		    
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
			
		}
    
    public static List<Assessment> readAssessments(String textFileDirectory) throws IOException {
		String row;
		
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(textFileDirectory));
			while ((row = csvReader.readLine()) != null) {
				List<String> data = Arrays.asList(row.split(","));
				assessmentsList.add(data); 
			}
			csvReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File does not exist.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error in reading file.");
		}
		
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
		
		return assessmentsObjects;
	}
    
    // **** WRITING TO FILE *****
	public static void writeStudentTimeTable(String textFileDirectory) throws IOException {
		int index = 0;
		FileWriter csvWriter = new FileWriter(textFileDirectory); // write back to
		// existing file (overwrite)

		// iterate through studentsObjects to store back as array list and append to file
		while (index < studentsObjects.size()) {
			List<List<String>> rows = Arrays.asList(
					Arrays.asList(studentsObjects.get(index).studentName,
								  studentsObjects.get(index).studentGrade,
								  studentsObjects.get(index).courseOne,
								  studentsObjects.get(index).courseTwo,
								  studentsObjects.get(index).courseThree,
								  studentsObjects.get(index).courseFour)
								  );
			try {

				for (List<String> rowData: rows) { // append each object's properties as row 
						csvWriter.append(String.join(",", rowData));
						csvWriter.append("\n");
				}	
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error in saving file.");
			}
			index+=1;
		}
		csvWriter.flush(); 
		csvWriter.close();
	}
	
	public static void writeAssessments(String textFileDirectory) throws IOException {
		int index = 0;
		FileWriter csvWriter = new FileWriter(textFileDirectory);
		
		while (index < assessmentsObjects.size()) {
			List<List<String>> rows = Arrays.asList(
					Arrays.asList(assessmentsObjects.get(index).date,
								  assessmentsObjects.get(index).course,
					              assessmentsObjects.get(index).teacher,
					              assessmentsObjects.get(index).type,
					              assessmentsObjects.get(index).description)
				                  );
			try {

				for (List<String> rowData: rows) { // append each object's properties as row 
						csvWriter.append(String.join(",", rowData));
						csvWriter.append("\n");
				}	
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error in saving file.");
			}
			index+=1;
		}
		csvWriter.flush(); 
		csvWriter.close();
	}
	
    public static List<Student> buildClass(Classroom classroom) {
    	String classSubject = classroom.teacher.subject;
        List<Student> classStudentsList = new ArrayList<Student>(); 
    	
    	for (int indexObjects=0; indexObjects < studentsObjects.size(); indexObjects++) {
        	String[] courses = {studentsObjects.get(indexObjects).courseOne,
        	                    studentsObjects.get(indexObjects).courseTwo,
        	                    studentsObjects.get(indexObjects).courseThree, 
        	                    studentsObjects.get(indexObjects).courseFour};

    		for (int indexCourses=0; indexCourses < courses.length; indexCourses++) {
    			if (courses[indexCourses].equals(classSubject)) {
    				classStudentsList.add(studentsObjects.get(indexObjects));
    			} 
    		}
    	}	
    	return classStudentsList;
    } 
}

			
		

	
	
