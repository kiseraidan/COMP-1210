import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Class PieTest tests class Pie to method, statement, and condition
* coverage.
*
* Project 9
* @author Aidan Kiser - COMP1210 - 001
* @version 3 November 2022
*/
public class PieTest {

   // test objects
   private Pie p1 = new Pie("Weekly Special", "Apple", 1, 0,
                     "flour", "sugar", "apples", "cinnamon",
                     "butter", "baking soda", "salt");
   
   private Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2.0,
                     "flour", "sugar", "lime juice", "lemon juice",
                     "graham crackers", "butter", "baking soda", "salt");

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * testGetCrustCost tests if the getCrustCost method works.
   */
   @Test public void testGetCrustCost() {
      
      double output1 = p1.getCrustCost();
      Assert.assertEquals("", 0.0, output1, .001);
      
      double output2 = p2.getCrustCost();
      Assert.assertFalse("", 0.0 == output2);
   }
   
   /**
   * testSetCrustCost tests if the setCrustCost method works.
   */
   @Test public void testSetCrustCost() {
      
      p1.setCrustCost(2);
      
      double output = p1.getCrustCost();
      
      Assert.assertEquals("", 2.0, output, .001);
   }
   
   /**
   * testPrice tests if the price method works.
   */
   @Test public void priceTest() {
      
      Assert.assertEquals("", 12, p1.price(), .001);
      Assert.assertFalse("", 12 == p2.price());
   }
}
