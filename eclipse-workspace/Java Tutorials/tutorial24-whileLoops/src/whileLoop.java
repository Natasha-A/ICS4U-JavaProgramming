import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* ICU Acronym 
	 * 
	 * Initalization
	 * Comparison
	 * Update
	 * 
	 */
		
	System.out.println("Guess the Password:");
	String password = "let me in";
	Scanner scanner = new Scanner(System.in);
	String guess = scanner.nextLine();
	
	int i = 0;
	
	//while not equal...
	while (!guess.equals(password)) {
		
		//keep asking for passowrd
		System.out.println("Guess the Password:");
		guess = scanner.nextLine(); //redine GUESS (not create new object)

		//code
		//sSystem.out.println("Iteration " + i);
		//update the value of i 
		
		//increment/ iterate 
		///i++; //increase the value by 1 
		
		}
	
		System.out.println("You correctly guessed the password!");
		scanner.close(); //free the space
	}

}
