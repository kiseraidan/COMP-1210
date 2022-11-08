/**
* Class OnlineBook represents an an online text item in a store and is a 
* child class of OnlineTextItem.
*
* Activity 9
* @author Aidan Kiser - COMP1210 - 001
* @version 1 November 2022
*/
public class OnlineBook extends OnlineTextItem {

   //fields
   protected String author;
   
   /**
   * Constructor accepts two parameters: a parameter of type String 
   * representing the name of the customer, and a parameter of type double
   * representing the price of the item. These parameters are used to assign
   * the fields described above.
   *
   * @param nameIn The new name of the customer that is inputed.
   * @param priceIn The new price of the item.
   */
   public OnlineBook(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
      
      author = "Author Not Listed";
   }
   
   /**
   * setAuthor sets the author.
   *
   * @param authorIn The new author inputed.
   */
   public void setAuthor(String authorIn) {
   
      author = authorIn;
   }
   
   /**
   * toString displays the details of the item for the customer.
   *
   * @return The name and cost.
   */
   public String toString() {
   
      return name + " - " + author + ": $" + price;
   }

}