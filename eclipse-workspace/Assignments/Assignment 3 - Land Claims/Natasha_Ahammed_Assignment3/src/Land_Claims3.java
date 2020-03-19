import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.StringTokenizer;

public class Land_Claims3 {
  @SuppressWarnings("unchecked")
public static void main(String[] args) {
	  
    ArrayList<String> LandClaimsList = new ArrayList<String>(); //Create Array List
   
    try {
      File textFile = new File("/Users/natasha.ahammed/eclipse-workspace"
      		+ "/Natasha_Ahammed_Assignment3/src/LandClaimData.txt");
      Scanner myReader = new Scanner(textFile);
      
      while (myReader.hasNextLine()) {
        String line = myReader.nextLine();
        StringTokenizer tokens = new StringTokenizer(line, "# @ : x , ");         
        
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken(); //Type cast individual token data as string 
            
            LandClaimsList.add(token); //Add Token to List 
        }
      }
      myReader.close(); //close scanner

    } catch (FileNotFoundException e) { 
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
            
      Object[] LandClaimsArray = LandClaimsList.toArray(); //convert array list into array object

      // HANDLE LAND CLAIM LISTS (separated into lengths of 5)
      int chunk = 5; //Separator for length of individual land claim info
      int lengthLandClaimsArray = LandClaimsArray.length; 
      
	  ArrayList<Object> lcList2D = new ArrayList<Object>();
      
      for (int i=0; i < lengthLandClaimsArray; i+=chunk) { 
    	  //System.out.println(Arrays.toString(Arrays.copyOfRange(LandClaimsArray, i, Math.min(lengthClaimsArray, i+chunk))));
    	  Object[] chunkArray = Arrays.copyOfRange(LandClaimsArray, i, Math.min(lengthLandClaimsArray, i+chunk));
          ArrayList<Object> listILC = new ArrayList<Object>(Arrays.asList(chunkArray)); //turn object into list

    	  //System.out.println(landClaimsList);
          lcList2D.add(listILC); //add list to 2d list    	  
      }
      //System.out.println("2D Array:" + lcList2D);
	  
	  // *** ROWS ***
	  //Variables/Constants for for loop scopes underneath
	  String startRowValue = null;
	  String rangeRowValue = null;
	  ArrayList<Object> rowsLandClaims2D = new ArrayList<Object>(); //stores all rows from all lists
	  // Individual Land Claim - "ILC" short form
	  ArrayList<Object> rowsILC = new ArrayList<Object>(); //stores all rows from all lists
	  int dupCoord = 0;
	  int previous = 0;


	  int LEFT_INDEX = 1; 
	  int WIDTH_INDEX = 3; 
	  //turn into method!
	  //**Handles Accessing each value in 2d array:**
	  for (int i=0; i < lcList2D.size(); i++) {
		  //System.out.println("ILC: " + lcList2D.get(i));
		  
		  //HANDLES 1D array 
		  for (int j=0; j < 1; j++) {
			  //type cast as string array list -- use .get to treat as 2d list indexing[][]
			  startRowValue = ((ArrayList<String>) lcList2D.get(i)).get(LEFT_INDEX); 
			  rangeRowValue = ((ArrayList<String>) lcList2D.get(i)).get(WIDTH_INDEX);
			  
			  //System.out.println(startRowValue);
			  //System.out.println(rangeRowValue);

		  } //HANDLES indexed 1D array "Start" coord. Row value, and "Range" coord. value
		  		//**create ROW coordinates occupied per ILC**
		  		int startRV = Integer.parseInt(startRowValue); //converts to int
		  		int rangeRV = Integer.parseInt(rangeRowValue);
	  			rowsILC = new ArrayList<Object>(); //store row coordinates in list

		  		for (int k=0; k < rangeRV; k++) { 

		  			int coordinate = startRV + k;
		  			
		  			rowsILC.add(coordinate);
		  			//System.out.println("ROWS for ILC: " + rowsILC);

		  		}
	  	rowsLandClaims2D.add(rowsILC);

	  }
	  
	// *** COLUMNS ***
		  //Variables/Constants for for loop scopes underneath
		  String startColumnValue = null;
		  String rangeColumnValue = null;
		  ArrayList<Object> columnLandClaims2D = new ArrayList<Object>(); //stores all rows from all lists
		  // Individual Land Claim - "ILC" short form
		  ArrayList<Object> columnsILC = new ArrayList<Object>(); //stores all rows from all lists
	      

		  
		  int TOP_INDEX = 2; 
		  int HEIGHT_INDEX = 4; 
		  //turn into method!
		  //**Handles Accessing each value in 2d array:**
		  for (int i=0; i < lcList2D.size(); i++) {
			  
			  //HANDLES 1D array 
			  for (int j=0; j < 1; j++) {
				  //type cast as string array list -- use .get to treat as 2d list indexing[][]
				  startColumnValue = ((ArrayList<String>) lcList2D.get(i)).get(TOP_INDEX); 
				  rangeColumnValue = ((ArrayList<String>) lcList2D.get(i)).get(HEIGHT_INDEX);
				  
				  //System.out.println(startColumnValue);
				  //System.out.println(rangeColumnValue);

			  } //HANDLES indexed 1D array "Start" coord. Row value, and "Range" coord. value
			  		//**create ROW coordinates occupied per ILC**
			  		int startCV = Integer.parseInt(startColumnValue); //converts to int
			  		int rangeCV = Integer.parseInt(rangeColumnValue);
			  		columnsILC = new ArrayList<Object>(); //store row coordinates in list

			  		for (int k=0; k < rangeCV; k++) { 

			  			int coordinate = startCV + k;
			  			
			  			columnsILC.add(coordinate);
			  			//System.out.println("COLUMNS for ILC: " + columnsILC);

			  		}
			columnLandClaims2D.add(columnsILC); //add total columns to 2d array list

		  }
		  //System.out.println("Total Rows List: " + rowsLandClaims2D);
		  //System.out.println("Total Columns List: " + columnLandClaims2D);


	Object reorderRowsILC = null;
	Object reorderColumnsILC = null;

	
	//clone array to avoid affecting original array -- keeps original size
    ArrayList<Integer> rowsLandClaims2DClone =  (ArrayList<Integer>) rowsLandClaims2D.clone();
    ArrayList<Integer> columnsLandClaims2DClone =  (ArrayList<Integer>) columnLandClaims2D.clone();


	reorderRowsILC = rowsLandClaims2DClone;
	reorderColumnsILC = columnsLandClaims2DClone;
	
	int totalDuplicateSpace = 0; 

	int sameRV = 0;
	int sameCV = 0;
	
	for (int listIndex = 0; listIndex < lcList2D.size(); listIndex++ ) {
		
		
		System.out.println(sameRV);
		System.out.println(sameCV);

		
		//*** ANOTHER FOR LOOP: just to get rowsListLength (one 1D array list length) ***
		//takes currently first values and adds to the end in order to avoid comparing with
		System.out.println("*****List Index: " + listIndex + " *****");
		
		Object currentListRows = ((ArrayList<Object>) rowsLandClaims2D).get(listIndex);
		Object currentListColumns = ((ArrayList<Object>) columnLandClaims2D).get(listIndex);

		
		//System.out.println(reorderColumnsILC);
		System.out.println(currentListRows);
		
		// REORDERING LISTS 
		Object currentTargetRow = ((ArrayList<Object>) reorderRowsILC).get(0);
		Object currentTargetColumn = ((ArrayList<Object>) reorderColumnsILC).get(0);
				
		//**Move target ROW to END of list - avoid comparing with same list**
		((ArrayList<Object>) reorderRowsILC).remove(currentTargetRow);
		((ArrayList<Object>) reorderRowsILC).add(currentTargetRow);
		
		//**Move target COLUMN to END of list - avoid comparing with same list**
		((ArrayList<Object>) reorderColumnsILC).remove(currentTargetColumn);
		((ArrayList<Object>) reorderColumnsILC).add(currentTargetColumn);
			
		
		System.out.println("ROWS REORDERED: " + reorderRowsILC);
		System.out.println("COLUMNS REORDERED: " + reorderColumnsILC);

		
		for (int targetIndex = 0; targetIndex < ((ArrayList<Integer>) currentListRows).size(); targetIndex++) {
			
			sameRV = 0;
			sameCV = 0;
			
			Integer currentTargetRV = ((ArrayList<Integer>) currentListRows).get(targetIndex);
			Integer currentTargetCV = ((ArrayList<Integer>) currentListColumns).get(targetIndex);
			
			System.out.println("");
			System.out.println("**Current Target Row: " + currentTargetRV);
			System.out.println("**Current Target Column: " + currentTargetCV);
			System.out.println("");

			
			for (int compareIndex = 0; compareIndex < (lcList2D.size()-1); compareIndex++) {
				Object compareListRows = ((ArrayList<Object>) reorderRowsILC).get(compareIndex);
				Object compareListColumns = ((ArrayList<Object>) reorderColumnsILC).get(compareIndex);


				System.out.println("Compare ROW List: " + compareListRows);
				System.out.println("Compare COLUMN List: " + compareListColumns);
				
				
				for (int compareCoordIndex = 0; compareCoordIndex < ((ArrayList<String>) compareListRows).size(); compareCoordIndex++) {
					Integer compareRV = ((ArrayList<Integer>) compareListRows).get(compareCoordIndex);
					Integer compareCV = ((ArrayList<Integer>) compareListColumns).get(compareCoordIndex);

					System.out.print("TRV: " + currentTargetRV + " and ");
					System.out.println("CRV: " + compareRV);
					System.out.print("");
					System.out.print("TCV: " + currentTargetCV + " and ");
					System.out.println("CCV: " + compareCV);
					System.out.println("");

					
					if (currentTargetRV == compareRV) {
						sameRV += 1;
						System.out.println("");
						System.out.println("SAME **ROW** VALUE COUNT:" + sameRV);
					}
					
					if (currentTargetCV == compareCV) {
						sameCV += 1;
						System.out.println("");
						System.out.println("SAME **COLUMN** VALUE COUNT:" + sameCV);
					}
				}
			}	
			
			
			
		}
		if (sameRV == sameCV) {
			dupCoord += 1;
			totalDuplicateSpace = previous + ( sameRV + sameCV);
			
			System.out.println("DuplicateCoords: " + dupCoord);
			System.out.println("Duplicate Square Meters: " + (totalDuplicateSpace));
			
			previous = totalDuplicateSpace;

		} else {
			System.out.println("No duplicate spaces.");
		}
		System.out.println("");
		System.out.println("Next change at: " + reorderRowsILC);
		System.out.println("");
		
	}
		System.out.println("\n");
	}
}

 
