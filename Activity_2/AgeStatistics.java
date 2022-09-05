import java.util.Scanner;
/**
* Recieves input from the user and performs simple calculations from
* the user's input of their name, age, and gender.
* 
* @author Aidan Kiser - COMP1210 - 001
* @version 30 August 2022
*/
public class AgeStatistics {
   /**
   * Allows the user to input their name, age, and gender to then output
   * calculations of age in minutes as well as centuries and max heart rate
   * based on gender. Prints to standard output.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      
      String name = "";
      int ageInYears = 0;
      int gender = 0; // 1 for female.
      double maxHeartRate = 0;
   
   // Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
   
   // Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
   
   // Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
   // Convert age into minutes:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
   // Convert age into centuries: 
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
         
   // Display user max heart rate:
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) { // Calculate female MHR on next line
         maxHeartRate = 209 - (0.7 * ageInYears);
         System.out.println(maxHeartRate + " beats per minute.");
      }
      else { // Calculate male MHR on next line
         maxHeartRate = 214 - (0.8 * ageInYears);
         System.out.println(maxHeartRate + " beats per minute.");
      }
   }
}