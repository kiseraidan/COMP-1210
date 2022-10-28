import java.text.DecimalFormat;

/**
* Class RingTorusList stores the name of the list and an array of RingTorus
* objects. It also includes methods that return the name of the list, number 
* of RingTorus objects in the RingTorusList, total surface area, total volume,
* average surface area, and average volume for all RingTorus objects in the 
* RingTorusList.
*
* Project 8
* @author Aidan Kiser - COMP1210 - 001
* @version 27 October 2022
*/
public class RingTorusList {

   // instance variables
   private String listName;
   private RingTorus[] rtArray;
   private int rtNumber;
   
   /**
   * Constructor accepts three parameters: a parameter of type String 
   * representing the name of the list, a parameter of type RingTorus[],
   * representing the list of RingTorus objects, and a parameter of type int
   * representing the number of RingTorus objects in the array. These 
   * parameters are used to assign the fields described above.
   *
   * @param listNameIn The new name of the list that is inputed.
   * @param rtArrayIn The new array of RingTorus objects.
   * @param rtNumberIn The number of objects in the RingTorus array.
   */
   public RingTorusList(String listNameIn, RingTorus[] rtArrayIn, 
      int rtNumberIn) {
      
      listName = listNameIn;
      rtArray = rtArrayIn;
      rtNumber = rtNumberIn;
   }
  
  /**
  * getLabel gets a new name for the RingTorus array.
  *
  * @return The current name after it is created.
  */
   public String getName() {
   
      return listName;
   }
   
   /**
   * numberOfRingToruses gets the number of RingTorus objects in the 
   * RingTorusList.
   *
   * @return The integer representing the number of RingTorus objects in the 
   * RingTorusList.
   */
   public int numberOfRingToruses() {
   
      return rtNumber;
   }
   
   /**
   * totalDiameter calculates the total diameters for all RingTorus objects
   * in the list. 
   *
   * @return The calculated total diameter of the RingToruses in the list.
   */
   public double totalDiameter() {
   
      int index = 0;
      double result = 0.0;
      
      while (index < rtNumber) {
      
         RingTorus totalD = rtArray[index];
         
         result += totalD.diameter();
         
         index++;
      }
      
      return result;
   }
   
   /**
   * totalSurfaceArea calculates the total surface areas for all RingTorus 
   * objects in the list. 
   *
   * @return The calculated total surface area of the RingToruses in the list.
   */
   public double totalSurfaceArea() {
      
      int index = 0;
      double result = 0.0;
      
      while (index < rtNumber) {
      
         RingTorus totalSA = rtArray[index];
         
         result += totalSA.surfaceArea();
         
         index++;
      } 
      
      return result;
   }
   
   /**
   * totalVolume calculates total volumes for all RingTorus objects in the
   * list. 
   *
   * @return The calculated total volume of the RingToruses in the list.
   */
   public double totalVolume() {
   
      int index = 0;
      double result = 0.0;
      
      while (index < rtNumber) {
      
         RingTorus totalV = rtArray[index];
         
         result += totalV.volume();
         
         index++;
      } 
      
      return result;
   }
   
   /**
   * averageDiameter calculates the average diameter for all RingTorus objects
   * in the list. 
   *
   * @return The calculated average diameter of the RingToruses in the list.
   */
   public double averageDiameter() {
   
      int index = 0;
      double result = 0.0;
      
      while (index < rtNumber) {
      
         RingTorus averageD = rtArray[index];
         
         result = totalDiameter() / rtNumber;
         
         index++;
      }
      
      return result;
   }
   
   /**
   * averageSurfaceArea calculates the average surface area for all RingTorus
   * objects in the list. 
   *
   * @return The calculated average surface area of the RingToruses in the list.
   */
   public double averageSurfaceArea() {
   
      int index = 0;
      double result = 0.0;
      
      while (index < rtNumber) {
      
         RingTorus averageSA = rtArray[index];
         
         result = totalSurfaceArea() / rtNumber;
         
         index++;
      }
      
      return result;
   }
   
   /**
   * averageVolume calculates the average volume for all RingTorus objects
   * in the list.
   *
   * @return The calculated average volume of the RingToruses in the list.
   */
   public double averageVolume() {
   
      int index = 0;
      double result = 0.0;
      
      while (index < rtNumber) {
      
         RingTorus averageV = rtArray[index];
         
         result = totalVolume() / rtNumber;
         
         index++;
      }
      
      return result;
   }
   
