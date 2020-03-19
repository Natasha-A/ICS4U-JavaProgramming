import java.util.Arrays;
import java.util.Scanner;

public class searchArray {

	public static void main(String[] args) {
		
		int[] grades = {1,2, 3, 72, 5};
		
		for (int i = 0; i < grades.length; i++) { // length array
			
			if (grades[i] == 72) {
				
					System.out.println("FOUND at index " + i);
				}
		
			}
		
		System.out.println(" ");
		
		//38 - SORTING ARRAYS
		Arrays.sort(grades); //modifies array 
		
		System.out.println(Arrays.toString(grades)); //print sorted array
				
		System.out.println(Arrays.toString(grades));
	}

}