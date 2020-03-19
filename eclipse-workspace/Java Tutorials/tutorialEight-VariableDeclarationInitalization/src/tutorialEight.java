
// Variable Declaration and Initialization
public class tutorialEight {
	
	// global should be constant if used. 
	// public static final double PI = 3.14159;
	private int x = 10; 

	public static void main(String[] args) {
		int x = 5; //2 step process done in one step 
		int x; //1) declare
		x = 5; //2) initialize (allows to be able to determine value 
		// later on when you know what the value will hold)
		x = 10; //allows to redefine value of x 
		
		//constant - using 'final'
		final int Y = 5; //convention to use upper case
		// Y = 10; //not possible to change
		
		// able to call from class 
		// MySweetProgram.PI

	}

}

// Variable Creation:
// 1. Declare
// 2. Initialize