
// String Class (String.format, length)
public class tutorialFourteen {

	public static void main(String[] args) {
		String x = "hello"; // string is not a primitive - object: an instance of a class
		//characters use single quotes
		char y = 'h';
		//x.charAt(0) // starts at zero,charAt(index)
		//Print out first character
		System.out.println(x.charAt(0));
		
		String w = "hello\n\n\ncats"; //\n is rendered as new line (enter)
		String r = "hello\\cats"; //\\ is rendered as black slash (enter)
		System.out.println(r + " and dogs");
		r += " and puppies"; // different option for concatenation 
		
		System.out.println(); //rewrites concatenation
		
		String name = "Caleb";
		String formatName = String.format("hello %s", name); //use .format to concatenate string
		
		System.out.println(formatName); 
		
		//length of a string
		int nameLength = name.length(); //returns a int of the length of the name
		//need to use primitive int for value type 
		
		System.out.println(nameLength);	

	}

}
