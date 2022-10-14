import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
* Class HexagonalPrismListMenuApp creates a menu presented to the user with 
* eight different options.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 30 September 2022
*/
public class HexagonalPrismListMenuApp {
   
   /**
   * Prints a list of options with action and a short description prompting
   * the user to select an action.
   *
   * @param args Command line arguments (not used)
   * @throws FileNotFoundException (used)
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      // Scanner and Instance Variables
      
      Scanner scan = new Scanner(System.in);
      ArrayList<HexagonalPrism> list = new ArrayList<HexagonalPrism>();
      HexagonalPrismList newList = new HexagonalPrismList("", list);
      
      // Print menu
      
      String menu = "";
      menu += "HexagonalPrism List System Menu";
      menu += "\nR - Read File and Create HexagonalPrism List";
      menu += "\nP - Print HexagonalPrism List";
      menu += "\nS - Print Summary";
      menu += "\nA - Add HexagonalPrism";
      menu += "\nD - Delete HexagonalPrism";
      menu += "\nF - Find HexagonalPrism";
      menu += "\nE - Edit HexagonalPrism";
      menu += "\nQ - Quit";
      System.out.println(menu);
      
      // Prompt for action code
      
      char code = 'Q';
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine().charAt(0);
         code = Character.toUpperCase(code);
         switch (code) {
            case 'R': // Read file
               // Obtain file name
               String file = "";
               System.out.print("\tFile name: ");
               file = scan.nextLine();
               // Read file 
               newList = newList.readFile(file);
               System.out.println("\tFile read in and HexagonalPrism "
                  + "List created");
               break;
            
            case 'P': // Print
               System.out.println(newList);
               break;
            
            case 'S': // Summmary
               System.out.println("\n" + newList.summaryInfo());
               break;
               
            case 'A': // Add
               String addLabel = "";
               double addEdge = 0.0;
               double addHeight = 0.0;
               // Obtain new params
               System.out.print("\tLabel: ");
               addLabel = scan.nextLine().trim();
               System.out.print("\tEdge: ");
               addEdge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               addHeight = Double.parseDouble(scan.nextLine());
               // Create and add new object
               newList.addHexagonalPrism(addLabel, addEdge, addHeight);
               System.out.print("\t*** HexagonalPrism added ***");
               break;
               
            case 'D': // Delete
                // Obtain and delete object label
               String deleteLabel = "";
               System.out.print("\tLabel: ");
               deleteLabel = scan.nextLine().trim();
                // if else object to be deleted
               if (newList.findHexagonalPrism(deleteLabel) == null) {
                  System.out.println("\t\"" + deleteLabel + "\" not found");
               }
               else {
                  System.out.println("\t\""
                     + newList.findHexagonalPrism(deleteLabel).getLabel()
                     + "\" deleted");
                  newList.deleteHexagonalPrism(deleteLabel);
               }
               break;
                
            case 'F' : // Find
               // Obtain found object label
               String findLabel = "";
               System.out.print("\tLabel: ");
               findLabel = scan.nextLine().trim();
               // if else object to be found 
               if (newList.findHexagonalPrism(findLabel) != null) {
                  System.out.println(newList.findHexagonalPrism(findLabel));
               }
               else {
                  System.out.println("\t\"" + findLabel + "\" not found");
               }
               break;
               
            case 'E': // Edit
               String editLabel = "";
               double editEdge = 0.0;
               double editHeight = 0.0;
               // Obtain edited params
               System.out.print("\tLabel: ");
               editLabel = scan.nextLine().trim();
               System.out.print("\tEdge: ");
               editEdge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               editHeight = Double.parseDouble(scan.nextLine());
               // if else object to be edited
               if (newList.findHexagonalPrism(editLabel) != null) {
                  // Edit Label
                  newList.editHexagonalPrism(editLabel, editEdge, editHeight);
                  System.out.println("\t\"" + editLabel + "\" successfully "
                     + "edited");
               }
               else {
                  System.out.println("\t\"" + editLabel + "\" not found");
               }
               break;
            
            case 'Q': // Quit
               break;
               
            default: // Invalid
               System.out.println("\t*** invalid code ***");
               break;
         }
         
         System.out.print("\n");
      }
      
      while (code != 'Q');
   }
}