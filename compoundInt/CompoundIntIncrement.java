package compoundInt;
import java.util.Scanner;
public class CompoundIntIncrement {
	
	
	public void cal() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Principal: ");
	int principal = input.nextInt();
	System.out.print("Enter the Year: ");
	int year = input.nextInt();
	
	for(int rate = 5; rate <=10; rate++ ) {
		double amount = principal * Math.pow(1.0 + rate, year);
		System.out.printf("The compound interest: %.2f%n",  amount);
	}
	
	
	}
}