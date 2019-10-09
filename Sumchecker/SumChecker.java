package Sumchecker;

import java.util.Scanner;
public class SumChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNumber = (int) (Math.random() * 10);
		int secondNumber = (int) (Math.random() * 10);
		int sum = firstNumber + secondNumber;
		System.out.printf("what is the sum of %d and %d ?:  ", firstNumber, secondNumber);
		//System.out.println("User enter your answer's value ");
		int value = input.nextInt();
		
		if(sum == value) {
			System.out.printf("input correct! answer is: %d%n ", sum);
		}
		if(sum != value) {
			System.out.printf("incorrect input, try again %d%n", value);
		}
	}

}

