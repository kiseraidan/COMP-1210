/**
* Program that holds an integer value and uses methods to execute various
* operations to that value.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 20 September 2022
*/
public class NumberOperations {
   private int number;
   
   // Constructor
   
   /**
   * Constructor takes in the parameter integer numberIn.
   *
   * @param numberIn is inputed
   */  
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   
   // Methods
   
   /**
   * Method retrieves an integer number.
   *
   * @return getValue is number
   */
   public int getValue() {
      return number;
   }
   
   /**
   * Method returns the string for oddsUnder dependent on i.
   *
   * @return oddsUnder string output
   */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
   * Method returns string powersTwoUnder dependent on output by power.
   *
   * @return powersTwoUnder string output
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; //concatenate to output
         powers = powers * 2; //get the next power of 2
      }
      return output;
   }
   
   
   /**
   * Method takes in the parameter integer compareNumber for integer isGreater.
   *
   * @param compareNumber is taken in
   * @return isGreater integer
   */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }   
   }
   
   /**
   * Method returns a string toString.
   *
   * @return toString string
   */
   public String toString() {
      return number + "";
   }

}



