/**
* Class BankLoan calculated bank loans and other variables such as debt.
*
* @author Aidan Kiser - COMP1210 - 001
* @version 11 October 2022
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;

   /**
   * Constructor uses 2 parameter for an string and double.
   * Will be accessed in driver class
   *
   * @param customerNameIn is a string
   * @param interestRateIn is a double
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
   /**
   * isAmountValid will check is amount is valid.
   * @return returns if the amount is valid
   * @param amount takes an amount
   */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
   * isInDebt will check if you're in debt.
   * @return returns if you're in debt
   * @param loan takes an object of bankloan
   */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
   * resetLoansCreated will reset the loans.
   * static because only accesses loansCreated
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
   /**
   * getLoansCreated will return the loans created.
   * static because only accesses loansCreated
   * @return loansCreated returns loans created
   */
   public static int getLoansCreated() {
      return loansCreated;
   }

   /**
   * borrowFromBank will return if a loan was made.
   * @return wasLoanMade returns loans made
   * @param amount takes in a double parameter
   */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
      
      return wasLoanMade;
   }

   /**    
   * payBank will return amount paid to bank.
   * @return returns loans created
   * @param amountPaid takes a double parameter
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   * getBalance will record the balance.
   * @return balance returns the balance
   */
   public double getBalance() {
      return balance;
   }
   
   /**
   * setInterestRate will set the interest rate.
   * @return returns if the interestRate is valid
   * @param interestRateIn takes an interest rate
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * getInterestRate will get the interest rate.
   * @return interestRate returns the balance
   */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   * chargeInterest will add interest amount.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   * toString returns the string representation.
   * of the method
   * @return output returns the output
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
