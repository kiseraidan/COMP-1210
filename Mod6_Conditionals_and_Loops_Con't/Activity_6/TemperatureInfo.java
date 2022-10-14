import java.util.Scanner;
import java.util.ArrayList;
/**
* Class TempuraturesInfo allows user input to display low and high tmeperatures.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 27 September 2022
*/
public class TemperatureInfo {

 /**
 * Main method to input user values for temperature and display them.
 *
 * @param args Command Line arguments (not used)
 */
   public static void main(String[] args) {
      final Scanner userInput = new Scanner(System.in);
      final ArrayList<Integer> tempList = new ArrayList<>();
   
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempList.add(Integer.parseInt(tempInput));
         }
      }
      while (!tempInput.equals(""));
      final Temperatures temps = new Temperatures(tempList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      }
      
      while (choice != 'E');
      userInput.close();
   }
}