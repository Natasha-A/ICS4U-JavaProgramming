
public class tutorialSixthteen {

	public static void main(String[] args) {
		String fullAd = "yummmm...my oh my chicken pot pie.";
		//1) Upper case
		System.out.println(fullAd.toUpperCase());
		
		//2) Lower case
		System.out.println(fullAd.toLowerCase());
		
		//3) Clip off white space (beginning or , \n, tabs)
		System.out.println(fullAd.strip()); //.stripLeading
		
		//4) Substring - get a part of a string
		System.out.println(fullAd.substring(9,17)); 
		//starts at index 9 - INCLUSIVE 
		//if you want to get to ending position, need final end of word index + 1
		//ends at 17... prints my oh my - EXCLUSIVE
		
		//5) Repeat - repeats for an amount 
		System.out.println(fullAd.repeat(3));
		
		//6) Equals - tests same between strings
		System.out.println(fullAd.equals("hello"));
		
		//prints out boolean to search through to see if equal to 
		//desire value
		
		
		
		
		
		
		
		

	}

}
