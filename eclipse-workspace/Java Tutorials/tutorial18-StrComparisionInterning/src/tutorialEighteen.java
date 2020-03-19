import java.util.Scanner;

public class tutorialEighteen {

	public static void main(String[] args) {
		String password = "let me in";
		System.out.println("Guess the password: ");
		
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		System.out.println(password.equals(guess));
		//System.out.prinln("abcd".compareTo("abdd"));
		
		//password == guess;
		//primitives - this works
		//objects - this does not work
		//values of objects is a reference to the object 
		
		int x = 5;
		
		String x = new String("This is an object");
		//object - will not work 
		
		//String Interning 
		String a = "hi";
		String b = "hi";
		
		System.out.println(a == b);
		// the values are interned - will ensure all strings 
		//have same contents share same memory, to have one instance stored
		
		

	}

}
