import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
* Decodes a code inputed by the user for various types of box lunches.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 7 September 2022
*/
public class BoxLunch {
/** 
* Allows a coded input from the user. The main method decodes the code into 
* adult meals and its price, child meals and its price, total price spent, 
* theme, and a randomized lucky number. Prints to standard output.
*
* @param args Command Line arguments (not used).
*/
   public static void main(String[] args) {
   
      // Allows user input.
      Scanner userInput = new Scanner(System.in);
      
      Random generator = new Random();
      int luckyNumber = generator.nextInt(9998) + 1;
      DecimalFormat priceFormat = new DecimalFormat("$#0.00");
      DecimalFormat luckyFormat = new DecimalFormat("0000");
      String code = "";
      String theme = "";
      String name = "";
      int adultMeals, childMeals;
      double adultPrice, childPrice, total;
      
      // Trims the white space.
      System.out.print("Enter order code: ");
      code = userInput.nextLine();
      code = code.trim();
      int codeLength = code.length();
      System.out.println();
      
      // Outputs error message.
      if (codeLength < 13) {
         System.out.println("*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      }
      else { // Determines theme.
         if (code.charAt(0) == '0') {
            theme = "Birthday";
         }
         else if (code.charAt(0) == '1') {
            theme = "Graduation";
         }
         else {
            theme = "Holiday";
         }
         
         // Decodes the inputed code.
         adultMeals = Integer.parseInt(code.substring(1, 3));
         adultPrice = Double.parseDouble(code.substring(3, 5) + '.' 
            + code.substring(5, 7));
         childMeals = Integer.parseInt(code.substring(7, 9));
         childPrice = Double.parseDouble(code.substring(9, 11) + '.'
                     + code.substring(11, 13));
         total = (adultMeals * adultPrice) + (childMeals * childPrice);
         name = code.substring(13, (code.length()));
         
         // Prints the output of the user's inputed code.
         System.out.println("Name: " + name);
         System.out.println("Adult meals: " + adultMeals + " at "
            + priceFormat.format(adultPrice));
         System.out.println("Child meals: " + childMeals + " at "
               + priceFormat.format(childPrice));
         System.out.println("Total: " + priceFormat.format(total));
         System.out.println("Theme: " + theme);
         System.out.println("Lucky Number: " + luckyFormat.format(luckyNumber));
      }
   }
   
}