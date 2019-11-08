import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();
		int[] dieRoll = new int[7];
		String x = "Thanks for using My App: Don't forget to put money in the bank";

		for (int roll = 1; roll <= 6000000; roll++)
			++dieRoll[1 + randomNumbers.nextInt(6)];
		System.out.printf("%s%15s%n", "Face:", "Frequency:");

		for (int face = 1; face < dieRoll.length; face++) {
			System.out.printf("%4d.%15d%n", face, dieRoll[face]);
		}
		System.out.println();
		System.out.printf("%s", x);
		
	}
}