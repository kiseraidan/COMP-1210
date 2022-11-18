import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Class PriceComparatorTest tests class PriceComparator to method, statement,
* and condition coverage.
* 
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 17 November 2022
*/
public class PriceComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

    /** 
    * testPriceIsEqual tests if the compare method works when the prices of
    * both objects are equal.
    */
   @Test public void testPriceIsEqual() {
      
      PriceComparator priceCompare = new PriceComparator();
      
      BakedItem b1 = new Cookie("Cookie", "Chocolate", 1, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      BakedItem b2 = new Cookie("Cookie", "Chocolate", 1, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      
      Assert.assertEquals(0, priceCompare.compare(b1, b2));
   }
   
    /** 
    * testPriceIsGreaterThan tests if method compare works when
    * b1.price() > b2.price().
    */
   @Test public void testPriceIsGreaterThan() {
      
      PriceComparator priceCompare = new PriceComparator();
      
      BakedItem b1 = new Cookie("Cookie", "Chocolate", 2, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      BakedItem b2 = new Cookie("Cookie", "Chocolate", 1, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      
      Assert.assertEquals(1, priceCompare.compare(b1, b2));
   }
  
    /** 
    * testPriceIsLessThan tests if the method compare works when
    * b1.price() < b2.price().
    */
   @Test public void testPriceIsLessThan() {
      
      PriceComparator priceCompare = new PriceComparator();
      
      BakedItem b1 = new Cookie("Cookie", "Chocolate", 1, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      BakedItem b2 = new Cookie("Cookie", "Chocolate", 2, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      
      Assert.assertEquals(-1, priceCompare.compare(b1, b2));
   }
}
