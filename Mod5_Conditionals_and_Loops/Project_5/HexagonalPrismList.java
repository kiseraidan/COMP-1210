import java.util.ArrayList;
import java.text.DecimalFormat;
/**
* Class HexagonalPrismList creates an array of Hexagonal Prism objects and
* displays various types of information.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 22 September 2022
*/
public class HexagonalPrismList {
   
   // Instance Variables
   
   private String list = "";
   private ArrayList<HexagonalPrism> prismObjects =
      new ArrayList<HexagonalPrism>();
      
   // Constructor
   
   /**
    * Constructor uses 2 parameters for list name and arraylist and will be 
    * accessed in a driver class.
    *
    * @param listIn is the list name
    * @param prismObjectsIn HexagonalPrismList containing Hexagonal 
    * Prisms
    */
   public HexagonalPrismList(String listIn, 
      ArrayList<HexagonalPrism> prismObjectsIn) {
      
      list = listIn;
      prismObjects = prismObjectsIn;
   }
   
   // Methods
   
   /**
    * Returns a String representing the name of the list.
    *
    * @return Hexagonal Prism's name
    */
   public String getName() {
      return list;
   }
   
   /**
   * Returns an int representing the number of HexagonalPrism objects in the
   * HexagonalPrismList.
   *
   * @return hexagonalPrismObjects.size() returns size of arraylist
   */
   public int numberOfHexagonalPrisms() {
      return prismObjects.size();
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
            surfaceArea += prismObjects.get(index).surfaceArea();
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
            volume += prismObjects.get(index).volume();
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
      while (index < prismObjects.size()) {
         average = totalSurfaceArea() / prismObjects.size();
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
      while (index < prismObjects.size()) {
         average = totalVolume() / prismObjects.size();
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
      while (index < prismObjects.size()) {
         output += "\n" + prismObjects.get(index).toString() + "\n";
         index++;
      }
      String list1 = list + "\n" + output;
      return list1;
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
      
      output += "----- Summary for " + list + " -----"
         + "\nNumber of HexagonalPrisms: " + prismObjects.size()
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
            + " square units"
         + "\nTotal Volume: " + df.format(totalVolume()) + " cubic units"
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
            + " square units"
         + "\nAverage Volume: " + df.format(averageVolume()) + " cubic units";
      
      return output;
   }
}
