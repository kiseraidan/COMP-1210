import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Class CakeTest tests parent class Cake to method, statement, and condition
* coverage.
*
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 11 November 2022
*/
public class CakeTest {

   // test objects
   private Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
                        "flour", "sugar", "cocoa powder", "vanilla", "eggs",
                        "butter", "baking soda", "baking powder", "salt");
  
   private Cake c2 = new Cake("2-Layer", "Red Velvet", 1, 2,
                        "flour", "sugar", "cocoa powder", "food coloring",
                        "eggs", "butter", "baking soda", "baking powder",
                        "salt");

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * testGetLayers tests if the getLayers method works.
   */
   @Test public void testGetLayers() {
      
      int output1 = c1.getLayers();
      Assert.assertEquals("", 1, output1);
      
      int output2 = c2.getLayers();
      Assert.assertFalse("", 0 == output2);
   }
   
   /**
   * testSetLayers tests if the setLayers method works.
   */
   @Test public void testSetLayers() {
      
      c1.setLayers(4);
      int output1 = c1.getLayers();
      Assert.assertEquals("", 4, output1);
      
      c2.setLayers(1);
      int output2 = c1.getLayers();
      Assert.assertFalse("", 0 == output2);
   }
   
   /**
   * testPrice tests if the price method works.
   */
   @Test public void testPrice() {
      
      Assert.assertEquals("", 8, c1.price(), .001);
      Assert.assertFalse("", 12 == c2.price());
   }
}
