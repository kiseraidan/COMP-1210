/**
* Simple program to print course description to demonstrate understanding of
* debugging and checkstyle.
* 
* Module 1: Activity 1 Part B
* @author Aidan Kiser - COMP1210 - 001
* @version 22 August 2022
*/ 
public class CourseInfo
{
   /**
    * Prints course information to std output.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      /**
      * Print course description.
      */
      System.out.println("This course provides an introduction to Java and");
      System.out.println("object-oriented programming.");
   
      /** 
      * Print more course description after a line of white space.
      */
      System.out.println("\nThe course also introduces the basics of software "
         + "development.");
   }
}