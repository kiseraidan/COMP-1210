import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
* Class HexagonalPrismListApp scans a file and feed in the data on the file 
* and stores the data as a ArrayList of Hexagonal Prisms.
* Then returns formatted summary for on each Hexagonal Prism contained 
* in the input file.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 22 September 2022
*/
public class HexagonalPrismListApp {
   /**
   * Program prompts user to input a file.
   * Uses HexagonalPrism and HexagonalPrismList class to determine output
   *
   * @param args Command line arguments (not used)
   * @throws FileNotFoundException throws files that don't have anything
   */
   
   public static void main(String[] args) throws FileNotFoundException {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = in.nextLine();
      ArrayList<HexagonalPrism> prismList = new ArrayList<HexagonalPrism>();
      Scanner scanFile = new Scanner(new File(fileName));
      String myListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         double side = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         prismList.add(new HexagonalPrism(label, side, height));
      }
      HexagonalPrismList outputList = 
         new HexagonalPrismList(myListName, prismList);
      System.out.println();
      System.out.println(outputList.toString());
      System.out.println(outputList.summaryInfo());
   }
}
