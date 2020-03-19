
public class Creating_Classes {

	public static void main(String[] args) {
		//this is a local variable to method main
		User user = new User(); //1) calls user class
		
		//2) fields are defined at a class level 
		user.firstName = "Sub";
		user.lastName = "Scriber";
		
		//Can call from class 
		//System.out.println(user.firstName);
		
		//user.output(2); //method allows us to call
		//method from class 
		
		//4) Calling a method with a return statement
		String message = user.output();
		System.out.println(message);
				
	}

}
