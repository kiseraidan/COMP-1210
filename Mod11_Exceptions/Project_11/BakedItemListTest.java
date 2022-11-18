import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
* Class BakedItemListTest tests class BakedItemList to method, statement, and
* condition coverage.
* 
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 17 November 2022
*/
public class BakedItemListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   * testGetSetListName tests if the getName and setName methods work.
   */
   @Test public void testGetSetListName() {
      
      BakedItemList bList = new BakedItemList();
      
      Assert.assertEquals("", bList.getListName());
      
      bList.setListName("Hi");
      Assert.assertEquals("Hi", bList.getListName());
   }
   
   /**
   * testGetSetItemList tests if the getItemList and setItemList methods work.
   */
   @Test public void testGetSetItemList() {
     
      BakedItemList bList = new BakedItemList();
      BakedItem[] itemList = {null};
      
      Assert.assertEquals(itemList[0], bList.getItemList()[0]);
      String[] ingredientsIn = {"Hey"};
      
      Cookie c = new Cookie("cookie", "flavor", 3, ingredientsIn);
      
      BakedItem[] itemList1 = {c};
      bList.setItemList(itemList1);
      Assert.assertEquals(c, bList.getItemList()[0]);
   }
   
   /** 
   * testGetSetItemCount tests if the getItemCount and setItemCount methods
   * work.
   */
   @Test public void testGetSetItemCount() {
      
      BakedItemList bList = new BakedItemList();
      
      Assert.assertEquals(0, bList.getItemCount());
      
      bList.setItemCount(1);
      Assert.assertEquals(1, bList.getItemCount());
   }
   
   /**
   * testGetSetExcludedRecords tests if the getExcludedRecords and
   * setExcludedRecords methods work.
   */
   @Test public void testGetSetExcludedRecords() {
      
      BakedItemList bList = new BakedItemList();
      String[] eRecords = new String[0];
      Assert.assertEquals(null, bList.getExcludedRecords()[0]);
      
      String[] eRecords1 = {"Yo"};
      bList.setExcludedRecords(eRecords1);
      Assert.assertEquals(eRecords1[0], bList.getExcludedRecords()[0]);
   }
   
   /**
   * testGetSetExcludedCount tests if the getExcludedCount and setExcludedCount
   * methods work.
   */
   @Test public void testGetSetExcludedCount() {
      
      BakedItemList bList = new BakedItemList();
      Assert.assertEquals(0, bList.getExcludedCount());
      
      bList.setExcludedCount(1);
      Assert.assertEquals(1, bList.getExcludedCount());
   }
   
   /**
   * testListCount tests if the getListCount and resetListCount methods work.
   */
   @Test public void testListCount() {
      
      BakedItemList.resetListCount();
      BakedItemList blist = new BakedItemList();
      
      Assert.assertEquals(1, BakedItemList.getListCount());
   }
   
    /** 
    * testReadItemFile tests if the readItemFile method works.
    * 
    * @throws IOException throws an exception if no file found.
    */
   @Test public void testReadItemFile() throws IOException {
      
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      
      Assert.assertEquals("Auburn's Best Bakery", bList.getListName());
   }
   
    /** 
    * testGenerateReportTest tests if the generateReport method works.
    * 
    * @throws IOException throws an exception if no file found.
    */
   @Test public void testGenerateReport() throws IOException {
      
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      
      String result = "\n---------------------------------------\n"
         + "Report for Auburn's Best Bakery"
         + "\n---------------------------------------\n"
         + "\n" 
         + "Cookie: Chips Delight - Chocolate Chip   "
         + "Quantity: 12   Price: $4.20\n"
         + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
         + " soda, \n"
         + "salt)\n"
         + "\n" 
         + "Pie: Weekly Special - Apple   Quantity: 1   "
         + "Price: $12.00\n"
         + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
         + "baking soda, salt)\n"
         + "\n" 
         + "Pie: Summer Special - Key Lime   Quantity: 1"
         + "   Price: $14.00\n"
         + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
         + "crackers, \n"
         + "butter, baking soda, salt)\n"
         + "\n" 
         + "Cake: Birthday - Chocolate   Quantity: 1   "
         + "Price: $8.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n" 
         + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
         + "Price: $16.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
         + "\nbutter, baking soda, baking powder, salt)\n"
         + "\n" 
         + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
         + "Quantity: 1   Price: $135.00\n"
         + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n";
      
      Assert.assertEquals(result, bList.generateReport());
   }
   
    /** 
    * testGenerateReportByClass tests if the generateReportByClass method
    * works.
    * 
    * @throws IOException throws an exception if no file found.
    */
   @Test public void testGenerateReportByClass() throws IOException {
      
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      
      String result = "\n---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Class)"
         + "\n---------------------------------------\n"
         + "\n"
         + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
         + "Price: $16.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
         + "\nbutter, baking soda, baking powder, salt)\n"
         + "\n"
         + "Cake: Birthday - Chocolate   Quantity: 1   "
         + "Price: $8.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n"
         + "Cookie: Chips Delight - Chocolate Chip   "
         + "Quantity: 12   Price: $4.20\n"
         + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
         + " soda, \n"
         + "salt)\n"
         + "\n"
         + "Pie: Summer Special - Key Lime   Quantity: 1"
         + "   Price: $14.00\n"
         + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
         + "crackers, \n"
         + "butter, baking soda, salt)\n"
         + "\n"
         + "Pie: Weekly Special - Apple   Quantity: 1   "
         + "Price: $12.00\n"
         + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
         + "baking soda, salt)\n"
         + "\n"
         + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
         + "Quantity: 1   Price: $135.00\n"
         + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n";
      
      Assert.assertEquals(result, bList.generateReportByClass());
   }
   
    /** 
    * testGenerateReportByPrice tests if the generateReportByPrice method
    * works.
    * 
    * @throws IOException throws an exception if no file found.
    */
   @Test public void testGenerateReportByPrice() throws IOException {
      
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      
      String result = "\n---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Price)"
         + "\n---------------------------------------\n"
         + "\n"
         + "Cookie: Chips Delight - Chocolate Chip   "
         + "Quantity: 12   Price: $4.20\n"
         + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
         + " soda, \n"
         + "salt)\n"
         + "\n"
         + "Cake: Birthday - Chocolate   Quantity: 1   "
         + "Price: $8.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n"
         + "Pie: Weekly Special - Apple   Quantity: 1   "
         + "Price: $12.00\n"
         + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
         + "baking soda, salt)\n"
         + "\n"
         + "Pie: Summer Special - Key Lime   "
         + "Quantity: 1   Price: $14.00\n"
         + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
         + "crackers, \n"
         + "butter, baking soda, salt)\n"
         + "\n"
         + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
         + "Price: $16.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
         + "\nbutter, baking soda, baking powder, salt)\n"
         + "\n"
         + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
         + "Quantity: 1   Price: $135.00\n"
         + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n";
      
      Assert.assertEquals(result, bList.generateReportByPrice());
   }
   
    /** 
    * testGenerateReportByFlavor tests if the generateReportByFlavor method
    * works.
    * 
    * @throws IOException throws an exception if no file found.
    */
   @Test public void testGenerateReportByFlavor() throws IOException {
      
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      
      String result = "\n---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Flavor)"
         + "\n---------------------------------------\n"
         + "\n"
         + "Pie: Weekly Special - Apple   Quantity: 1   "
         + "Price: $12.00\n"
         + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
         + "baking soda, salt)\n"
         + "\n"
         + "Cake: Birthday - Chocolate   "
         + "Quantity: 1   Price: $8.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n"
         + "Cookie: Chips Delight - Chocolate Chip   "
         + "Quantity: 12   Price: $4.20\n"
         + "(Ingredients: flour, sugar, dark chocolate chips, butter, "
         + "baking soda, \n"
         + "salt)\n"
         + "\n" 
         + "Pie: Summer Special - Key Lime   Quantity: 1"
         + "   Price: $14.00\n"
         + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
         + "crackers, \n"
         + "butter, baking soda, salt)\n"
         + "\n"
         + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
         + "Price: $16.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
         + "\nbutter, baking soda, baking powder, salt)\n"
         + "\n"
         + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
         + "Quantity: 1   Price: $135.00\n"
         + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n";
      
      Assert.assertEquals(result, bList.generateReportByFlavor());
   }
   
    /** 
    * testGenerateExcludedRecordsReport tests if the
    * generateExcludedRecordsReport method works.
    * 
    * @throws IOException throws an exception if no file found.
    */
   @Test public void testGenerateExcludedRecordsReport() throws IOException {
      
      String naturalOrderTest = "Cookie: Chips Delight" 
         + " - Chocolate Chip   Quantity: 12   Price: $4.20";   
      String byClassTest = "Cake: 2-Layer - Red Velvet" 
         + "   Quantity: 1   Price: $16.00";           
      String byPriceTest = "Cookie: Chips Delight - Chocolate Chip" 
         + "   Quantity: 12   Price: $4.20";
      String byFlavorTest = "Pie: Weekly Special - Apple"
         + "   Quantity: 1   Price: $12.00";
      String excludedTest = "category ***";
      
      BakedItemList testList = new BakedItemList();
      testList.readItemFile("baked_item_data.csv");
      
      String naturalOrderTestReport = testList.generateReport().toString();
      String byClassTestReport = testList.generateReportByClass().toString();
      String byPriceTestReport = testList.generateReportByPrice().toString();
      String byFlavorTestReport = testList.generateReportByFlavor().toString();
      String excludedTestReport = 
         testList.generateExcludedRecordsReport().toString();
      Assert.assertEquals("natural order test", true,
         naturalOrderTestReport.contains(naturalOrderTest));
      Assert.assertEquals("by class test", true,
         byClassTestReport.contains(byClassTest));
      Assert.assertEquals("by price test", true,
         byPriceTestReport.contains(byPriceTest));
      Assert.assertEquals("by flavor test", true,
         byFlavorTestReport.contains(byFlavorTest));
      Assert.assertEquals("excluded report test", true,
         excludedTestReport.contains(excludedTest));
   }
}
