import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; 
import java.util.StringTokenizer;

public class ReadFile_Tokenizer {
  public static void main(String[] args) {
    try {
      File textFile = new File("/Users/natasha.ahammed/eclipse-workspace/SampleHowTo_ReadFileWithTokenizer/src/Sample.txt");
      Scanner myReader = new Scanner(textFile);
      
      while (myReader.hasNextLine()) {
        String line = myReader.nextLine();
        StringTokenizer tokens = new StringTokenizer(line, "@ : x , ");
        
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
      }
      myReader.close();
      
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}