import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Class WeddingCakeTest tests class WeddingCake to method, statement, and 
* condition coverage.
*
* Project 9
* @author Aidan Kiser - COMP1210 - 001
* @version 3 November 2022
*/
public class WeddingCakeTest {

   // test objects
   private WeddingCake c1 = new WeddingCake("3-Layer/1-Tier", "Red Velvet", 1, 
                           3, 1, "flour", "sugar", "buttermilk", "coffee", 
                           "eggs", "butter", "baking soda", "baking powder", 
                           "salt");
                           
   private WeddingCake c2 = new WeddingCake("3-Layer/2-Tier", "Chocolate", 1, 
                           3, 2, "flour", "sugar", "buttermilk", "coffee", 
                           "eggs", "butter", "baking soda", "baking powder", 
                           "salt");
                           
   private WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 
                           3, 3, "flour", "sugar", "buttermilk", "coffee", 
                           "eggs", "butter", "baking soda", "baking powder", 
                           "salt");

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * testGetTiers tests if the getTiers method works.
   */
   @Test public void testGetTiers() {
      
      int output1 = c1.getTiers();
      Assert.assertEquals("", 1, output1);
      
      int output2 = c2.getTiers();
      Assert.assertFalse("", 0 == output2);
      
      int output3 = c3.getTiers();
      Assert.assertTrue("", 3 == output3);
   }
   
   /**
   * testSetTiers tests if the setTiers method works.
   */
   @Test public void testSetTiers() {
      
      WeddingCake c4 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
                          "flour", "sugar", "buttermilk", "coffee",
                          "eggs", "butter", "baking soda", "baking powder",
                          "salt");
      c4.setTiers(10);
      
      Assert.assertEquals(10, c4.getTiers());
   }
   
   /**
   * testPrice tests if the price method works.
   */
   @Test public void priceTest() {
      
      Assert.assertEquals("", 45, c1.price(), .001);
      Assert.assertFalse("", 12 == c2.price());
      Assert.assertTrue("", 135 == c3.price());
   }
}
