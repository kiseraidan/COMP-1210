import javax.swing.JOptionPane;

/**
* Class DivisionDriver will get a numerator and denominator from the user and
* print the integer division and decimal division result.
* 
* Activity 11
* @author Aidan Kiser - COMP1210 - 001
* @version 14 November 2022
*/
public class DivisionDriver {

   /**
   * main method will get a numerator and denominator from the user and print
   * the integer division and decimal division result.
   *
   * @param args The command line arguments that are not used.
   */
   public static void main(String[] args) {
   
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
      
      try {
         
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result, 
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      
      catch (NumberFormatException e) {
         
         JOptionPane.showMessageDialog(null, 
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      
      catch (IllegalArgumentException e) {
         
         JOptionPane.showMessageDialog(null, e,
            "Error", JOptionPane.ERROR_MESSAGE);
      }     
   }
}