
import java.io.File; 
import java.util.Scanner; 
import java.util.StringTokenizer;

public class ReadFile_Basic {
  
  public static void main(String[] args) throws Exception { 
    File file = new File("Sample.txt"); 
    Scanner sc = new Scanner(file);  
    while (sc.hasNextLine())  {
      String line = sc.nextLine();
    } // while sc.hasNext...
  } // main
  
}
