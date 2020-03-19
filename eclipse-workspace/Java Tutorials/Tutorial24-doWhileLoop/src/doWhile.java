import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* ICU Acronym 
	 * 
	 * Initalization
	 * Comparison
	 * Update
	 * 
	 */
		
	// DO WHILE - runs at least once, able to run intialzing value

	//SET UP 
	String password = "let me in";
	Scanner scanner = new Scanner(System.in);
	String guess; //define outside, in order to access globally
	
	//ASK VALUE 
	do { //RUNS ALWAYS FIRST - then continues loop 
		System.out.println("Guess the password:");
		guess = scanner.nextLine(); // in order to acccess value 

	//WHILE VALUE NOT EQUAL TO CONDITION,,, CONTINUE LOOPING 
	} while (!guess.equals(password));
		

	System.out.println("You correctly guessed the password!");
	scanner.close(); //free the space
	}

}
