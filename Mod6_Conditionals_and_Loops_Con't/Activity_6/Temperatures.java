import java.util.ArrayList;
/**
* Class Temperatures is a program that allows user input into a driver class 
* and displays the values when asked to display them.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 27 September 2022
*/
public class Temperatures {

   // Instance variables
   
   private ArrayList<Integer> temperatures;
   
   // Constructor
   
   /**
   * Constructor uses 1 parameter for an ArrayList and sets the temperature.
   * Will be accessed in driver class TemperaturesInfo.
   *
   * @param temperaturesIn is an ArrayList
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   // Methods
   
   /**
   * Method getLowTemp returns the lowest temperature.
   *
   * @return int value low returns the lowest temperature
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
   * Method getHighTemp returns the highest temperature.
   *
   * @return int value high returns the highest temperature
   */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
   /**
   * Method lowerMinimum returns the lowest temperature when compared with
   * the inputed temperature.
   *
   * @param lowIn takes in an int
   * @return int value lowIn returns the lowest temperature
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   * Method higherMaximum returns the highest temperature when compared with
   * the inputed temperature.
   *
   * @param highIn takes in an int
   * @return int value highIn returns the highest temperature
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
   * Method toString returns the string.
   *
   * @return String toString returns the low and high temperatures
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}