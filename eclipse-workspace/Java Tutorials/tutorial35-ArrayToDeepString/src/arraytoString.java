import java.util.Arrays;

public class arraytoString {

	public static void main(String[] args) {
		// creating arrays of arrays
		int[][] grades = {{10, 9, 8}, {7, 4, 3, 1, 4, 2, 5, 3}}; 
		// System.out.println(Arrays.toString(grades)); prints entire array
		System.out.println(Arrays.deepToString(grades));
		

	}

}

