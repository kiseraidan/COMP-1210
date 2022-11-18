/**
* Class Cookie stores baked item data and provides methods to access the data.
* Class Cookie serves as a child class of class BakedItem.
*
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 17 November 2022
*/
public class Cookie extends BakedItem {

   /**
   * static final double base rate used for the price method.
   */
   public static final double BASE_RATE = 0.35;
   
   /**
   * Constructor accepts four parameters: a parameter of type String 
   * representing the name of the cookie, a parameter of type String
   * representing the flavor of the cookie, a parameter of type int
   * representing the quantity of cookies, and a parameter of type String[]
   * representing the array of ingredients of the cookie. These parameters are
   * used to assign the fields described above. Constructor derives from super
   * class.
   *
   * @param nameIn The name of the cookie.
   * @param flavorIn The flavor of the cookie.
   * @param quantityIn The quantity of cookie.
   * @param ingredientsIn The array of ingredients in the cookie.
   */
   public Cookie(String nameIn, String flavorIn, int quantityIn, 
      String... ingredientsIn) {
      
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      
      /* Example of how the constructor could be used to create a Cookie object:
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      */
   }
   
   /**
   * price accepts no parameters and returns a double representing the price
   * for a the cookie.
   *
   * @return The price of the cookie.
   */
   public double price() {
   
      return BASE_RATE * quantity;
   }
   
   /* toString method exists for this class, but is unneccessary because it is
    inherited from class BakedItem. */
}