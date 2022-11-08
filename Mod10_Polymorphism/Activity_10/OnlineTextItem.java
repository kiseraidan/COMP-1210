/**
* Class OnlineTextItem represents an an online text item in a store and is a 
* child class of InventoryItem.
*
* Activity 9
* @author Aidan Kiser - COMP1210 - 001
* @version 1 November 2022
*/
public abstract class OnlineTextItem extends InventoryItem {

   
   /**
   * Constructor accepts two parameters: a parameter of type String 
   * representing the name of the customer, and a parameter of type double
   * representing the price of the item. These parameters are used to assign
   * the fields described above.
   *
   * @param nameIn The new name of the customer that is inputed.
   * @param priceIn The new price of the item.
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
   }
   
   /**
   * calculateCost calculates the cost of for the customer using the price and
   * the tax rate.
   *
   * @return The new total cost for the customer.
   */
   public double calculateCost() {
   
      return price;
   }
}