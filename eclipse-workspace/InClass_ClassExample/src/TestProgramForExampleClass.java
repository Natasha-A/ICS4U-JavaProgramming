
public class TestProgramForExampleClass {

	public static void main(String[] args) {
		//1) Instance of Class:
		ExampleClass variable1 = new ExampleClass(); //this 'new' will run the constructor
		//2) Optionally, Instance of Class:
		/*
		 * ExampleClass variable1;
		 * variable1 = new ExampleClass();
		 */
		ExampleClass variable2 = new ExampleClass(); //this 'new' will run the constructor
		ExampleClass variable3 = new ExampleClass(); //this 'new' will run the constructor

		System.out.println("variable1.x = " + variable1.x);
		variable1.x = 25;
		System.out.println("variable1.x set to 25.. = " + variable1.x);
		System.out.println("variable2.x = " + variable2.x);
		

		variable1.y = 10;
		
		System.out.println(variable2.y); //default value goes to 0 
		
		
		
	}

}
