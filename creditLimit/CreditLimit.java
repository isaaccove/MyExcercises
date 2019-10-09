package creditLimit;
import java.util.Scanner;
public class CreditLimit {
	
	public double creditCal() {
	        int accountNumber;  // stores the account number of the customer
	        int balance;  // stores the balance of the customer at the beginning of the month
	        int totalItems; // stores the total of all items charged by the customer this month 
	        int totalCredits;  // stores the total of all credits applied to the customer’s account this month
	        int allowedCreditLimit;  // stores the allowed credit limit of the customer
	 
	        Scanner input = new Scanner(System.in); //create scanner object for collecting input from user
	 
	        System.out.println("This App. Determines an Exceeding credit limit of staff\n");
	 
	        System.out.println("Enter \"CUSTOMER ACCOUNT NUMBER\": ");
	        accountNumber = input.nextInt();
	 
	        System.out.println();
	 
	        System.out.println("Enter \"CUSTOMER BALANCE\" at the  beginning of the month: ");
	        balance = input.nextInt();
	 
	        System.out.println();
	 
	        System.out.println("Enter \"TOTAL OF ALL ITEMS CHARGED\" by the Customer this month: ");
	        totalItems = input.nextInt();
	 
	        System.out.println();
	 
	        System.out.println("Enter \"TOTAL OF ALL CREDITS APPLIED\" to the Customer this month: ");
	        totalCredits = input.nextInt();
	 
	        System.out.println();
	 
	        System.out.println("Enter the \"ALLOWED CREDIT LIMIT\" of the Customer: ");
	        allowedCreditLimit = input.nextInt();
	 
	        System.out.println();
	 
	        int newBalance = balance + totalItems - totalCredits;
	 
	        System.out.println("Customer: " + accountNumber + "\n"
	                + "Balance at the beginning of the month: " + balance + "\n"
	                + "Total number of items charged this month: " + totalItems + "\n"
	                + "Total number of Credits Applied this month: " + totalCredits + "\n");
	 
	        System.out.println("The Customer's new Balance is " + newBalance);
	 
	        System.out.println();
	 
	        if (newBalance < allowedCreditLimit) {
	            System.out.println("CREDIT LIMIT EXCEEDED");
	        }
	 
	        System.out.println();
			return 0;
	    }
	
}

