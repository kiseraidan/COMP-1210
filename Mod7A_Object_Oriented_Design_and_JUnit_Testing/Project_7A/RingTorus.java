import java.text.DecimalFormat;

/**
* Class RingTorus stores the label, small radius, and large radius of a 
* RingTorus object. Also includes methods to calculate the outside diameter,
* surface area, and volume of a RingTorus object, and a method to provide a 
* String value that describes a RingTorus object.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 13 October 2022
*/
public class RingTorus {

   // class variable
   private static int count = 0;
   
   // instance variables
   private String label = "";
   private double largeRadius = 0;
   private double smallRadius = 0;
   
   /**
   * Constructor uses 3 parameters for a string and two doubles.
   *
   * @param labelIn is a string
   * @param largeRadiusIn is a double
   * @param smallRadiusIn is a double
   */
   public RingTorus(String labelIn, double largeRadiusIn, 
      double smallRadiusIn) {
      
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      count++;
   }
   
   /**
   * getLabel returns the label if valid.
   *
   * @return label of object is a string
   */
   public String getLabel() {
      
      return label;
   }
   
   /**
   * setLabel returns a boolean if the label is valid.
   *
   * @param labelIn is inputed value - used
   * @return boolean if label is valid or not
   */
   public boolean setLabel(String labelIn) {
     
      if (labelIn != null) {
         
         label = labelIn.trim();
      
         return true;
      }
     
      return false;
   }
   
   /**
   * getLargeRadius returns the large radius.
   *
   * @return largeRadius is a double
   */
   public double getLargeRadius() {
      
      return largeRadius;
   }
   
   /**
   * setLargeRadius returns a double for the large radius.
   *
   * @param largeRadiusIn is an inputed double - used
   * @return boolean if the large radius is valid
   */
   public boolean setLargeRadius(double largeRadiusIn) {
   
      if (largeRadiusIn >= 0 && largeRadiusIn > smallRadius) {
         
         largeRadius = largeRadiusIn;
         
         System.out.println(largeRadius);
         return true;
      }
      
      return false;
   }
   
   /**
   * getsmallRadius returns the small radius.
   *
   * @return smallRadius is a double
   */
   public double getSmallRadius() {
   
      return smallRadius;
   }
   
   /**
   * setSmallRadius returns a double for the small radius.
   *
   * @param smallRadiusIn is an inputed double - used
   * @return boolean if the large radius is valid
   */
   public boolean setSmallRadius(double smallRadiusIn) {
   
      if (smallRadiusIn >= 0 && smallRadiusIn < largeRadius) {
         
         smallRadius = smallRadiusIn;
         
         return true;
      }
      
      return false;
   }
   
   /**
   * diameter returns a double for the diameter of the RingTorus.
   *
   * @return calculation for diameter
   */
   public double diameter() {
   
      return 2 * (largeRadius + smallRadius);
   }
   
   /**
   * surfaceArea returns a double for the surface area of the RingTorus.
   *
   * @return calculation for surfaceArea
   */
   public double surfaceArea() {
   
      return (2 * Math.PI * largeRadius) * (2 * Math.PI * smallRadius);
   }
   
   /**
   * volume returns a double for the volume of the RingTorus.
   * 
   * @return calculation for volume
   */
   public double volume() {
   
      return (2 * Math.PI * largeRadius) * (Math.PI * Math.pow(smallRadius, 2));
   }
   
   /** 
   * toString returns the string that displays all the calculations for the
   * RingTorus.
   *
   * @return output is a string
   */
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      
      output += "RingTorus \"" + label + "\""
         + "\n\tlarge radius = " + largeRadius + " units"
         + "\n\tsmall radius = " + smallRadius + " units"
         + "\n\tdiameter = " + df.format(diameter()) + " units"
         + "\n\tsurface area = " + df.format(surfaceArea()) + " square units"
         + "\n\tvolume = " + df.format(volume()) + " cubic units";
         
      return output;
   }
   
   /**
   * getCount returns an int representing the static count field.
   *
   * @return count is an int
   */
   public static int getCount() {
   
      return count;
   }
   
   /**
   * resetCount sets the static count field to zero. Returns nothing.
   */
   public static void resetCount() {
   
      count = 0;
   }
   
   /**
   * equals returns a boolean false if the object is not a RingTorus and 
   * returns the field values if not false.
   *
   * @param obj is an inputed object
   * @return boolean false if not a RingTorus and field values if not false
   */
   public boolean equals(Object obj) {
      
      if (!(obj instanceof RingTorus)) {
      
         return false;
      }
      
      else {
      
         RingTorus rt = (RingTorus) obj; 
            
         return (label.equalsIgnoreCase(rt.getLabel())
               && (Math.abs(largeRadius - rt.getLargeRadius()) < .000001)
               && (Math.abs(smallRadius - rt.getSmallRadius()) < .000001));
      }
   }
   
   /**
   * hashCode returns an int and is required for the equals method above.
   *
   * @return 0 always
   */
   public int hashCode() {
   
      return 0;
   }
}