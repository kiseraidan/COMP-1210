/**
* Class Pie stores baked item data and provides methods to access the data.
* Class Pie serves as a child class of class BakedItem.
*
* Project 9
* @author Aidan Kiser - COMP1210 - 001
* @version 3 November 2022
*/
public class Pie extends BakedItem {

   // fields
   private double crustCost;
   /**
   * static final double base rate used for the price method.
   */
   public static final double BASE_RATE = 12.0; 

   /**
   * Constructor accepts five parameters: a parameter of type String 
   * representing the name of the pie, a parameter of type String
   * representing the flavor of the pie, a parameter of type int
   * representing the quantity of pies, a parameter of type
   * double representing the crust cost, and a parameter of type String[]
   * representing the array of ingredients of the pie These parameters are used
   * to assign the fields described above. Constructor derives from super
   * class.
   *
   * @param nameIn The name of the pie.
   * @param flavorIn The flavor of the pie.
   * @param quantityIn The quantity of pie.
   * @param crustCostIn The crust cost of the pie.
   * @param ingredientsIn The array of ingredients in the pie.
   */
   public Pie(String nameIn, String flavorIn, int quantityIn, 
      double crustCostIn, String... ingredientsIn) {
      
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
      
      /* Examples of how the constructor could be used to create a Cookie 
      object:
      
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0,
                        "flour", "sugar", "apples", "cinnamon",
                        "butter", "baking soda", "salt");
   
      Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2.0,
                        "flour", "sugar", "lime juice", "lemon juice",
                        "graham crackers", "butter", "baking soda", "salt");
   
      */
   }
   
   /**
   * getCrustCost accepts no parameters and gets a double representing crust
   * cost. 
   *
   * @return The crust cost of the pie.
   */
   public double getCrustCost() {
   
      return crustCost;
   }
   
   /**
   * setCrustCost accepts double for crust cost, sets the field, and returns
   * nothing.
   *
   * @param crustCostIn The inputed crust cost of the pie.
   */
   public void setCrustCost(double crustCostIn) {
   
      crustCost = crustCostIn;
   }
   
   /**
   * price accepts no parameters and returns a double representing the price
   * for a the pie.
   *
   * @return The price of the pie.
   */
   public double price() {
   
      return (BASE_RATE + crustCost) * quantity;
   }
   
   /* toString method exists for this class, but is unneccessary because it is
    inherited from class BakedItem. */
}