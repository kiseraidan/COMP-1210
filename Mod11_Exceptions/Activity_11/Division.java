/**
* Class Division gets a numerator and a denominator value and demonstrates
* integer and float division.
* 
* Activity 11
* @author Aidan Kiser - COMP1210 - 001
* @version 14 November 2022
*/
public class Division {

   /**
   * intDivide accepts two int parameters: one representing the numerator and
   * one representing the denominator, then performs integer division, and
   * returns the int result of dividing the numerator by the denominator.
   * 
   * @param numerator The numerator of the division.
   * @param denominator The denominator of the division.
   * @return Either the result of the division, or 0.
   */
   public static int intDivide(int numerator, int denominator) {
   
      try {
         
         return numerator / denominator;
      }
      
      catch (ArithmeticException e) {
      
         return 0;
      }
   }
   
   /**
   * decimalDivide accepts two int parameters: one representing the numerator
   * and one representing the denominator, performs floating point division,
   * and returns the result of dividing the numerator by the denominator.
   * 
   * @param numerator The numerator of the division.
   * @param denominator The denominator of the division.
   * @return The result of the division as a double.
   * @throws IllegalArgumentException is thrown if the denominator is zero.
   */
   public static double decimalDivide(int numerator, int denominator) {
   
      if (denominator == 0) {
      
         throw new IllegalArgumentException("The denominator cannot be zero.");
      }
      
      return (double) numerator / (double) denominator;
   }
}