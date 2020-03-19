
public class breakTutorial {

	public static void main(String[] args) {	

	// BREAK - GET out of loop once condition is met 
		for (int i = 9; i >= 0; i--) {
			if (i == 3) { //affects puter loop 
				break;
			} for (int k = i; k >= 0; k--) { 
				
				System.out.print(k + " "); //don't print with new line
				
				if (k == 6) {
					break; // stops at 6, and continues to next iterntion, only
					//for inside the inner loop 
				}
			
				
			}
			System.out.println(); //getting 10 iterations of 9-0 iteration
		}
		

	}

}
