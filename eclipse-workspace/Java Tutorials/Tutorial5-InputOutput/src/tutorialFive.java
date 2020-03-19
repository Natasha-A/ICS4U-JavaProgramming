import java.util.Scanner; //packages - to organize code 

public class tutorialFive {

	public static void main(String[] args) {
		// OUTPUT
		System.out.println("What is your name?");
		// scanner - becomes the name
		// type identifier = new type(); - creating a new object 
		
		// INPUT 
		Scanner scanner = new Scanner(System.in); 
		String name = scanner.nextLine(); // get input
		// control + space "sysout"
		System.out.println("Hello " + name); // prints name
		
		String string = new String("This is a string");
		System.out.println(string + " :)"); // reference by name, not value
		
	}

}
