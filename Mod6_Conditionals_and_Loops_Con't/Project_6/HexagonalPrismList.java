import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
* Class HexagonalPrismList creates an array of Hexagonal Prism objects and
* displays various types of information.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 30 September 2022
*/
public class HexagonalPrismList {
   
   // Instance Variables
   
   private String listName = "";
   private ArrayList<HexagonalPrism> list =
      new ArrayList<HexagonalPrism>();
      
   // Constructor
   
   /**
    * Constructor uses 2 parameters for list name and arraylist and will be 
    * accessed in a driver class.
    *
    * @param listNameIn is the list name
    * @param listIn HexagonalPrismList containing Hexagonal 
    * Prisms
    */
   public HexagonalPrismList(String listNameIn, 
      ArrayList<HexagonalPrism> listIn) {
      
      listName = listNameIn;
      list = listIn;
   }
   
   // Methods
   
   /**
    * Returns a String representing the name of the list.
    *
    * @return Hexagonal Prism's name
    */
   public String getName() {
      return listName;
   }
   
   /**
   * Returns an int representing the number of HexagonalPrism objects in the
   * HexagonalPrismList.
   *
   * @return hexagonalPrismObjects.size() returns size of arraylist
   */
   public int numberOfHexagonalPrisms() {
      return list.size();
   }
   
   /**
    * Returns a double representing the total surface area for all 
    * HexagonalPrism objects in the list.
    *
    * @return total surface area
    */
   public double totalSurfaceArea() {
      double surfaceArea = 0.0;
      int index = 0;
      if (numberOfHexagonalPrisms() != 0) {
         while (index < numberOfHexagonalPrisms()) {
            surfaceArea += list.get(index).surfaceArea();
            index++;
         }
      }
      return surfaceArea;
   }
   
   /** 
   * Returns a double representing the total volume for all HexagonalPrism 
   * objects in the list.
   *
   * @return total volume
   */
   public double totalVolume() {
      double volume = 0.0;
      int index = 0;
      if (numberOfHexagonalPrisms() != 0) {
         while (index < numberOfHexagonalPrisms()) {
            volume += list.get(index).volume();
            index++;
         }
      }
      return volume;
   }
   
   /**
   * Returns a double representing the average surface area for 
   * HexagonalPrism objects in the list.
   *
   * @return average surface area
   */
   public double averageSurfaceArea() {
      int index = 0;
      double average = 0;
      if (numberOfHexagonalPrisms() == 0) {
         return 0.0;
      }
      while (index < list.size()) {
         average = totalSurfaceArea() / list.size();
         index++;
      }
      return average;
   }
   
   /**
   * Returns a double representing the average volume for all 
   * HexagonalPrism objects in the list.
   * 
   * @return average volume
   */
   public double averageVolume() {
      int index = 0;
      double average = 0;
      if (numberOfHexagonalPrisms() == 0) {
         return 0.0;
      }
      while (index < list.size()) {
         average = totalVolume() / list.size();
         index++;
      }
      return average;
   }
   
   /** 
   * Returns a String containing the name of the list followed by each 
   * HexagonalPrism in the ArrayList.
   *
   * @return string output (list1)
   */
   public String toString() {
      int index = 0;
      String output = "";
      output = "\n----- " + getName() + " -----" + "\n";
      if (list.size() > 0) {
         output += "\n";
         output += (list.get(index));
         if (index + 1 < list.size()) {
            output += "\n";
         }
         index++;
      }
      return output;
   }
   
   /**
   * Returns a String containing the name of the list followed by various 
   * summary items.
   *
   * @return output of summary information
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      String output1 = "";
      int index = 0;
      
      output += "----- Summary for " + getName() + " -----"
         + "\nNumber of HexagonalPrisms: " + list.size()
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
            + " square units"
         + "\nTotal Volume: " + df.format(totalVolume()) + " cubic units"
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
            + " square units"
         + "\nAverage Volume: " + df.format(averageVolume()) + " cubic units";
      
      return output;
   }
   
   /**
   * Returns the ArrayList of the HexagonalPrism objects.
   *
   * @return list (used)
   */
   public ArrayList<HexagonalPrism> getList() {
      return list;
   }
   
   /**
   * Takes a String parameter representing file name, reads the file, storing
   * the list name and creating an ArrayList of HexagonalPrism objects, uses
   * the list name and the ArrayList to create a HexagonalPrismList object,
   * then returns the HexagonalPrsmList object.
   *
   * @param fileName (used)
   * @throws FileNotFoundException (used)
   * @return newPPList created list
   */
   public HexagonalPrismList readFile(String fileName) 
      throws FileNotFoundException {
      
      Scanner scanFile = new Scanner(new File(fileName));
      String newListName = "";
      ArrayList<HexagonalPrism> newList = new ArrayList<HexagonalPrism>();
      newListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String name = "";
         while (scanFile.hasNextLine() && !scanFile.hasNextDouble()) {
            name += scanFile.nextLine();
         }
         name = name.trim();
         double edge = scanFile.nextDouble();
         double height = scanFile.nextDouble();
         HexagonalPrism pp = new HexagonalPrism(name, edge, height);
         newList.add(pp);
      }
      scanFile.close();
      HexagonalPrismList newPPList
         = new HexagonalPrismList(newListName, newList);
      return newPPList;
   }
   
   /**
   * Returns nothing, takes parameters label, edge, height, and creates a new
   * HexagonalPrism object, and adds it to the HexagonalPrismList object.
   *
   * @param labelNO (used)
   * @param edgeNO (used)
   * @param heightNO (used)
   */
   public void addHexagonalPrism(String labelNO, double edgeNO, 
      double heightNO) {
      
      HexagonalPrism pp = new HexagonalPrism(labelNO, edgeNO, heightNO);
      list.add(pp);
   }
   
   /**
   * Takes a label of a HexagonalPrism as the String parameter and returns the
   * the corresponding HexagonalPrism object if found in the HexagonalPrismList
   * object; otherwise returns null.
   *
   * @param labelIn (used)
   * @return HexagonalPrism object found 
   */
   public HexagonalPrism findHexagonalPrism(String labelIn) {
      for (HexagonalPrism pp : getList()) {
         if (pp.getLabel().equalsIgnoreCase(labelIn)) {
            return pp;
         }
      }
      return null;
   }
   
   /**
   * Takes a String parameter that represents the label of the HexagonalPrism
   * and retuns the HexagonalPrism if it is found in the HexagonalPrismList
   * object and deleted; otherwise returns null.
   *
   * @param labelIn (used)
   * @return HexagonalPrism object deleted
   */
   public HexagonalPrism deleteHexagonalPrism(String labelIn) {
      if (findHexagonalPrism(labelIn) != null) {
         HexagonalPrism deleted = findHexagonalPrism(labelIn);
         list.remove(findHexagonalPrism(labelIn));
         return deleted;
      }
      else {
         return null;
      }
   }
   
   /**
   * Takes three parameters: label, edge, height, and uses the label to find 
   * the corresponding to the HexagonalPrism object. If found, sets the edge
   * and height to the values passed in as parameters, and returns true.
   * If not found, returns false.
   *
   * @param labelIn (used)
   * @param edgeIn (used)
   * @param heightIn (used)
   * @return boolean if or if not completed
   */
   public boolean editHexagonalPrism(String labelIn, double edgeIn, 
      double heightIn) {
      if (findHexagonalPrism(labelIn) != null) {
         findHexagonalPrism(labelIn).setEdge(edgeIn);
         findHexagonalPrism(labelIn).setHeight(heightIn);
         return true;
      }
      return false;
   }
}
