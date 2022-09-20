import java.util.Scanner;
/**
* Class HexagonalPrism calculates various user inputed values corresponding
* to a hexagonal prism.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 15 September 2022
*/
public class HexagonalPrismApp {
/** 
* Creates prompts for user input then calculates different information
* regarding a hexagonal prism using the variables inputed by the user.
*
* @param args Command line arguments (not used).
*/
   
   public static void main(String[] args) {
      Scanner user = new Scanner(System.in);
      String label;
      double edge, height;
      
      // Default prism
      HexagonalPrism prism = new HexagonalPrism("default", 0, 0);
      
      // Prompt the user to enter values
      System.out.println("Enter label, edge, and height for a hexagonal"
         + " prism.");
         
      // Prompt the user to enter label, edge, and height
      System.out.print("\tlabel: ");
      label = user.nextLine();
      prism.setLabel(label);
      
      System.out.print("\tedge: ");
      edge = Double.parseDouble(user.next());
      prism.setEdge(edge);
      if (!prism.setEdge(edge)) {
         System.out.println("Error: edge must be greater than zero.");
         return;
      }
      
      System.out.print("\theight: ");
      height = Double.parseDouble(user.next());
      prism.setHeight(height);
      if (!prism.setHeight(height)) {
         System.out.println("Error: height must be greater than zero.");
         return;
      }
      
      System.out.println("\n" + prism);
   }
}