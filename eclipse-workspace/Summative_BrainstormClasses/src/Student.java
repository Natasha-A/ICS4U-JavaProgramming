
public class Student {
	String studentName; 
	String studentGrade; 
	String courseOne,courseTwo,courseThree,courseFour;
	static int studentCounter = 0;

	
	// Initialize objects and properties 
	public Student(String sName, String sGrade, 
			String course1, String course2,
			String course3, String course4) {
		studentName = sName;
		studentGrade = sGrade;
		courseOne = course1;
		courseTwo = course2;
		courseThree = course3;
		courseFour = course4;
		studentCounter++;

	}
	
	public Student(String course1, String course2, String course3, String course4) {
		studentName = "NA";
		studentGrade = "NA";
		courseOne = course1;
		courseTwo = course2;
		courseThree = course3;
		courseFour = course4;
		studentCounter++;

	}
	
	// Display student info 
	public void studentInfo() {
		System.out.println("Name: "+studentName+
				          "\nGrade: "+studentGrade+
				          "\nCourse 1: "+courseOne+
				          "\nCourse 2: "+courseTwo+
				          "\nCourse 3: "+courseThree+
				          "\nCourse 4: "+courseFour
				          );
	}
	
		
}
