import java.util.Arrays;
import java.util.Scanner;

public class loopsArray {

	public static void main(String[] args) {
		

		System.out.println("Enter Array Values:");
		Scanner inputVal = new Scanner(System.in);
	
		
		// System.out.println(Arrays.toString(grades)); default fills

		//display size of array
		//int[] grades = new int[10]; //# of ints: 10
		int size = inputVal.nextInt();
		int[] grades = new int[size];

		
		
		for (int i = 0; i < size; i++) {
			int x = inputVal.nextInt(); //gets next int in input 
			
			grades[i] = x; //allows entry of values until 10 met
			
		}
		
		System.out.println(Arrays.toString(grades));
		
		

	}

}
