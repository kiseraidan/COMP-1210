import java.io.FileNotFoundException;

/**
* Class BakeryPart3 reads in the file name as the first argument, creates an
* instance of BakedItemList, and then calls the readItemFile method in the
* BakedItemList class to read in the data file and generate the five reports
* from the other classes.
* 
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 17 November 2022
*/
public class BakeryPart3 {

   /**
   * Driver class reads in the file name as the first argument, creates an
   * instance of BakedItemList, and then calls the readItemFile method in the
   * BakedItemList class to read in the data file and generate the five
   * reports.
   *
   * @param args The command line argument for the file name.
   * @throws FileNotFoundException throws an exception if no file found.
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      if (args.length == 0) {
      
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
      
      else {
      
         String fileName = args[0];
      
         try {
         
            BakedItemList bList = new BakedItemList();
         
            bList.readItemFile(fileName);
            System.out.println(bList.generateReport());
            System.out.println(bList.generateReportByClass());
            System.out.println(bList.generateReportByPrice());
            System.out.println(bList.generateReportByFlavor());
            System.out.println(bList.generateExcludedRecordsReport());
         }
         
         catch (FileNotFoundException e) {
         
            System.out.println("Attempted to read file: " + fileName
               + " (No such file or directory)\n" + "Program ending.");
         }
      }
   }
}