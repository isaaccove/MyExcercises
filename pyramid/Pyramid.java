package pyramid;

import java.util.Scanner;

public class Pyramid {
	// Displaying a Pyramid
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Get user input = number of lines to print in a pyramid
		System.out.println("Enter a number between 1 and 7: ");
		int numLines = input.nextInt() + 0;
		for (int row = 1; row <= numLines; row++) {
			int chk = row;
			int chk2 = 2;
			for (int col = 1; col <= numLines - row; col++) {
				System.out.print(" ");
			}
			for (int i = 0; i < (2 * row) - 1; i++) {
				if (chk < 1) {
					System.out.print(chk2++);
				} else {
					System.out.print(chk--);
				}
			}
			System.out.println();
			
		}
		System.out.println("Thank you for using COVE BABA's app:");
	}
}