import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Class CookieTest tests parent class BakedItem as well as class Cookie to
* method, statement, and condition coverage.
*
* Project 9
* @author Aidan Kiser - COMP1210 - 001
* @version 3 November 2022
*/
public class CookieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * testGetName tests if the getName method works.
   */
   @Test public void testGetName() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      
      Assert.assertEquals("", "Chips Delight", c.getName());
   }
   
   /**
   * testSetName tests if the setName method works.
   */
   @Test public void testSetName() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      
      Assert.assertEquals("", "Chips Delight", c.getName());
      
      c.setName("Pikachu");
      
      Assert.assertEquals("", "Pikachu", c.getName());
   }
   
   /**
   * testGetFlavor tests if the getFlavor method works.
   */
   @Test public void testGetFlavor() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      
      Assert.assertEquals("", "Chocolate Chip", c.getFlavor());
   }
   
   /**
   * testSetFlavor tests if the setFlavor method works.
   */
   @Test public void testSetFlavor() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      
      Assert.assertEquals("", "Chocolate Chip", c.getFlavor());
      
      c.setFlavor("Pikachu");
      
      Assert.assertEquals("", "Pikachu", c.getFlavor());
   }
   
   /**
   * testGetQuantity tests if the getQuantity method works.
   */
   @Test public void testGetQuantity() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      
      Assert.assertEquals("", 12, c.getQuantity());
   }
   
   /**
   * testSetQuantity tests if the setQuantity method works.
   */
   @Test public void testSetQuantity() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 1, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      
      Assert.assertTrue("", 1 == c.getQuantity());
      
      c.setQuantity(12);
      
      Assert.assertTrue("", 12 == c.getQuantity());
   }
   
   /**
   * testGetIngredients tests if the getIngredients method works.
   */
   @Test public void testGetIngredients() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      
      String ingredient = c.getIngredients()[0];
      
      Assert.assertEquals("", "flour", ingredient);
   }
   
   /**
   * testSetIngredients tests if the setIngredients method works.
   */
   @Test public void testSetIngredients() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour");
      
      String[] ingredientsIn = {"butter", "baking soda", "salt",
         "cream filling", "baking powder", "mint", "peanut butter", 
         "vanilla extract"};
      
      c.setIngredients(ingredientsIn);
      
      Assert.assertEquals("", "cream filling", c.getIngredients()[3]);
   }
   
   /**
   * testGetCount tests if the getCount method works.
   */
   @Test public void testGetCount() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
      
      Assert.assertEquals("", 15, c.getCount());
   }
   
   /**
   * testResetCount tests if the resetCount method works.
   */
   @Test public void resetResetCount() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                        "flour", "sugar", "dark chocolate chips", 
                        "butter", "baking soda", "salt");
                       
      BakedItem.resetCount();                                            
      
      Assert.assertEquals("", 0, c.getCount());
   }
   
   /**
   * testToString1 tests if the toString method works.
   */
   @Test public void testToString1() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      
      boolean output1 = c.toString().contains("baking soda");
      boolean output2 = c.toString().contains("salt");
      
      Assert.assertTrue("", output1 && output2);
   }
   
   /**
   * testToString2 tests if the toString method works.
   */
   @Test public void testToString2() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "butter", 
         "baking soda", "salt", "cream filling", "baking powder");
      
      boolean output1 = c.toString().contains("baking soda");
      boolean output2 = c.toString().contains("salt");
      
      Assert.assertTrue("", output1 && output2);
   }
   
   /**
   * testToString3 tests if the toString method works.
   */
   @Test public void testToString3() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "butter", 
         "baking soda", "salt", "cream filling");
      
      boolean output1 = c.toString().contains("baking soda");
      boolean output2 = c.toString().contains("salt");
      
      Assert.assertTrue("", output1 && output2);
   }
   
   /**
   * testPrice tests if the price method works.
   */
   @Test public void testPrice() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,
            "flour", "sugar", "dark chocolate chips",
            "butter", "baking soda", "salt");
      
      Assert.assertEquals("", 4.199, c.price(), .001);
   }
}
