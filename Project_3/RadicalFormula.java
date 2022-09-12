import java.util.Scanner;
import java.text.DecimalFormat;
/**
* Solves an expression given a value by the user and displays a specific
* formatted result.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 7 September 2022
*/
public class RadicalFormula {
/** 
* Allows the input of a value to solve a specific expression, then displays
* digits to the left and right of the decimal, then displays the formatted
* result.
*
* @param args Command Line arguments (not used).
*/
   public static void main(String[] args) {
   
      // Allows user input.
      Scanner userInput = new Scanner(System.in);
      
      // Defines the variable the user will input as x.
      double x;
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      // The actual expression be computed.
      double result1 = Math.pow((3 * Math.pow(x, 8)) - (2 * Math.pow(x, 3)), 2);
      double result2 = Math.abs((3 * Math.pow(x, 5)) - (2 * Math.pow(x, 3)));
      double result = Math.sqrt(result1 + result2);
      
      // Converting the result of the expression to a string.
      String converted = Double.toString(result);
      
      System.out.println("Result: " + converted);
      
      // Gathering the length to diplay the left and right of decimal.
      int length = converted.length();
      int index = converted.indexOf(".");
      int left, right;
      
      left = index;
      right = (length - index) - 1;
      
      System.out.println("# digits to left of decimal point: " + left);
      System.out.println("# digits to right of decimal point: " + right);
      
      DecimalFormat decimal = new DecimalFormat("#,##0.0##");
      
      converted = decimal.format(result);
      
      System.out.print("Formatted Result: " + converted);
   }
}