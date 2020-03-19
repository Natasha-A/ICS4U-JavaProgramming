package tutorialNineteen;
import java.util.Scanner;

public class tutorialNineteenIfElse {

	public static void main(String[] args) {
		String password = "let me in";
		System.out.println("Guess the password");
		
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		if (password.equals(guess)) {
			
			System.out.println("Your guess was correct");
			return; // program ends at this point
		
		} else if("password".toLowerCase().equals(guess.toLowerCase())) {
			System.out.println("You got the second password!");
			
		}
		
		else {
			System.out.println("Guess is incorrect.");
			
		}
		//Tutorial 20: Comparison and Logical Operators
		System.out.println("How old are you?");
		
		Scanner inputAge = new Scanner(System.in);
		
		int age = inputAge.nextInt(); //trying to store input as int using method
				
		System.out.println("Cats or Dogs?");
		
		Scanner inputAnimal = new Scanner(System.in);
		
		String animal = inputAnimal.nextLine();
		
		
		if (age > 12 && !animal.equals("dogs")) { //greater than, simplar to ==
			System.out.println("Welcome!");
		}
		
	//OPERATORS - COMPARISON
	/*
	 * == equality
	 * != inequality
	 * Logical Operators
	 * && and (both have to be true
	 * || or  (Either can be true, or both)
	 * ! not (inverse the boolean)
	 */

	}

}
