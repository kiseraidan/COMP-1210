/**
* Class InventoryListApp serves as a driver class for parent ItemsList.
* 
* Activity 10
* @author Aidan Kiser - COMP1210 - 001
* @version 8 November 2022
*/
public class InventoryListApp {
   
   /**
   * Drive class main is used to direct the output and is manipulated by child
   * classes. Accepts a single parameter of type array, and returns nothing.
   *
   * @param args Not used.
   */
   public static void main(String[] args) {
      
      InventoryItem.setTaxRate(0.05);
      
      ItemsList myItems = new ItemsList();
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}