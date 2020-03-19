
// String Methods (charAt, concat, contains, indexOf, lastIndexOf)
public class tutorialFiftheen {

	public static void main(String[] args) {
		
		//1_ CHARAT
		String x = "this is a test";
		System.out.println(x.charAt(2)); //spaces are considered characters
		
		//LAST CHARACTER - length is always going to be one larger than actual amount,
		//thus need to use -1:
		System.out.println(x.charAt(x.length()-1));
		
		//2) CONCAT
		String fullAd = x.concat(", Now we are adding more stuff here.");
		System.out.println(fullAd);
		
		//3) CONTAINS
        //if string contains what is passed
		System.out.println(fullAd.contains("Now")); //prints boolean
		
		//4) INDEXOF
		System.out.println(fullAd.indexOf("this")); //index of zero
		System.out.println("index:" + fullAd.indexOf("this", 0)); //counts 0,1,2,3..4,5,6
		
		
		//---Dynamically change the index value to contain first occurrence
		String y = "yummmm...my of my chicken pot pie";
		
		System.out.println(y.indexOf("y", y.indexOf("y") + 1));
		//finds my, going to skip it, and find the second y
		//takes second occurrence of the letter "y" (index 10)
		
		//5) LASTINDEXOF
		System.out.println(y.lastIndexOf("y")); //already made skip first occurence, so finds last occurence (at index 16) 
		
		
		//NOTE: Will print -1 if value doesn't exist
	}

}