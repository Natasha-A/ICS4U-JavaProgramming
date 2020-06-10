import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class


public class Assessment {
	// all assessments for all classes
    LocalDateTime today = LocalDateTime.now();
    LocalDateTime nextWeek = today.plusDays(7);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd yyy");
    String formattedDateNextWeek = nextWeek.format(myFormatObj);

	public String date;
	public String course;
	public String teacher;
	public String type;
	public String description = "NA";
	
	public  Assessment(String dateVal, String courseVal, String teacherVal, 
					   String typeVal, String descripVal) {
			date = dateVal;
			course = courseVal;
			teacher = teacherVal;
			type = typeVal;
			description = descripVal;
	}
	
	// Overloading constructors 
	public Assessment(String courseVal, String teacherVal, String typeVal, String descripVal) {
		date = formattedDateNextWeek; 
		course = courseVal;
		teacher = teacherVal;
		type = typeVal; 
		description = descripVal;
	}
	
	public Assessment(String courseVal, String teacherVal, String typeVal) {
		date = formattedDateNextWeek; 
		course = courseVal;
		teacher = teacherVal;
		type = typeVal;
		description = "NA";
	}
	
}
