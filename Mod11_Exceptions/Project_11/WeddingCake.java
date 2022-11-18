/**
* Class WeddingCake stores baked item data and provides methods to access the
* data. Class WeddingCake serves as a child class of class Cake, and a
* grandchild class of BakedItem.
*
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 17 November 2022
*/
public class WeddingCake extends Cake {

   // fields
   private int tiers;
   /**
   * static final double base rate used for the price method.
   */
   public static final double BASE_RATE = 15.0;
   
   /**
   * Constructor accepts six parameters: a parameter of type String 
   * representing the name of the wedding cake, a parameter of type String
   * representing the flavor of the wedding cake, a parameter of type int
   * representing the quantity of wedding cakes, a parameter of type
   * int representing the layers of the wedding cake, a parameter of type int
   * representing the tiers of the wedding cake, and a parameter of type
   * String[] representing the array of ingredients of the wedding cake These
   * parameters are used to assign the fields described above. Constructor
   * derives from super class.
   *
   * @param nameIn The name of the wedding cake.
   * @param flavorIn The flavor of the wedding cake.
   * @param quantityIn The quantity of the wedding cakes.
   * @param layersIn The layers of the wedding cake.
   * @param tiersIn The tiers of the wedding cake.
   * @param ingredientsIn The array of ingredients in the wedding cake.
   */
   public WeddingCake(String nameIn, String flavorIn, int quantityIn, 
      int layersIn, int tiersIn, String... ingredientsIn) {
      
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;
      
      /* Example of how the constructor could be used to create a Cookie object:
      
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
                           "flour", "sugar", "buttermilk", "coffee",
                           "eggs", "butter", "baking soda", "baking powder", 
                           "salt");
   
      */
   }
   
   /**
   * getTiers accepts no parameters and returns an int representing tiers.
   *
   * @return The tiers of the wedding cake.
   */
   public int getTiers() {
   
      return tiers;
   }
   
   /**
   * setTiers accepts an int representing tiers, sets the field, and returns
   * nothing.
   *
   * @param tiersIn The inputed tiers of the wedding cake.
   */
   public void setTiers(int tiersIn) {
   
      tiers = tiersIn;
   }
   
   /**
   * price accepts no parameters and returns a double representing the price
   * for a the wedding cake.
   *
   * @return The price of the wedding cake.
   */
   public double price() {
   
      return (BASE_RATE * layers * tiers) * quantity;
   }
   
   /* toString method exists for this class, but is unneccessary because it is
    inherited from class BakedItem. */
}