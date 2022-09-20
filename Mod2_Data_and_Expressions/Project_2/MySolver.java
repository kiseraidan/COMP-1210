import java.util.Scanner;
/**
* Recieves values from the user and executes a specific formula given the
* values from the user.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 30 August 2022
*/
public class MySolver {
   /**
   * Allows user input for variables of x, y, and z and inputs those values
   * values into a specific equation, and outputs the result of the equation
   * based on the inputed values.
   *
   * @param args Command Line arguments (not used).
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      
      double variablex, variabley, variablez;
      
   // Displays the formula in which x, y, and z are variables inputed by user.
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
      
   // Prompt the user to input their value for x.
      System.out.print("\tEnter x: ");
      variablex = userInput.nextDouble();
      
   // Prompt the user to input their value for y.
      System.out.print("\tEnter y: ");
      variabley = userInput.nextDouble();
      
   // Prompt the user to input their value for z.
      System.out.print("\tEnter z: ");
      variablez = userInput.nextDouble();
      
   /*
   * Executes the formula with inputed values of x, y, and z from the user
   * then returns the value of the formula if z ≠ 0 as the result.
   * If z = 0, the result will return as undefined.
   */
      if (variablez == 0) {
         System.out.println("result is undefined");
      } 
      else {
         System.out.println("result = "
            + (double) (((8.5 * variablex) + 6.1) * ((10 * variabley) + 7.9) 
             / variablez));
      }
   }
}