   /**
   * toString displays various details and calculations regarding an inputed
   * RingTorus list including the number of RingToruses, total diameter, 
   * total surface area, total volume, average diameter, average surface area,
   * and average volume.
   *
   * @return The displayed details and calculations regarding the inputed 
   * RingTorus list.
   */
   public String toString() {
   
      String output = "";
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      output += "----- Summary for " + listName + " -----"
         + "\nNumber of RingToruses: " + rtNumber
         + "\nTotal Diameter: " + df.format(totalDiameter()) + " units"
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
            + " square units"
         + "\nTotal Volume: " + df.format(totalVolume()) + " cubic units"
         + "\nAverage Diameter: " + df.format(averageDiameter()) + " units"
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
            + " square units"
         + "\nAverage Volume: " + df.format(averageVolume()) + " cubic units";
         
      return output;
   }
   
   /** 
   * getList gets the array of RingTorus objects.
   *
   * @return The current RingTorus list after it is created.
   */
   public RingTorus[] getList() {
   
      return rtArray;
   }
   
   /**
   * addRingTorus creates a new RingTorus object, and adds it to the 
   * RingTorusList object in the next available location in the RingTorus
   * array.
   * 
   * @param label The new label of the RingTorus being added.
   * @param largeRadius The new large Radius of the RingTorus being added.
   * @param smallRadius The new small Radius of the RingTorus being added.
   */
   public void addRingTorus(String label, double largeRadius, 
      double smallRadius) {
      
      RingTorus newRT = new RingTorus(label, largeRadius, smallRadius);
      
      rtArray[rtNumber] = newRT;
      
      rtNumber++;
   }
   
   /**
   * findRingTorus searches the array of RingTorus objects for the RingTorus
   * that corresponds with the indicated label if it exists within the array
   * being searched.
   * 
   * @param label The label inputed that is then searched for within the 
   * existing RingTorus list.
   * @return The RingTorus that corresponds with the inputed label. Null if the
   * RingTorus being searched does not exist within the searched RingTorus list.
   */
   public RingTorus findRingTorus(String label) {
   
      for (int index = 0; index < rtNumber; index++) {
      
         if (rtArray[index].getLabel().equalsIgnoreCase(label)) {
         
            return rtArray[index];
         }
      }
      
      return null;
   }
   
   /**
   * deleteRingTorus searches the array of RingTorus objects for the RingTorus
   * that corresponds with the indicated label if it exists within the array
   * being searched, and is then deleted.
   *
   * @param label The label inputed that is then searched for within the 
   * existing RingTorus list.
   * @return The RingTorus corresponding to the inputed label so that it can be
   * deleted. Null if the RingTorus being searched does not exist within the
   * searched RingTorus list.
   */
   public RingTorus deleteRingTorus(String label) {
   
      RingTorus toBeDeleted = null;
      
      for (int index = 0; index < rtNumber; index++) {
      
         if (label.equalsIgnoreCase(rtArray[index].getLabel())) {
         
            toBeDeleted = rtArray[index];
            
            for (int j = index; j < rtNumber - 1; j++) {
            
               rtArray[j] = rtArray[j + 1];
            }
            
            rtArray[rtNumber - 1] = null;
            
            rtNumber--;
            
            return toBeDeleted;
         }
      }
      
      return null;
   }
   
   /**
   * editRingTorus searches the array of RingTorus objects for the RingTorus
   * that corresponds with the indicated label if it exists within the array
   * being searched, then sets the large radius and small radius fields to the
   * values passed in as parameters.
   *
   * @param label The inputed label used to search for the corresponding 
   * RingTorus within the existing RingTorus list.
   * @param largeRadius The large radius that is being edited.
   * @param smallRadius The small radius that is being edited.
   * @return True if the existing RingTorus can be edited. False if the 
   * RingTorus being searched for doesn't exist within the current RingTorus
   * list.
   */
   public boolean editRingTorus(String label, double largeRadius, 
      double smallRadius) {
    
      for (int index = 0; index < rtNumber; index++) {
      
         if (rtArray[index].getLabel().equalsIgnoreCase(label)) {
         
            rtArray[index].setLargeRadius(largeRadius);
            rtArray[index].setSmallRadius(smallRadius);
            
            return true;
         }
      }
      
      return false;
   }
   
   /** 
   * findRingTorusWithLargestVolume gets the RingTorus with the largest volume.
   *
   * @return The RingTorus with the largest volume. Null if the number of
   * RingToruses within the existing RingTorus list is zero.
   */
   public RingTorus findRingTorusWithLargestVolume() {
      
      RingTorus largestVRT = new RingTorus("", 0.0, 0.0);
      double largestV = 0.0;
      
      if (rtNumber != 0) {
      
         for (int index = 0; index < rtNumber; index++) {
         
            if (largestV < rtArray[index].volume()) {
            
               largestV = rtArray[index].volume();
               largestVRT = rtArray[index];
            }
         }
         
         return largestVRT;
      }
      
      return null;
   }
}