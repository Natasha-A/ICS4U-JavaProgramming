/*
Name: Natasha Ahammed
Date: Februrary 25, 2020
File Name: Natasha_Ahammed_ManhattanDistance_A2.java
Description: Calculates Manhattan Distance using set of coordinates passed into method in order to display product
of the shortest and longest distances.
Test Cases: Testing numerous coordinate values and lengths of 2d array, print statements 
across program to distinguish call time.
 */


import java.util.Arrays;

public class assignmentTwo {

	public static void main(String[] args) {
						
			int[][] coordList = {{1,1}, {4,8}, {-3,9}}; 
			
							
			int listLength = coordList.length;
			int[] mDistanceList = new int[listLength * 2]; //Initialize list length
			int mDistanceListIndex  = 0; //list positioning index 
			
				
			//element reps. coordinate currently calculating with others in list
			for (int elementIndex = 0; elementIndex < listLength; elementIndex++) {
					
				//select element in list
				int[] targetElement = coordList[elementIndex];
					
				for (int compareIndex = 0; compareIndex < listLength; compareIndex++) {
						
					int[] compareElement = coordList[compareIndex];
						
					//ie they are not the same coordinates
					if (compareElement != targetElement) {
						
						// *** CALCULATE MANHATTAN DISTANCE ***
							
						//target coords - x,y
						int xOne = targetElement[0];
						int yOne = targetElement[1];
							
						//comparing coords - x,y
						int xTwo = compareElement[0];
						int yTwo = compareElement[1];
							
						int deltaX = xTwo - xOne;
						int deltaY = yTwo - yOne;
							
						//take absolute values to solve distance 
						int mDistance = Math.abs(deltaX) + Math.abs(deltaY);
																
						mDistanceList[mDistanceListIndex] = mDistance;	
							
						//System.out.println(Arrays.toString(mDistanceList));

						//increment to add next mDistance next to previous value in list
						mDistanceListIndex += 1;
						
						}
					}
								
				}
				
			//Exit out of for loop, sort list, return result
			Arrays.sort(mDistanceList);
					
			// first element * last element
			int result = mDistanceList[0] * mDistanceList[(listLength * 2) - 1 ]; 		
				
			System.out.println("Manhattan Distance Product Result: " + result);
				
				
	}

}
