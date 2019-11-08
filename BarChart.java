
public class BarChart {

	public static void main(String[] args) {

		String x = "Thanks for using COVE's APP: Make sure you come back next time & put money in the bank!";
		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

		System.out.println(" Grade distribution:");

		for (int counter = 0; counter < array.length; counter++) {

			if (counter == 10)
				System.out.printf("%8d: ", 100);
			else
				System.out.printf(" %02d - %02d: ", counter * 10, (counter * 10) + 9);

			for (int asterisk = 0; asterisk < array[counter]; asterisk++) 
				System.out.print("*");

				System.out.println();

			}
			System.out.println();
			System.out.printf("%s", x);
		}
	}
