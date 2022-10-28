import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Class RingTorusListTest tests class RingTorusList to method, statement, and
* condition coverage.
*
* Project 8
* @author Aidan Kiser - COMP1210 - 001
* @version 27 October 2022
*/ 
public class RingTorusListTest {

   private int size = 0;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * testGetName tests if the getName method works.
   */
   @Test public void testGetName() {
   
      RingTorus[] pupitar = new RingTorus[10];
      RingTorusList larvitar = new RingTorusList("Tyranitar", pupitar, 4);
      
      Assert.assertEquals(larvitar.getName(), "Tyranitar");
   }
   
   /**
   * testNumberOfRingToruses tests if the numberOfRingToruses method works.
   */
   @Test public void testNumberOfRingToruses() {
   
      RingTorus[] breloom = new RingTorus[10];
      RingTorusList shroomish = new RingTorusList("Dunsparce", breloom, 5);
      
      Assert.assertEquals(shroomish.numberOfRingToruses(), 5);
   }
   
   /**
   * testTotalDiameter tests if the totalDiameter method works.
   */
   @Test public void testTotalDiameter() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(445.98, ritoList.totalDiameter(), 0.01);
   }
   
   /**
   * testTotalDiameterIsZero tests if the totalDiameter method works if there
   * are zero objects in the list.
   */
   @Test public void testTotalDiameterIsZero() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 0);
      
      Assert.assertEquals(0, ritoList.totalDiameter(), 0.01);
   }
   
   /**
   * testTotalSurfaceArea tests if the totalSurfaceArea method works.
   */
   @Test public void testTotalSurfaceArea() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(186955.724, ritoList.totalSurfaceArea(), 0.001);
   }
   
   /**
   * testTotalSurfaceAreaIsZero tests if the totalSurfaceArea method works if 
   * there are zero objects in the list.
   */
   @Test public void testTotalSurfaceAreaIsZero() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 0);
      
      Assert.assertEquals(0, ritoList.totalSurfaceArea(), 0.001);
   }
   
   /**
   * testTotalVolume tests if the totalVolume method works.
   */
   @Test public void testTotalVolume() {
      
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(2868020.119, ritoList.totalVolume(), 0.001);
   }
   
   /**
   * testTotalVolumeIsZero tests if the totalVolume method works if there
   * are zero objects in the list.
   */
   @Test public void testTotalVolumeIsZero() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 0);
      
      Assert.assertEquals(0, ritoList.totalVolume(), 0.001);
   }
   
   /**
   * testAverageDiameter tests if the averageDiameter method works.
   */
   @Test public void testAverageDiameter() {
      
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(148.66, ritoList.averageDiameter(), 0.01);
   }
   
   /**
   * testAverageDiameterIsZero tests if the averageVolume method works if there
   * are zero objects in the list.
   */
   @Test public void testAverageDiameterIsZero() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 0);
      
      Assert.assertEquals(0, ritoList.averageDiameter(), 0.001);
   }
   
   /**
   * testAverageSurfaceArea tests if the averageSurfaceArea method works.
   */
   @Test public void testAverageSurfaceArea() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(62318.575, ritoList.averageSurfaceArea(), 0.001);
   }
   
   /**
   * testAverageSurfaceAreaIsZero tests if the averageSurfaceArea method works
   * if there are zero objects in the list.
   */
   @Test public void testAverageSurfaceAreaIsZero() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 0);
      
      Assert.assertEquals(0, ritoList.averageSurfaceArea(), 0.001);
   }
   
   /**
   * testAverageVolume tests if the averageVolume method works.
   */
   @Test public void testAverageVolume() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(956006.706, ritoList.averageVolume(), 0.001);
   }
   
   /**
   * testAverageVolumeIsZero tests if the averageVolume method works if there
   * are zero objects in the list.
   */
   @Test public void testAverageVolumeIsZero() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 0);
      
      Assert.assertEquals(0, ritoList.averageVolume(), 0.001);
   }
   
   /**
   * testToString tests if the toString method works.
   */
   @Test public void testToString() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals("----- Summary for Pikachu -----"
            + "\nNumber of RingToruses: 3" 
            + "\nTotal Diameter: 445.98 units"
            + "\nTotal Surface Area: 186,955.724 square units"
            + "\nTotal Volume: 2,868,020.119 cubic units"
            + "\nAverage Diameter: 148.66 units"
            + "\nAverage Surface Area: 62,318.575 square units"
            + "\nAverage Volume: 956,006.706 cubic units", ritoList.toString());
   }
   
   /**
   * testGetList tests if the getList method works.
   */
   @Test public void testGetList() {
   
   }
   
   /**
   * testFindRingTorus tests if the findRingTorus method works.
   */
   @Test public void testFindRingTorus() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(ex1, ritoList.findRingTorus("Small Example"));
      Assert.assertEquals(null, ritoList.findRingTorus("Ludicolo"));
   }
   
   /**
   * testDeleteRingTorus tests if the deleteRingTorus method works.
   */
   @Test public void testDeleteRingTorus() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(ex1, ritoList.deleteRingTorus("Small Example"));
      Assert.assertEquals(null, ritoList.deleteRingTorus("Ludicolo"));
   }
   
   /**
   * testEditRingTorus tests if the editRingTorus method works.
   */
   @Test public void testEditRingTorus() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(true, 
         ritoList.editRingTorus("Small Example", 9.5, 1.25));
      Assert.assertEquals(false, ritoList.editRingTorus("Ludicolo", 1.0, 2.0));
   }
   
   /**
   * testFindRingTorusWithLargestVolume tests if the 
   * findRingTorusWithLargestVolume method works.
   */
   @Test public void testFindRingTorusWithLargestVolume() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 3);
      
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      
      rito[0] = ex1;
      rito[1] = ex2;
      rito[2] = ex3;
      
      Assert.assertEquals(ex3, ritoList.findRingTorusWithLargestVolume());
   }
   
   /**
   * testFindRingTorusWithLargestVolumeIsNull tests if the 
   * testFindRingTorusWithLargestVolume method works if there are zero objects
   * in the list.
   */
   @Test public void testFindRingTorusWithLargestVolumeIsNull() {
   
      RingTorus[] rito = new RingTorus[3];
      RingTorusList ritoList = new RingTorusList("Pikachu", rito, 0);
      
      Assert.assertEquals(null, ritoList.findRingTorusWithLargestVolume());
   }
}
