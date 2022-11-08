/**
* Class ItemsList creates the array of inventory items, has a method for adding
* an item, calculates the cost, and displays the necessary details regarding
* the inventory list. ItemsList is a parent class of several child classes.
* 
* Activity 10
* @author Aidan Kiser - COMP1210 - 001
* @version 8 November 2022
*/
public class ItemsList {

   // fields
   private InventoryItem[] inventory;
   private int count;
   
   /**
   * Constructor accepts zero parameters. Creates the inventory list and sets
   * the count.
   */
   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
   * addItem accepts an InventoryItem object, sets the field, and returns
   * nothing.
   *
   * @param itemIn The item into the inventory.
   */
   public void addItem(InventoryItem itemIn) {
   
      inventory[count] = itemIn;
      
      count++;
   }
   
   /**
   * calculateTotal accepts a parameter of type double, calculates the total,
   * then returns the total.
   *
   * @param electronicsSurcharge The surcharge for electronic item.
   * @return The total calculated cost.
   */
   public double calculateTotal(double electronicsSurcharge) {
   
      double total = 0.0;
      
      for (int i = 0; i < count; i++) {
         
         if (inventory[i] instanceof ElectronicsItem) {
         
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         
         else {
         
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
   
   /**
   * toString outputs a String displaying various details of the inventory
   * item.
   *
   * @return The String display of various details regarding the inventory
   * item. 
   */
   public String toString() {
   
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
      
         output += inventory[i] + "\n";
      }
      
      return output;
   }
}