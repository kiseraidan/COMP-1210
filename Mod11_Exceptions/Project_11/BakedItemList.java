import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
   
/**
* Class BakedItemList provides specialized methods for reading in Baked Item
* data files and generating reports.
* 
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 17 November 2022
*/
public class BakedItemList {

   // fields
   private String listName; // name of the BakedItemList
   
   private BakedItem[] itemList = new BakedItem[100]; /* array of max 100
   BakedItem objects */
   
   private int itemCount; /* tracks the # of BakedItem objects in the itemList
   array */
   
   private String[] excludedRecords = new String[30]; /* array of max 30 String
   elements representing records that are read from the data file but not
   processed */
   
   private int excludedCount; /* tracks the # of records that have been added
   to the excludedRecords array */
   
   private static int listCount = 0; /* tracks the # of BakedItemList objects
   created */   
   
   /**
   * Constructor accepts no parameters and initializes the fields.
   */
   public BakedItemList() {
   
      listName = "";
      itemList = new BakedItem[100];
      itemCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      listCount++;
   }
   
   /**
   * getListName accepts no parameters and returns the String representing the
   * listName.
   *
   * @return The name of the BakedItemList.
   */
   public String getListName() {
   
      return listName;
   }
   
   /**
   * setListName accepts a String representing the name of the BakedItemList,
   * sets the field, and returns nothing.
   *
   * @param listNameIn The inputed name of the BakedItemList.
   */
   public void setListName(String listNameIn) {
   
      listName = listNameIn;
   }
   
   /**
   * getItemList accepts no parameters and returns the BakedItem array
   * representing the itemList.
   *
   * @return The BakedItem array representing the itemList.
   */
   public BakedItem[] getItemList() {
   
      return itemList;
   }
   
   /**
   * setItemList accepts a BakedItem array, sets the field, and returns
   * nothing.
   *
   * @param bakedItemListIn The inputed BakedItem array.
   */
   public void setItemList(BakedItem[] bakedItemListIn) {
   
      itemList = bakedItemListIn;
   }
   
   /**
   * getItemCount accepts no parameters and returns an int representing the
   * current value of itemCount.
   *
   * @return The current value of itemCount.
   */
   public int getItemCount() {
   
      return itemCount;
   }
   
   /**
   * setItemCount accepts an int representing the itemCount, sets the field, and
   * returns nothing.
   *
   * @param itemCountIn The current value of itemCount.
   */
   public void setItemCount(int itemCountIn) {
   
      itemCount = itemCountIn;
   }
   
   /**
   * getExcludedRecords accepts no parameters and returns the String array
   * representing the excludedRecords.
   *
   * @return The String array representing the excludedRecords.
   */
   public String[] getExcludedRecords() {
   
      return excludedRecords;
   }
   
   /**
   * setExcludedRecords accepts a String array representing the
   * excludedRecords, sets the field, and returns nothing.
   *
   * @param excludedRecordsIn The inputed excludedRecords array.
   */
   public void setExcludedRecords(String[] excludedRecordsIn) {
   
      excludedRecords = excludedRecordsIn;
   }
   
   /**
   * getExcludedCount accepts no parameters and returns the current value of
   * excludedCount.
   *
   * @return The current value of excludedCount.
   */
   public int getExcludedCount() {
   
      return excludedCount;
   }
   
   /**
   * setExcludedCount accepts an int representing the excludedCount, sets the
   * field, and returns nothing.
   *
   * @param excludedCountIn The currrent value of excludedCount.
   */
   public void setExcludedCount(int excludedCountIn) {
   
      excludedCount = excludedCountIn;
   }
   
   /**
   * getListCount is a static method that accepts no parameters and returns the
   * current value of listCount.
   *
   * @return The current value of listCount.
   */
   public static int getListCount() {
   
      return listCount;
   }
   
   /**
   * resetListCount is a static method that accepts no parameters, sets
   * listCount to 0, and returns nothing.
   */
   public static void resetListCount() {
   
      listCount = 0;
   }
   
