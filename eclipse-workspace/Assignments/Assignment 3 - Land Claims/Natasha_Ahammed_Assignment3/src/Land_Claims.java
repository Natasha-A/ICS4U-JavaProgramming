import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.StringTokenizer;

public class Land_Claims {
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
      System.out.println("2D Array:" + lcList2D);
	  
	  // *** ROWS ***
	  //Variables/Constants for for loop scopes underneath
	  String startRowValue = null;
	  String rangeRowValue = null;
	  ArrayList<Object> rowsLandClaims2D = new ArrayList<Object>(); //stores all rows from all lists
	  // Individual Land Claim - "ILC" short form
	  ArrayList<Object> rowsILC = new ArrayList<Object>(); //stores all rows from all lists
      

	  int LEFT_INDEX = 1; 
	  int WIDTH_INDEX = 3; 
	  //turn into method!
	  //**Handles Accessing each value in 2d array:**
	  for (int i=0; i < lcList2D.size(); i++) {
		  System.out.println("ILC: " + lcList2D.get(i));
		  
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
		  System.out.println("Total Rows List: " + rowsLandClaims2D);
		  //System.out.println("Total Columns List: " + columnLandClaims2D);


    //Integer targetRowValue = null;
	//String targetColumnValue = null;
	//String listRowValue = null;
	//String listColumnValue = null;
	
	 Object lengthRowsILC = null;
	 Object lengthColumnsILC = null;

	
	//clone array to avoid affecting original array -- keeps original size
    ArrayList<Integer> rowsLandClaims2DClone =  (ArrayList<Integer>) rowsLandClaims2D.clone();
    ArrayList<Integer> columnsLandClaims2DClone =  (ArrayList<Integer>) columnLandClaims2D.clone();


	lengthRowsILC = rowsLandClaims2DClone;
	lengthColumnsILC = columnsLandClaims2DClone;

	
	for (int listIndex = 0; listIndex < rowsLandClaims2D.size(); listIndex++ ) {
		
		//*** ANOTHER FOR LOOP: just to get rowsListLength (one 1D array list length) ***

		System.out.println(listIndex);
		System.out.println(lengthRowsILC);

 
		//Extracts 1D list from 2D Rows and Columns Lists 
		//lengthRowsILC = rowsLandClaims2D.get(listIndex);
		//lengthColumnsILC = columnLandClaims2D.get(listIndex);
		Object currentTargetRow = ((ArrayList<Object>) lengthRowsILC).get(0);
		
		//**Move target ROW to END of list - avoid checking with same list**
		((ArrayList<Object>) lengthRowsILC).remove(currentTargetRow);
		((ArrayList<Object>) lengthRowsILC).add(currentTargetRow);
		


		

		//((ArrayList<Integer>) lengthRowsILC).add(((ArrayList<Integer>) lengthRowsILC).get(0));		

		//columnLandClaims2D.remove(listIndex);
		//columnLandClaims2D.add(lengthColumnsILC);
				
		
	}
		
		
		/*
		for (int rowILCLength = 0; rowILCLength < ((ArrayList<String>) lengthRowsILC).size(); rowILCLength++) {
						
			Integer targetRowILC = ((ArrayList<Integer>) lengthRowsILC).get(rowILCLength);
			Integer targetColumnILC = ((ArrayList<Integer>) lengthColumnsILC).get(rowILCLength);
			
			System.out.println("Target Row: " + targetRowILC);
			System.out.println("Target Column " + targetColumnILC);
			
			for (int newIndex = 0; newIndex < 10; newIndex++) { //extract # (list - 1) for comparing 
				
				//then another for loop for comparing between elements in each list 
				
				System.out.println(newIndex);
				
				
			}
		*/
			
		
		System.out.println("\n");
		
		
		//targetRowValue = ((ArrayList<Integer>) rowsLandClaims2D.get(rowsListLength)).get(rowsListLength); //Total Row Lists 
	    
	    //targetColumnValue = ((ArrayList<String>) columnLandClaims2D.get(rowsListLength)).get(rowsListLength);
	    //System.out.println("TR " + targetRowValue);
		
		//System.out.println(Arrays.toString((Object[]) rowLandClaimsArray2D));

		//*
	  	//int targetCV = Integer.parseInt(targetColumnValue);
	  		
  		//for (int columnsListLength = 0; columnsListLength < columnLandClaims2D.size(); columnsListLength++) {
  			
  			
  			//listRowValue = ((ArrayList<String>) rowsLandClaims2D.get(columnsListLength)).get(columnsListLength);
  			//listColumnValue = ((ArrayList<String>) columnLandClaims2D.get(columnsListLength)).get(columnsListLength);
  			  		
  			//int listRV = Integer.parseInt(listRowValue);
  			//int listCV = Integer.parseInt(listColumnValue);
  			
  			//if (((targetRV == listRV) && (targetCV == listCV))) {
  				//System.out.println("One same");
  			//}
  		
  		//*/
		
	}
	  

    	       
    //ROW COORDINATE AND COLUMN COORDINATE MUST BE THE SAME IN ORDER TO BE CALLED DUPLCATE AREAc
    //Handle everything as lists going forward!
    //Find Row Coordinate Values Occupied by Individual Land Claim 
    
    
    
	}

 
