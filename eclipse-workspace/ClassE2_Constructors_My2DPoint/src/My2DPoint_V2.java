
public class My2DPoint_V2 {
	double x,y;
	
	//(1) Constructor Writing 
	//Non-Parameterized constructor - Does not have any parameters, default values hardcoded
	public My2DPoint_V2() {
		x = 0;
		y = 0;
	}

	public My2DPoint_V2(double dataOne) {
		x = dataOne;
		y = 3; //set default value 
	}
	
	//Parameterized constructor - constructor with parameters used at time the object is
	//created 
	/*
	public My2DPoint_V2(double dataOne, double dataTwo) {
		x = dataOne;
		y = dataTwo;
		
	}
	*/
	
	//USING 'THIS' to initalize variable 
	public My2DPoint_V2(double x, double y) {
		//puts into the value - same as 'self' used in order to point back to instance 
		//otherwise is implied as what is used in parameter 
		this.x = x;
		this.y = y;
		System.out.println("This initialize constructor value");
	}
	
	//vvvvEXAMPLEvvvv 
	void translate(double a) {
		translate(a, 0); //able to call the value and use upon other method with default 
		//value 
	}
	
	void translate(double a, double b) {
		x = a + b;
		y = x + a;
	}
	//^^^^EXAMPLE^^^^
	
	//(2) Method Writing
	public double distancePoint() { 
		double distOriginY = y;
		double distOriginX = x;
		
		double totalDistance = distOriginX + distOriginY;
		
		return totalDistance;
		
	}
	
	
	
}


