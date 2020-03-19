import java.util.Scanner;

public class switchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What's your name?");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		switch(name) { //variable testing against - JUST VARIABLE
		//good  if there no is a discrete value or range, only for exact values,
		
		
			case "Caleb": //value testing for
			//case "Natasha": //to have more info same case
				//code
				System.out.println("Welcome!");
				break;
			
			case "Claire":
				//code
				System.out.println("You are not allowed to enter.");
				break;
				
			default: //catches against all other values 
				System.out.println("Try again later.");
				break; //just for convention
			
		}

	}

}
