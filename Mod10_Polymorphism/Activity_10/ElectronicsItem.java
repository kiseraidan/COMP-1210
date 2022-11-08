/**
* Class ElectronicsItem represents an electronics item in a store and is a 
* child class of InventoryItem.
*
* Activity 9
* @author Aidan Kiser - COMP1210 - 001
* @version 1 November 2022
*/
public class ElectronicsItem extends InventoryItem {

   // fields
   protected double weight;
   
   /**
   * Class SHIPPING_COST is static to be accessed moderately.
   */
   public static final double SHIPPING_COST = 1.5;
   
   /**
   * Constructor accepts three parameters: a parameter of type String 
   * representing the name of the customer, a parameter of type double
   * representing the price of the item, and a parameter of type double that
   * represents the weight of the item. These parameters are used to assign
   * the fields described above.
   *
   * @param nameIn The new name of the customer that is inputed.
   * @param priceIn The new price of the item.
   * @param weightIn The weight of the item.
   */
   public ElectronicsItem(String nameIn, double priceIn, 
      double weightIn) {
   
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
   * calculateCost calculates the cost of for the customer using the price and
   * the tax rate.
   *
   * @return The new total cost for the customer.
   */
   public double calculateCost() {
         
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}