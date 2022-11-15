/**
* Class InventoryItem represents an inventory item in a store.
*
* Activity 9
* @author Aidan Kiser - COMP1210 - 001
* @version 1 November 2022
*/
public class InventoryItem {

   // fields
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
   * Constructor accepts two parameters: a parameter of type String 
   * representing the name of the customer, and a parameter of type double
   * representing the price of the item. These parameters are used to assign
   * the fields described above.
   *
   * @param nameIn The new name of the customer that is inputed.
   * @param priceIn The new price of the item.
   */
   public InventoryItem(String nameIn, double priceIn) {
   
      name = nameIn;
      price = priceIn;
   }
   
   /**
   * getName gets the name of the customer.
   *
   * @return The name of the customer.
   */
   public String getName() {
   
      return name;
   }
   
   /**
   * calculateCost calculates the cost of for the customer using the price and
   * the tax rate.
   *
   * @return The new total cost for the customer.
   */
   public double calculateCost() {
      
      return price * (1 + taxRate);
   }
   
   /**
   * setTaxRate sets the tax rate for the customer.
   *
   * @param taxRateIn The tax rate for the customer.
   */
   public static void setTaxRate(double taxRateIn) {
   
      taxRate = taxRateIn;
   }
   
   /**
   * toString displays the details of the item for the customer.
   *
   * @return The name and cost.
   */
   public String toString() {
   
      return name + ": $" + calculateCost();
   }
}