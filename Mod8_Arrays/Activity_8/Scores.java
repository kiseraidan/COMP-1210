/**
* Class Scores holds an array of numerical values and provide methods that
*  allow users to interact with the Scores class.
*
* Activity 8
* @author Aidan Kiser - COMP1210 - 001
* @version 25 October 2022
*/
public class Scores {

   // instance varibable
   private int[] numbers;
   
   /** 
   * Constructor method Scores uses an array parameter.
   *
   * @param numbersIn An array of integer values.
   */
   public Scores(int[] numbersIn) {
   
      numbers = numbersIn;
   }
   
   /**
   * findEvens finds the even numbers inside the array.
   *
   * @return The even numbers listed in the array. 
   */
   public int[] findEvens() {
      
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 == 0) {
         
            numberEvens++;
         }
      }
        
      int[] evens = new int[numberEvens];
      int count = 0;
        
      for (int i = 0; i < numbers.length; i++) {
         
         if (numbers[i] % 2 == 0) {
            
            evens[count] = numbers[i];
            
            count++;
         }
      }
      
      return evens;
   }
   
   /**
   * findOdds finds the odd numbers in the array.
   *
   * @return The odd numbers listed in the array.
   */
   public int[] findOdds() {
   
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 == 1) {
         
            numberOdds++;
         }
      }
        
      int[] odds = new int[numberOdds];
      int count = 0;
        
      for (int i = 0; i < numbers.length; i++) {
         
         if (numbers[i] % 2 == 1) {
            
            odds[count] = numbers[i];
            
            count++;
         }
      }
      
      return odds;
   }
   
   /**
   * calculateAverage calculates the average of every element in the array.
   *
   * @return The average of the elements in the array.
   */
   public double calculateAverage() {
   
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
      
         sum += numbers[i];
      }
      
      return (sum / (double) numbers.length);
   }
   
   /**
   * toString returns the string of the array.
   *
   * @return The array result.
   */
   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
      
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   /**
   * toStringInReverse returns the string of the array in reverse.
   *
   * @return The array result in reverse.
   */
   public String toStringInReverse() {
   
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
      
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}