import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Class RingTorusTest tests class RingTorus to condition coverage.
*
* Project 8
* @author Aidan Kiser - COMP1210 - 001
* @version 27 October 2022
*/
public class RingTorusTest {

   /** Fixture initialization (common initialization
   *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * labelTest tests if the getLabel and setLabel work.
   */
   @Test public void labelTest() {
      
      RingTorus rito1 = new RingTorus("ex1", 1, 1);
      rito1.setLabel("Small Example");
      
      Assert.assertEquals("Small Example", rito1.getLabel());
      Assert.assertEquals(false, rito1.setLabel(null));
   }
   
   /** 
   * largeRadiusTest tests if the getLargeRadius and setLargeRadius work.
   */
   @Test public void largeRadiusTest() {
   
      RingTorus rito2 = new RingTorus("ex2", 2, 1);
      
      rito2.setLargeRadius(2);
      
      Assert.assertEquals(2.0, rito2.getLargeRadius(), 0.0001);
      Assert.assertEquals(false, rito2.setLargeRadius(-100));
   }
   
   /**
   * smallRadiusTest tests if the getSmallRadius and setSmallRadius work.
   */
   @Test public void smallRadiusTest() {
   
      RingTorus rito3 = new RingTorus("ex3", 2, 1);
      rito3.setSmallRadius(1);
      
      Assert.assertEquals(1, rito3.getSmallRadius(), 0.0001);
      Assert.assertEquals(false, rito3.setSmallRadius(-100));
   }
   
   /** 
   * diameterTest tests if the diameter method works.
   */
   @Test public void diameterTest() {
   
      RingTorus rito = new RingTorus("ex1", 2, 1);
      
      Assert.assertEquals(6, rito.diameter(), 0.0001);
   }
   
   /** 
   * sufaceAreaTest tests if the surfaceArea method works.
   */
   @Test public void surfaceAreaTest() {
   
      RingTorus rito = new RingTorus("ex1", 9.5, 1.25);
      
      Assert.assertEquals(468.806, rito.surfaceArea(), 0.001);
   }
   
   /** 
   * volumeTest tests if the volume method works.
   */
   @Test public void volumeTest() {
   
      RingTorus rito = new RingTorus("ex1", 9.5, 1.25);
      
      Assert.assertEquals(293.004, rito.volume(), 0.001);
   }
   
   /** 
   * toStringTest tests if the toString method works.
   */
   @Test public void toStringTest() {
   
      RingTorus rito = new RingTorus("ex1", 1, 1);
      
      Assert.assertTrue(rito.toString().contains("\"ex1\""));
   }
   
   /** 
   * countTest tests if the getCount and resetCount methods work as intended.
   */
   @Test public void countTest() {
   
      RingTorus rito = new RingTorus("ex1", 1, 1);
      rito.resetCount();
      
      Assert.assertEquals(0, rito.getCount(), 0.0001);
   }
   
   /** 
   * equalsTest tests if the equals method works.
   */
   @Test public void equalsTest() {
   
      RingTorus rt1 = new RingTorus("Ex", 2, 1);
      RingTorus rt2 = new RingTorus("ex", 3, 2);
      RingTorus rt3 = new RingTorus("stinky", 2, 1);
      RingTorus rt4 = new RingTorus("Ex", 2, 1);
      RingTorus rt5 = new RingTorus("Ex", 2, 2);
      
      Assert.assertEquals(false, rt1.equals(rt2));
      Assert.assertEquals(false, rt1.equals(rt3));
      Assert.assertEquals(true, rt1.equals(rt4));
      Assert.assertEquals(false, rt1.equals(rt5));
      Assert.assertEquals(false, rt1.equals("Ex"));
      
      
   }
   
   /** 
   * hashCodeTest tests if the hashCode method works.
   */
   @Test public void hashCodeTest() {
   
      RingTorus rito = new RingTorus("ex1", 1, 1);
      
      Assert.assertEquals(0, rito.hashCode(), 0.0001);
   }
   
   /**
   * compareToTest1 will test whether compareTo works when values are negative.
   */   
   @Test public void compareToTest1() {
   
      RingTorus rito = new RingTorus("ex1", 2, 1);
      RingTorus rito2 = new RingTorus("ex2", 100, 80);
      
      Assert.assertEquals(-1, rito.compareTo(rito2));
   }
   
   /**
   * compareToTest2 will test whether compareTo works when values are positive.
   */   
   @Test public void compareToTest2() {
   
      RingTorus rito = new RingTorus("ex1", 100, 80);
      RingTorus rito2 = new RingTorus("ex2", 2, 1);
      
      Assert.assertEquals(1, rito.compareTo(rito2));
   }
   
   /**
   * compareToTest3 will test whether compareTo works when values are equal.
   */   
   @Test public void compareToTest3() {
   
      RingTorus rito = new RingTorus("ex1", 2, 1);
      RingTorus rito2 = new RingTorus("ex2", 2, 1);
      
      Assert.assertEquals(0, rito.compareTo(rito2));
   }
}
