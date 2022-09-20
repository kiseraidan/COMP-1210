import java.util.Scanner;
/**
* Defines a user measurement in specific different imperial measurements.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 1 September 2022
*/
public class LaserMeasure {
/** 
* Allows for user input for a distance and converts the user input into 
* combined separate imperial units of measurement by use of the divide
* and remainder functions.
*
* @param args Command Line arguments (not used).
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      
      // Defines variables
      int userInches, miles, yards, feet, inches;
      
      // Prompt the user to enter their raw distance in inches
      System.out.print("Enter the raw distance measurement in inches: ");
      userInches = userInput.nextInt();
      
      // If-Else to ensure inchesInput is non-negative
      if (userInches < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      /*
      * Continues the program as normal. Uses division and remainder functions
      * in order to display the overall distance in overall miles, yards, 
      * feet, and inches from the user input.
      */
      else { 
         miles = userInches / 63360;
         inches = userInches % 63360;
         yards = inches / 36;
         inches = inches % 36;
         feet = inches / 12;
         inches = inches % 12;
      
      /* 
      * Outputs and displays the data given by user input calculated in
      * lines 35-40
      */
         System.out.println("\nMeasurement by combined miles, yards, feet, " 
             + "inches:");
         System.out.println("\tmiles: " + miles);
         System.out.println("\tyards: " + yards);
         System.out.println("\tfeet: " + feet);
         System.out.println("\tinches: " + inches);
         System.out.println("\n" + userInches + " in = " + miles + " mi, "
            + yards + " yd, " + feet + " ft, " + inches + " in");
      }
   }
}