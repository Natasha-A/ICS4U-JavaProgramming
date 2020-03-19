
public class nestedForLoops {

	public static void main(String[] args) {
	
		for (int i = 9; i >= 0; i--) {
			for (int k = 9; k >= 0; k--) { 
				System.out.print(k + " "); //don't print with new line
				
			}
			System.out.println(); //getting 10 iterations of 9-0 iteration
		}	

	System.out.println("");
	//DESCENDING VALUES
	// reference to outer valu to the inner loop 
		for (int i = 9; i >= 0; i--) {
			for (int k = i; k >= 0; k--) { 
				System.out.print(k + " "); //don't print with new line
				
			}
			System.out.println(); //getting 10 iterations of 9-0 iteration
		}
		

	}

}
