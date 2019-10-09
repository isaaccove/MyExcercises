package compoundInterest; 
import java.util.Scanner;
public class CompoundInterest {

	public double CalculateInterest() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		double principal = input.nextDouble();
		System.out.print("Enter Year: ");
		int year = input.nextInt();
		
		double rate = 0.05;
		double amount;
		
		for(int i = 1; i<=year; i++) {
			amount = principal * (i + rate);
			principal = amount;
		}
		return principal;
	}
	
}
