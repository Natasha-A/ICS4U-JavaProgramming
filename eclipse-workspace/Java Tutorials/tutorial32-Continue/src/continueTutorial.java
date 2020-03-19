
public class continueTutorial {

	public static void main(String[] args) {	

	// BREAK - GET out of loop once condition is met 
		for (int i = 9; i >= 0; i--) {
			
			if (i == 6) {
				continue; //skips all 6 values (doesn't go below and print)
			}
			

			for (int k = i; k >= 0; k--) { 
				
				if (k == 5) {
					continue;
					//not going to run code after continue 
					}
				
					System.out.print(k + " "); //don't print with new line
				
			}
			
			System.out.println(); //getting 10 iterations of 9-0 iteration
		}
		

	}

}
