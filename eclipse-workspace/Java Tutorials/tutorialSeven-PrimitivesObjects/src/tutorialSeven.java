
public class tutorialSeven {

	public static void main(String[] args) {
		// call string constructor, which can then be referenced
		String string = new String("This is a string");	
		//Able to make use of simpler String format
		String easier = "Wow, that was easy!" + string; //shorthand version
		System.out.println(easier); // reference by name, not value
		
		// in general both can be used the same ways 
		int x = 5; //primitive 
		//can create an object version of integer
		Integer y = 5; //value converted to an object (auto boxed)
		
	}

}

//primitive types - boolean, byte, char, short, long, float, double
// (treat the data in different ways) 
//objects - an instance of a class (class is the data type)

//data type = the type of the data. How the computer interprets the data
// e.g.) 5 versus "5"
// need to declare data type to ensure variable types 
// can only store strings in string data types. 

//statically typed = variables that are given data types up front
// dynamically typed = variables do not have types 
