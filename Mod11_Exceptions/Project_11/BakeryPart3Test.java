import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
* Class BakeryPart3Test tests class BakeryPart3 to method, statement, and
* condition coverage.
* 
* Project 10
* @author Aidan Kiser - COMP1210 - 001
* @version 10 November 2022
*/
public class BakeryPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


    /**
    * testZeroInput tests if there is no input.
    *
    * @throws IOException throws for args file reading.
    */
   @Test public void testZeroInput() throws IOException {
      
      BakeryPart3 test = new BakeryPart3();
      BakedItemList.resetListCount();
      String[] argsEmpty = { };
      BakeryPart3.main(argsEmpty);
      Assert.assertEquals("BakeryItemList equal to 0",
         0, BakedItemList.getListCount());  
   }
   
    /**
    * testInput tests if the test reads the file in the main method.
    *
    * @throws IOException throws for args file reading.
    */
   @Test public void inputTest() throws IOException {
      
      BakedItemList.resetListCount();
      String[] argsFile = {"baked_item_data2.csv"};
      BakeryPart3.main(argsFile);
      Assert.assertEquals("BakeryItemList equal to 1",
         1, BakedItemList.getListCount());  
   }
   
    /**
    * testInputInvalid tests if the method reads an invalid file.
    *
    * @throws Exception throws an exception if no file found.
    *
    */
   @Test public void testInputInvalid() throws Exception {
      
      BakeryPart3 e = new BakeryPart3();
      String[] args = {null};
      BakeryPart3.main(args);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
   
    /**
    * testInputNo tests if the file does not exist in the directory.
    *
    * @throws Exception throws an exception if no file found.
    */
   @Test public void testInputNo() throws Exception {
      
      BakeryPart3 e = new BakeryPart3();
      String[] args = {""};
      BakeryPart3.main(args);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
}
