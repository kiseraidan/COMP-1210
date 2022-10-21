/**
* Class Customer creates customer objects and records their name, location,
* and balance.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 18 October 2022
*/
public class Customer implements Comparable<Customer> {

   // instance variables
   private String customerName = "";
   private String customerLocation = "";
   private double customerBalance = 0.0;
   
   /**
   * Constructor Customer class takes the Customer’s name as a parameter.
   * 
   * @param nameIn is a String
   */
   public Customer(String nameIn) {
      
      customerName = nameIn; // sets name to parameter input
      customerLocation = ""; // sets location to empty string
      customerBalance = 0; // sets balance to 0
   }
   
   /**
   * setLocation sets the customer's location.
   *
   * @param locationIn is a String
   */
   public void setLocation(String locationIn) { // sets location variable
   
      customerLocation = locationIn;
   }
   
   /**
   * changeBalance changes the customer balance by an amount specified by a 
   * double parameter.
   *
   * @param amount is a double
   */
   public void changeBalance(double amount) { // add amount to balance
   
      customerBalance += amount;
   }
   
   /**
   * getLocation returns the customer location.
   *
   * @return customerLocation is a String
   */
   public String getLocation() { // returns variable for location
   
      return customerLocation;
   }
   
   /**
   * getBalance returns the customer balance.
   *
   * @return customerBalance is a double
   */
   public double getBalance() { // returns variable for balance
   
      return customerBalance;
   }
   
   /**
   * setLocation sets the customer location with city and state in a single 
   * String or by entering city and state in two separate String parameters.
   * 
   * overloading this method on purpose
   *
   * @param city is a String
   * @param state is a String
   */
   public void setLocation(String city, String state) {
   
      customerLocation = city + ", " + state;
   }
   
   /**
   * toString shows the customer’s name, their location, and their balance.
   *
   * @return a String
   */
   public String toString() {
   
      return customerName + "\n" + customerLocation + "\n$" + customerBalance;
   }
   
   /** 
   * compareTo compares an object of this class to another object to another 
   * compatible object indicated by the generic parameter based on some 
   * value.
   *
   * @param obj is an object of Customer
   * @return 0, -1, or 1 is an int
   */
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.customerBalance - obj.getBalance()) < 0.000001) {
      
         return 0; // consider them equal and return 0
      }
      
      else if (this.customerBalance < obj.getBalance()) {
      
         return -1; // should return a negative number
      }
      
      else {
      
         return 1; // should return a postive number
      }
   }
   
}