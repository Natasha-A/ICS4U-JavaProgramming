/*
Name: Natasha Ahammed
Date: Februrary 24, 2020
File Name: Natasha_Ahammed_StringAssignment1.py
Description: Searches through given text in order to determine # of target words are in the text string (without repetition)
Test Cases: Multiple text and target values manipulated and print statements to determine proper calling and execution 
 */
public class strAssignment {

	public static void main(String[] args) {
		String text = "ssososoossoosos";
		String target = "sos";
		
		int textIndex = 0;		
		int totalTextLength = text.length();
		int targLength = target.length();
		int startIndex = 0;
		int endIndex = targLength;
		int targAccquired = 0;
		
		
		while (textIndex <= totalTextLength) {
			String currentText = text.substring(startIndex, endIndex); 			
			
			//check if text section equals target value
			if (currentText.equals(target)) {
				targAccquired += 1;
				System.out.println("The number of targets in the text are: " + targAccquired );

			}
			
			//update index values
			textIndex += 1; // increase checking in text searching 
			startIndex = endIndex; //start at endIndex for next loop
			endIndex += targLength; //increase end index by target length to check next section 
								
		}
	}

}
