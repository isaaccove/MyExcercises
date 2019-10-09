package salary;
import java.util.Scanner;

public class SalaryCalculatorTest {
	
	
	 
	
	 
	  public static void main( String[] args )
	    {   Scanner input = new Scanner( System.in );
	     
	        SalaryCalculator employee1 = new SalaryCalculator();
	        SalaryCalculator employee2 = new SalaryCalculator();
	        SalaryCalculator employee3 = new SalaryCalculator();
	         
	        // Employee 1
	        System.out.print( "Enter the employee1 name: " );
	        String name1 = input.nextLine();
	        employee1.setEmployeeName( name1 );
	         
	        System.out.print( "Enter the hours worked for this employee: ");
	        int hours1 = input.nextInt();
	         
	        System.out.print( "Enter the hourly rate for this employee: ");
	        double rate1 = input.nextDouble();
	         
	        employee1.calculatePay( hours1, rate1 );
	        employee1.displayEmployee();
	         
	        System.out.println();
	         
	        // Employee 2
	        System.out.print( "Enter the employee2 name: \n");
	        String name2 = input.next();
	        employee2.setEmployeeName( name2 );
	         
	        System.out.print( "Enter the hours worked for this employee: ");
	        int hours2 = input.nextInt();
	         
	        System.out.println( "Enter the hourly rate for this employee: ");
	        double rate2 = input.nextDouble();
	         
	        employee2.calculatePay( hours2, rate2 );
	        employee2.displayEmployee();
	        
	        
	     // Employee 3
	        System.out.print( "Enter the employee3 name: \n");
	        String name3 = input.next();
	        employee3.setEmployeeName( name3 );
	         
	        System.out.print( "Enter the hours worked for this employee: ");
	        int hours3 = input.nextInt();
	         
	        System.out.println( "Enter the hourly rate for this employee: ");
	        double rate3 = input.nextDouble();
	         
	        employee3.calculatePay( hours2, rate2 );
	        employee3.displayEmployee();
	 
	 
	    }
	}


