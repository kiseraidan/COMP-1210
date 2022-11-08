/**
* Class OnlineArticle represents an an online text item in a store and is a 
* child class of OnlineTextItem.
*
* Activity 9
* @author Aidan Kiser - COMP1210 - 001
* @version 1 November 2022
*/
public class OnlineArticle extends OnlineTextItem {

   //fields
   private int wordCount;
   
   
   /**
   * Constructor accepts two parameters: a parameter of type String 
   * representing the name of the customer, and a parameter of type double
   * representing the price of the item. These parameters are used to assign
   * the fields described above.
   *
   * @param nameIn The new name of the customer that is inputed.
   * @param priceIn The new price of the item.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
      
      wordCount = 0;
   }
   
   /**
   * setWordCount sets the word count for the customer.
   *
   * @param wordCountIn The word count for the customer.
   */
   public void setWordCount(int wordCountIn) {
   
      wordCount = wordCountIn;
   }
}