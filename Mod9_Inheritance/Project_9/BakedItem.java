import java.text.DecimalFormat;

/**
* Class BakedItem is an abstract class that stores BakedItem data and provides
* methods to access the data. Class BakedItem serves as a parent class of
* several children classes: Cookie, Pie, Cake, and WeddingCake.
* 
* Project 9
* @author Aidan Kiser - COMP1210 - 001
* @version 3 November 2022
*/
public abstract class BakedItem {

   // fields
   protected String name;
   protected String flavor;
   protected int quantity;
   protected String[] ingredients;
   protected static int count = 0;
   
   /**
   * Constructor accepts four parameters: a parameter of type String 
   * representing the name of the baked item, a parameter of type String
   * representing the flavor of the baked item, a parameter of type int
   * representing the quantity of baked items, and a parameter of type String[]
   * representing the array of ingredients in the baked item. These parameters
   * are used to assign the fields described above.
   *
   * @param nameIn The name of the baked item.
   * @param flavorIn The flavor of the baked item.
   * @param quantityIn The quantity of baked items.
   * @param ingredientsIn The array of ingredients in the baked item.
   */
   public BakedItem(String nameIn, String flavorIn, int quantityIn, 
      String... ingredientsIn) {
      
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      
      count++;
   }
   
   /**
   * getName accepts no parameters and gets a String representing the name of
   * the baked item. 
   *
   * @return The name of the baked item.
   */
   public String getName() {
   
      return name;
   }
   
   /**
   * setName accepts a String representing the name, sets the field, and
   * returns nothing. 
   *
   * @param nameIn The inputed name of the baked item.
   */
   public void setName(String nameIn) {
   
      name = nameIn;
   }
   
   /**
   * getFlavor accepts no parameters and gets a String representing the flavor.
   *
   * @return The flavor of the baked item.
   */
   public String getFlavor() {
   
      return flavor;
   }
   
   /**
   * setFlavor accepts a String representing the flavor, sets the field, and
   * returns nothing.
   *
   * @param flavorIn The inputed flavor of the baked item.
   */
   public void setFlavor(String flavorIn) {
   
      flavor = flavorIn;
   }
   
   /**
   * getQuantity accepts no parameters and gets a int representing quantity.
   *
   * @return The quantity of baked items.
   */
   public int getQuantity() {
   
      return quantity;
   }
   
   /**
   * setQuantity accepts an int representing the quantity, sets the field, and
   * returns nothing.
   *
   * @param quantityIn The inputed quantity of baked items.
   */
   public void setQuantity(int quantityIn) {
   
      quantity = quantityIn;
   }
   
   /**
   * getIngredients accepts no parameters and gets a String[] representing
   * ingredients of the baked item.
   *
   * @return The the ingredients of the baked item.
   */
   public String[] getIngredients() {
   
      return ingredients;
   }
   
   /**
   * setIngredients accepts a variable length parameter representing the
   * ingredients of the baked item, sets the field, and returns nothing.
   *
   * @param ingredientsIn The inputed ingredients of the baked item.
   */
   public void setIngredients(String... ingredientsIn) {
   
      ingredients = ingredientsIn;
   }
   
   /**
   * getCount accepts no parameters and gets an int representing the count.
   *
   * @return The current count.
   */
   public static int getCount() {
   
      return count;
   }
   
   /**
   * resetCount accepts no parameters, resets count to zero, and returns
   * nothing.
   */
   public static void resetCount() {
   
      count = 0;
   }
   
   /**
   * toString outputs a String displaying several specific details the
   * BakedItem object that were gotten from the methods above. A for loop
   * is utilized to make it so that a maximum of five ingredients would 
   * only be printed on a single line.
   *
   * @return The String display of several specific details of the BakedItem
   * object.
   */
   public final String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = "";
      String ingredientsFor = "";
      int i = 0;
      
      for (String bakedItem : ingredients) {
      
         if (i == 0) {
         
            ingredientsFor += bakedItem;
         }
         
         else if (i % 5 != 0) {
         
            ingredientsFor += ", " + bakedItem;
         }
         
         else {
         
            ingredientsFor += ", \n" + bakedItem;
         }
         
         i++;
      }
      
      output = this.getClass().toString().substring(6) + ": " + name + " - "
            + flavor + "   Quantity: " + quantity + "   Price: " 
            + df.format(price()) + "\n" + "(Ingredients: " + ingredientsFor 
            + ")";
      
      return output;
   }
   
   /**
   * price accepts no parameters and returns a double representing the price
   * for a BakedItem. Since this is an abstract method, it has no body in class
   * BakedItem, but will have a body in child classes.
   *
   * @return The price of the baked item.
   */
   public abstract double price();
}