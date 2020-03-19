import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; 

public class ReadFiles_Example {
  public static void main(String[] args) {
    try {
      File textFile = new File("/Users/natasha.ahammed/eclipse-workspace/Natasha_Ahammed_Assignment3/src/Sample.txt");
      Scanner myReader = new Scanner(textFile);
      
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
      
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}