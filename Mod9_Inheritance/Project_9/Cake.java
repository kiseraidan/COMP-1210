/**
* Class Cake stores baked item data and provides methods to access the data.
* Class Cake serves as a child class of class BakedItem.
*
* Project 9
* @author Aidan Kiser - COMP1210 - 001
* @version 3 November 2022
*/
public class Cake extends BakedItem {

   // fields
   protected int layers;
   /**
   * static final double base rate used for the price method.
   */
   public static final double BASE_RATE = 8; 

   /**
   * Constructor accepts five parameters: a parameter of type String 
   * representing the name of the cake, a parameter of type String
   * representing the flavor of the cake, a parameter of type int
   * representing the quantity of cakes, a parameter of type
   * int representing the layers of the cake, and a parameter of type String[]
   * representing the array of ingredients of the cake These parameters are
   * used to assign the fields described above. Constructor derives from super
   * class.
   *
   * @param nameIn The name of the cake.
   * @param flavorIn The flavor of the cake.
   * @param quantityIn The quantity of cake.
   * @param layersIn The layers of the cake.
   * @param ingredientsIn The array of ingredients in the cake.
   */
   public Cake(String nameIn, String flavorIn, int quantityIn, 
      int layersIn, String... ingredientsIn) {
      
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;
      
      /* Examples of how the constructor could be used to create a Cookie 
      object:
      
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
                     "flour", "sugar", "cocoa powder", "vanilla", "eggs",
                     "butter", "baking soda", "baking powder", "salt");
   
      Cake c2 = new Cake("2-Layer", "Red Velvet", 1, 2,
                     "flour", "sugar", "cocoa powder", "food coloring", 
                     "eggs", "butter", "baking soda", "baking powder", 
                     "salt");
   
      */
   }
   
   /**
   * getLayers accepts no parameters and gets an int representing layers.
   *
   * @return The layers of the cake.
   */
   public int getLayers() {
   
      return layers;
   }
   
   /**
   * setLayers accepts an int representing layers, sets the field, and returns
   * nothing.
   *
   * @param layersIn The inputed layers of the cake.
   */
   public void setLayers(int layersIn) {
   
      layers = layersIn;
   }
   
   /**
   * price accepts no parameters and returns a double representing the price
   * for a the cake.
   *
   * @return The price of the cake.
   */
   public double price() {
   
      return (BASE_RATE * layers) * quantity;
   }
   
   /* toString method exists for this class, but is unneccessary because it is
    inherited from class BakedItem. */
}