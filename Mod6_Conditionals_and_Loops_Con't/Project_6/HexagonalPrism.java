import java.text.DecimalFormat;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
* Class HexagonalPrism calculates various user inputed values corresponding
* to a hexagonal prism.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 15 September 2022
*/
public class HexagonalPrism {

   // Instance variables

   private String label = "";
   private double edge = 0;
   private double height = 0;
   
   // Constructor
   
   /**
   * Develops the constructor with given parameters.
   *  
   * @param labelIn - used.
   * 
   * @param edgeIn - used.
   *
   * @param heightIn - used.
   */
   public HexagonalPrism(String labelIn, double edgeIn, double heightIn) {
   
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
   
   // Methods
   
   /**
   * Creates and returns the string assigned to the object.
   * 
   * @return String ----
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "HexagonalPrism \"" + label + "\" "; 
      output += "has 8 faces, 18 edges, and 12 vertices.";
      output += "\n\tedge = " + edge + " units";
      output += "\n\theight = " + height + " units";
      output += "\n\tlateral surface area = "
         + df.format(lateralSurfaceArea()) + " square units";
      output += "\n\tbase area = " + df.format(baseArea()) + " square units";
      output += "\n\tsurface area = " + df.format(surfaceArea()) 
         + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
   
   /**
    * Sets the label to the string above.
    *
    * @param labelIn - used
    * @return boolean if label is set
    */
   public boolean setLabel(String labelIn) {
      boolean isLabelSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isLabelSet = true;
      }
      return isLabelSet;
   }
   
   /**
    * Retrieves the label of the object.
    *
    * @return String the label of the object
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Sets the edge to the inputed double.
    *
    * @param edgeIn - used
    * @return boolean if base is set
    */
   public boolean setEdge(double edgeIn) {
      boolean isEdgeSet = false;
      if (edgeIn > 0) {
         edge = edgeIn;
         isEdgeSet = true;
      }
      return isEdgeSet;
   }
   
   /**
   * Retrieves the edge of the object.
   *
   * @return double of the edge of the object
   */
   public double getEdge() {
      return edge;
   }
   
   /**
    * Sets height to the inputed double.
    *
    * @param heightIn - used
    * @return boolean if height is set
    */
   public boolean setHeight(double heightIn) {
      boolean isHeightSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isHeightSet = true;
      }
      return isHeightSet;
   }
   
   /**
    * Retrieves the height of the object.
    *
    * @return double of the height of the object
    */
   public double getHeight() {
      return height;
   }
   
   /**
   * Calculates and returns lateral surface area of the hexagonal prism.
   *
   * @return double calculated lateral surface area
   */
   public double lateralSurfaceArea() {
      double lateralSurfaceArea = (6 * edge * height);
      return lateralSurfaceArea;
   }
   
   /**
   * Calculates and returns base area of the hexagonal prism.
   *
   * @return double calculated base area
   */
   public double baseArea() {
      double baseArea = (3 * sqrt(3)) * (pow(edge, 2) / 2);
      return baseArea;
   }
   
   /**
    * Calculates and returns surface area of the hexagonal prism.
    *
    * @return double calculated surface area
    */
   public double surfaceArea() {
      double surfaceArea = (6 * edge * height) + (3 * sqrt(3) * pow(edge, 2));
      return surfaceArea;
   }
   
   /**
   * Calculates and returns the volume of the hexagonal prism.
   *
   * @return double calculated volume
   */
   public double volume() {
      double volume = ((3 * sqrt(3)) / 2) * (pow(edge, 2) * height);
      return volume;
   }
}