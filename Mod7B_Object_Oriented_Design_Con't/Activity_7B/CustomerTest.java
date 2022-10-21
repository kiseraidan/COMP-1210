import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Class CustomerTest tests the various aspects of driver class Customer.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 18 October 2022
*/
public class CustomerTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**    
   * setLocationTest1 will test the first.
   * setLocation method
   */
   @Test public void setLocationTest1() {
      
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
   
   /**
   * setLocationTest2 will test the second.
   * setLocation method
   */  
   @Test public void setLocationTest2() {
      
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston", "MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
   
   /**
   * toStringTest will test the toString.
   * method
   */   
   @Test public void toStringTest() {
      
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
   
   /**
   * compareToTest1 will test whether.
   * compareTo works when values are equal
   */   
   @Test public void compareToTest1() {
      
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
      
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   
   /**
   * compareToTest2 will test whether.
   * compareTo works when first value is less than
   */   
   @Test public void compareToTest2() {
      
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
      
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == -1);
   }
   
   /**
   * compareToTest3 will test whether.
   * compareTo works when first value is greater than
   */   
   @Test public void compareToTest3() {
      
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
      
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 1);
   }
}
