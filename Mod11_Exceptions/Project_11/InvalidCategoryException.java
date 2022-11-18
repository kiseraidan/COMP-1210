/**
* Class InvalidCategoryException is a user defined exception created by
* extending the Exception class. This exception is thrown and caught in the
* readItemFile method in the BakedItemList class when a line of input data
* contains an invalid baked item category.
* 
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 17 November 2022
*/
public class InvalidCategoryException extends Exception {

 /**
 * Constructor for InvalidCategoryException takes a single String parameter
 * representing category and invokes the super constructor.
 *
 * @param category The invalid category that is inputed. 
 */
   public InvalidCategoryException(String category) {
   
      super("For category: " + "\"" + category + "\"");
   }
}