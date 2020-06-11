import java.io.IOException;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;


public class Assessment {
	// all assessments for all classes
    static LocalDateTime today = LocalDateTime.now();
    static LocalDateTime nextWeek = today.plusDays(7);
    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd yyyy");
    static String formattedDateNextWeek = nextWeek.format(myFormatObj);

	public String date;
	public String course;
	public String teacher;
	public String type;
	public String description = "NA";
	
	// Overloading constructors can be used by programmer when hard coding values 
	public Assessment(String dateVal, String courseVal, String teacherVal, 
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
	
	public static String enterDate() throws IOException {
		boolean checkDate = true;
		String date = null;
		List<String> validDates = new ArrayList<String>();
		
		while (checkDate) {
			Scanner setDate = new Scanner(System.in);
			System.out.println("\nSpecify date for assessment? Enter(Y/N)");
			String addDate = setDate.nextLine();
			
				if (addDate.equals("Y")) {
					
					LocalDateTime today = LocalDateTime.now();
					DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd");
					String dateString = today.format(currentDate);
					
					int dateToday = Integer.parseInt(dateString);
				    
					Calendar cal = Calendar.getInstance();
				    int lastDateOfMonth = cal.getActualMaximum(Calendar.DATE);
				    DateTimeFormatter numDateFormat = DateTimeFormatter.ofPattern("e");
				    //

					for (int indexDate=1; indexDate <= (lastDateOfMonth-dateToday); indexDate++) {
						LocalDateTime nextDay = today.plusDays(indexDate);
					    String formattedDate = nextDay.format(numDateFormat); // display only date 
						int intFormattedDate = Integer.parseInt(formattedDate);
						
						if (1 < intFormattedDate && intFormattedDate < 7) {
						    DateTimeFormatter detailDateFormat = DateTimeFormatter.ofPattern("E MMM dd yyyy");
						    String formattedDetailDate = nextDay.format(detailDateFormat);
							validDates.add(formattedDetailDate);
						}
						
					 }		
					// Display valid dates (weekdays)
					System.out.println("\n------ Valid Dates -----");
				    for (int index=0; index < validDates.size(); index++) {
				    	System.out.println((index+1)+ ": "+ validDates.get(index));
				    }
				    
				    date = addDate(validDates);
				    System.out.println(date);
					checkDate = false;

				} else if (addDate.equals("N")) {
					date = formattedDateNextWeek; 
					System.out.println("Recorded date as one week from today: " + date);
					checkDate = false;

				} else {
					System.out.println("Incorrect entry. Enter 'Y' or 'N'.");
					checkDate = true;

				}
			}
			
			return date; // return null if not applicable 

		}
	
    
	public static String addDate(List<String> datesList) throws IOException {
		int lengthList = datesList.size();
		boolean checkInput = true; 
		String date = null;
		String dateIndex = null;
	
		while (checkInput) {
			try {
				Scanner enterDateIndex = new Scanner(System.in);
				System.out.println("\nSelect index # for assessment date:");
				dateIndex = enterDateIndex.nextLine();
				
				if (0 < Integer.parseInt(dateIndex) && 
						Integer.parseInt(dateIndex) <= (lengthList+1)) {
						date = datesList.get((Integer.parseInt(dateIndex)-1));

						checkInput = false;
					} else {
						System.out.println("Incorrect index.");
						checkInput = true;
					}
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format.");
				checkInput = true;
			}
		}
		System.out.println("Assessment has been recorded.");
    	
		return date;	
		
	}
	
	public static String addType() {
		String type = null;
		boolean checkType = true;
		while (checkType) {
			try {
			 Scanner enterType = new Scanner(System.in); 
				System.out.println("\nEnter type of assessment (Q = Quiz, T = Test):");
				String typeInput = enterType.nextLine();	
				
				if (typeInput.equals("T")) {
					type = "Test";
					checkType = false;

				} else if (typeInput.equals("Q")) {
					type = "Quiz";
					checkType = false;

				} else {
					System.out.println("Invalid entry. Enter 'Q' or 'T'");
				}
				
			} catch (NullPointerException e) {
				System.out.println("Entry unrecognized.");
			}	
		}
		return type;
	}
	
	public static String addDescription() {
		boolean checkDescrip = true;
		String description = null; 
		
		while (checkDescrip) {
			try {
				Scanner setDescrip = new Scanner(System.in);
				System.out.println("Specify description for assessment? Enter(Y/N)");
				String addDescrip = setDescrip.nextLine();
			
				if (addDescrip.equals("Y")) {
					Scanner enterDescrip = new Scanner(System.in);
					System.out.println("Enter a brief description of the assessment:");
					String typeDescrip = enterDescrip.nextLine();
					
					description = typeDescrip;
					checkDescrip = false;
									
				} else if (addDescrip.equals("N")) { 
					checkDescrip = false;
					description = "NA";

				} else {
					System.out.println("Incorrect entry. Enter 'Y' or 'N'.");
					checkDescrip = true;
				}
			} catch (NullPointerException e) {
				System.out.println("Entry unrecognized.");
			}
		}
		return description; // truncate longer description if necessary
	}

}

// course = self.teacher.course
