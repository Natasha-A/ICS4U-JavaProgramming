
import java.io.File; 
import java.util.Scanner; 
import java.util.StringTokenizer;

public class ReadFile_Basic_withTokenizer {
  
  public static void main(String[] args) throws Exception { 
    File file = new File("Sample.txt"); 
    Scanner sc = new Scanner(file);  
    while (sc.hasNextLine())  {
      String line = sc.nextLine();
      StringTokenizer tokens = new StringTokenizer(line, ", ");
      while (tokens.hasMoreTokens()) {
        System.out.println(tokens.nextToken());
      }
    } // while sc.hasNext...
  } // main
  
}
