package enhanced;
import java.security.SecureRandom;

public class EnhancedForLoop {

	public static void main(String[] args) {
		

		int[] array = new int[20];
		int sum = 0;

		SecureRandom random = new SecureRandom();

		for (int counter : array) {
			array[counter] = 1 + random.nextInt(20);
			if (array[counter] % 2 == 0 && array[counter] != 20) {
				sum += array[counter];
			}
			System.out.printf("%d%s", array[counter], " ");

		}
		System.out.printf("%n The sum of the even numbers generated is: %d", sum);
	}

}