   /**
   * readItemFile accepts a String representing the data file name, reads the
   * file in, and returns nothing.
   *
   * @param fileNameIn The name of the data file inputed.
   * @throws FileNotFoundException throws an exception if no file found.
   */
   public void readItemFile(String fileNameIn) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      listName = scanFile.nextLine();
      String item = "";
      int newItem = 0; int excludedItem = 0;
      String itemClass = ""; String itemName = "";
      String itemFlavor = "";
      int itemQuantity = 0;
      double itemCrustCost = 0;
      int itemLayers = 0; int itemTiers = 0;
      String[] itemIngredients = new String[50];
      int ingredient = 0;
      int numIngredients = 0;
      while (scanFile.hasNext()) {
         item = scanFile.nextLine();
         Scanner scanItem = new Scanner(item).useDelimiter(",");
         itemClass = scanItem.next();
         if (itemClass.contains("C")) {
            try {
               itemName = scanItem.next(); itemFlavor = scanItem.next();
               itemQuantity = Integer.parseInt(scanItem.next());
               while (scanItem.hasNext()) {
                  itemIngredients[ingredient] = scanItem.next();
                  ingredient++;
               }
               String[] itemIngredientsLine = 
                  Arrays.copyOf(itemIngredients, ingredient);
               Cookie itemCookie = new Cookie(itemName, itemFlavor,
                  itemQuantity, itemIngredientsLine);
               itemList[newItem] = itemCookie;
               newItem++; itemCount++;
               ingredient = 0;
            } catch (NumberFormatException e) {
               String result = "*** " + e + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;   
            } catch (NoSuchElementException e) {
               String result = "*** " + e + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;
            } catch (ArrayIndexOutOfBoundsException e) {
               NoSuchElementException r = new NoSuchElementException();
               String result = "*** " + r + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;
            }
         } else if (itemClass.contains("P")) {
            try {
               itemName = scanItem.next();
               itemFlavor = scanItem.next();
               itemQuantity = Integer.parseInt(scanItem.next());
               itemCrustCost = Double.parseDouble(scanItem.next());
               while (scanItem.hasNext()) {
                  itemIngredients[ingredient] = scanItem.next();
                  ingredient++;
               }
               String[] itemIngredientsLine = 
                  Arrays.copyOf(itemIngredients, ingredient);
               Pie itemPie = new Pie(itemName, itemFlavor,
                  itemQuantity, itemCrustCost, itemIngredientsLine);
               itemList[newItem] = itemPie;
               newItem++;
               itemCount++;
               ingredient = 0;
            } catch (NumberFormatException e) {
               String result = "*** " + e + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;
            } catch (NoSuchElementException e) {
               String result = "*** " + e + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;
            } catch (ArrayIndexOutOfBoundsException e) {
               NoSuchElementException r = new NoSuchElementException();
               String result = "*** " + r + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;
            }
         } else if (itemClass.contains("K")) {
            try {
               itemName = scanItem.next();
               itemFlavor = scanItem.next();
               itemQuantity = Integer.parseInt(scanItem.next());
               itemLayers = Integer.parseInt(scanItem.next());
               while (scanItem.hasNext()) {
                  itemIngredients[ingredient] = scanItem.next();
                  ingredient++;
               }
               String[] itemIngredientsLine = 
                  Arrays.copyOf(itemIngredients, ingredient);
               Cake itemCake = new Cake(itemName, itemFlavor,
                  itemQuantity, itemLayers, itemIngredientsLine);
               itemList[newItem] = itemCake;
               newItem++;
               itemCount++;
               ingredient = 0; 
            } catch (NumberFormatException e) {
               String result = "*** " + e + " in:\n" + item;
               excludedRecords[excludedCount] = result; excludedCount++;
            } catch (NoSuchElementException e) {
               String result = "*** " + e + " in:\n" + item;
               excludedRecords[excludedCount] = result; excludedCount++;
            } catch (ArrayIndexOutOfBoundsException e) {
               NoSuchElementException r = new NoSuchElementException();
               String result = "*** " + r + " in:\n" + item;
               excludedRecords[excludedCount] = result; excludedCount++;
            }
         } else if (itemClass.contains("W")) {
            try {
               itemName = scanItem.next(); itemFlavor = scanItem.next();
               itemQuantity = Integer.parseInt(scanItem.next());
               itemLayers = Integer.parseInt(scanItem.next());
               itemTiers = Integer.parseInt(scanItem.next());
               while (scanItem.hasNext()) {
                  itemIngredients[ingredient] = scanItem.next(); ingredient++;
               }
               String[] itemIngredientsLine =
                  Arrays.copyOf(itemIngredients, ingredient);
               WeddingCake itemW = new WeddingCake(itemName,
                  itemFlavor, itemQuantity, itemLayers, itemTiers, 
                  itemIngredientsLine);
               itemList[newItem] = itemW;
               newItem++;
               itemCount++;
               ingredient = 0; 
            } catch (NumberFormatException e) {
               String result = "*** " + e + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;
            } catch (NoSuchElementException e) {
               String result = "*** " + e + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;
            } catch (ArrayIndexOutOfBoundsException e) {
               NoSuchElementException r = new NoSuchElementException();
               String result = "*** " + r + " in:\n" + item;
               excludedRecords[excludedCount] = result;
               excludedCount++;
            }
         } else {
            InvalidCategoryException e = new
               InvalidCategoryException(String.valueOf(itemClass));
            String result = "*** " + e
               + " in:\n" + item;
            excludedRecords[excludedCount] = result;
            excludedItem++;
            excludedCount++;
         }
      }
   }
   
   /**
   * generateReport accepts no parameters and processes the item list array
   * using the original order from the file to produce the bakery Report which
   * is returned as a String.
   *
   * @return The String output of the list array in the original order.
   */
   public String generateReport() {
   
      BakedItem[] bList = Arrays.copyOf(itemList, itemCount);
      
      String output = "\n---------------------------------------\n"
                    + "Report for " + listName  
                    + "\n---------------------------------------\n";
                    
      for (int i = 0; i < itemCount; i++) {
      
         output += "\n" + bList[i].toString() + "\n";
      }
     
      return output;
   }
   
   /**
   * generateReportByClass accepts no parameters and makes a copy of the item
   * list array and sorts the copy using the natural ordering, then processes
   * the sorted array to produce the bakery Report (by Class) which is returned
   * as a String.
   *
   * @return The String output of the list array in order by class.
   */
   public String generateReportByClass() {
   
      BakedItem[] bList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(bList);
      
      String output = "\n---------------------------------------\n"
                    + "Report for " + listName + " (by Class)" 
                    + "\n---------------------------------------\n";
                    
      for (int i = 0; i < itemCount; i++) {
      
         output += "\n" + bList[i].toString() + "\n";
      }
     
      return output;
   }
   
   /**
   * generateReportByPrice accepts no parameters and makes a copy of the item
   * list array and sorts the copy by item price, then processes the sorted
   * array to produce the bakery Report (by Price) which is returned as a
   * String.
   *
   * @return The String output of the list array in order by price.
   */
   public String generateReportByPrice() {
   
      BakedItem[] bList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(bList, new PriceComparator());
   
      
      String output = "\n---------------------------------------\n"
                    + "Report for " + listName + " (by Price)"  
                    + "\n---------------------------------------\n";
                    
      for (int i = 0; i < itemCount; i++) {
      
         output += "\n" + bList[i].toString() + "\n";
      }
     
      return output;
   }
   
   /**
   * generateReportByFlavor accepts no parameters and makes a copy of the item
   * list array and sorts the copy by flavor, then processes the sorted array
   * to produce the bakery Report (by Flavor) which is returned as a String.
   *
   * @return The String output of the list array in order by flavor.
   */
   public String generateReportByFlavor() {
   
      String output = "";
      
      output = "\n---------------------------------------"
         + "\nReport for " + getListName() + " (by Flavor)"
         + "\n---------------------------------------\n";
      
      BakedItem[] bList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(bList, new FlavorComparator());
      
      int i = 0;
      
      while (bList.length > i) {
         
         output += "\n" + bList[i] + "\n";
         i++;
      }
      
      return output;
   }
   
   /**
   * generateExcludedRecordsReport accepts no parameters and processes the
   * excludedRecords array to produce the Excluded Records Report which is
   * returned as a String.
   *
   * @return The String output of the Excluded Records Report.
   */
   public String generateExcludedRecordsReport() {
   
      String output = "";
      
      output = "\n---------------------------------------"
             + "\nExcluded Records Report"
             + "\n---------------------------------------\n"; 
      
      for (int i = 0; i < excludedCount; i++) {
         
         output += "\n" + excludedRecords[i];
      }
      
      return output;
   }
}