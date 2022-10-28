import java.text.DecimalFormat;

/**
* Class RingTorus stores the label, small radius, and large radius of a 
* RingTorus object. Also includes methods to calculate the outside diameter,
* surface area, and volume of a RingTorus object, and a method to provide a 
* String value that describes a RingTorus object.
* This specific program is a continuation of last week's Module 7A project.
* This project adds the compareTo method.
*
* Project 8
* @author Aidan Kiser - COMP1210 - 001
* @version 27 October 2022
*/
public class RingTorus implements Comparable<RingTorus> {

   // class variable
   private static int count = 0;
   
   // instance variables
   private String label = "";
   private double largeRadius = 0;
   private double smallRadius = 0;
   
   /**
   * Constructor uses 3 parameters for a string and two doubles to create 
   * RingTorus obects and set their values. Also interates through multiple
   * objects.
   *
   * @param labelIn The new label that is inputed.
   * @param largeRadiusIn The new large radius that is inputed.
   * @param smallRadiusIn The new small radius that is inputed.
   */
   public RingTorus(String labelIn, double largeRadiusIn, 
      double smallRadiusIn) {
      
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      count++;
   }
   
   /**
   * getLabel gets a new label for the RingTorus.
   *
   * @return The current label after it is created.
   */
   public String getLabel() {
      
      return label;
   }
   
   /**
   * setLabel sets the new label for the RingTorus.
   *
   * @param labelIn The new String for the new label that is inputed.
   * @return A boolean if label is valid or not.
   */
   public boolean setLabel(String labelIn) {
     
      if (labelIn != null) {
         
         label = labelIn.trim();
      
         return true;
      }
     
      return false;
   }
   
   /**
   * getLargeRadius gets a new large radius for the RingTorus.
   *
   * @return The current large radius after it is created.
   */
   public double getLargeRadius() {
      
      return largeRadius;
   }
   
   /**
   * setLargeRadius sets the new large radius for the RingTorus.
   *
   * @param largeRadiusIn The new double for the large radius.
   * @return A boolean if the large radius is valid.
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
   * getsmallRadius gets a new small radius for the RingTorus.
   *
   * @return The current small radius after it is created.
   */
   public double getSmallRadius() {
   
      return smallRadius;
   }
   
   /**
   * setSmallRadius sets the new small radius for the RingTorus.
   *
   * @param smallRadiusIn The new double for the small radius.
   * @return A boolean if the small radius is valid.
   */
   public boolean setSmallRadius(double smallRadiusIn) {
   
      if (smallRadiusIn >= 0 && smallRadiusIn < largeRadius) {
         
         smallRadius = smallRadiusIn;
         
         return true;
      }
      
      return false;
   }
   
   /**
   * diameter calculates a new diameter for the RingTorus.
   *
   * @return The calculation for the new diameter.
   */
   public double diameter() {
   
      return 2 * (largeRadius + smallRadius);
   }
   
   /**
   * surfaceArea calculates a new surface area for the RingTorus.
   *
   * @return The calculation for the new surface area.
   */
   public double surfaceArea() {
   
      return (2 * Math.PI * largeRadius) * (2 * Math.PI * smallRadius);
   }
   
   /**
   * volume calculates a new volume for the RingTorus.
   * 
   * @return The calculation for the new surface area.
   */
   public double volume() {
   
      return (2 * Math.PI * largeRadius) * (Math.PI * Math.pow(smallRadius, 2));
   }
   
   /** 
   * toString creates the string that displays all the calculations for the
   * RingTorus.
   *
   * @return The string that displays all of the calculations for the 
   * RingTorus.
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
   * getCount gets an int representing the static count field.
   *
   * @return The new static count.
   */
   public static int getCount() {
   
      return count;
   }
   
   /**
   * resetCount sets the static count field to zero and returns nothing.
   */
   public static void resetCount() {
   
      count = 0;
   }
   
   /**
   * equals gets a new RingTorus object and returns false if the object
   * is not a RingTorus and returns the field values if not false.
   *
   * @param obj The new RingTorus object.
   * @return A boolean that is false if not a RingTorus and the field values 
   * if not false.
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
   * @return The integer 0 in all scenarios.
   */
   public int hashCode() {
   
      return 0;
   }
   
   /** 
   * compareTo compares an object of this class to another compatible object
   * indicated by the generic parameter based on some 
   * value.
   *
   * @param obj The new RingTorus object that is created.
   * @return -1, 1, or 0 depending on the two values being compared.
   */
   public int compareTo(RingTorus obj) {
   
      if (this.volume() < obj.volume()) {
      
         return -1; // should return a negative number
      }
      
      else if (this.volume() > obj.volume()) {
      
         return 1; // should return a positive number
      }
      
      else {
      
         return 0; // consider them equal and return 0
      }
   }
}