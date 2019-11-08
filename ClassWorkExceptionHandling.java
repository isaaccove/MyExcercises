import java.util.Scanner;

public class ClassWorkExceptionHandling {
	private int operand1;
	private int operand2;
	private int operator;
	private int result;
	private int[] array = new int[40];
	private int counter = 0;

	private static Scanner input = new Scanner(System.in);

	public void promptUser() {
		System.out.print("Enter operand 1: ");
		operand1 = input.nextInt();
		System.out.print("Enter operand 2: ");
		operand2 = input.nextInt();
		System.out.print("Enter operator: ");
		operator = (int) input.next().charAt(0);
	}

	public void getResult() {
		switch (operator) {
		case 43:
			result = (int) operand1 + (int) operand2;
			fillArray();
			break;
		case 45:
			result = (int) operand1 - (int) operand2;
			fillArray();
			break;
		case 42:
			result = (int) operand1 * (int) operand2;
			fillArray();
			break;
		case 47:
			try {
				result = (int) operand1 / (int) operand2;
				fillArray();
			} catch (ArithmeticException e) {
				System.out.println("Dont do it");
			}
			break;
		case 37:
			result = (int) operand1 % (int) operand2;
			fillArray();
			break;
		case 94:
			result = (int) Math.pow((double) operand1, (double) operand2);
			fillArray();
			break;
		}
	} 

	public void fillArray() {
		array[counter] = operand1;
		counter++;
		array[counter] = operand2;
		counter++;
		array[counter] = operator;
		counter++;
		array[counter] = result;
		counter++;
	}

	public void displayArray() {

		int counter = 1;
		int i = 0;
		int operatorCount = 2;

		while (i < array.length) {

			if (i == operatorCount) {
				System.out.print((char) array[i] + "   \t   ");
				operatorCount += 4;
			} else {
				System.out.printf("    " + array[i] + "  \t   ");
			}

			if (counter % 4 == 0) {
				System.out.println();
			}

			counter++;
			i++;

		}

	}

	public void start() {
		int i = 0;
		while (i < 3) {
			promptUser();
			getResult();
			i++;
		}
		System.out.printf("%10s%10s%10s%10s%n", "Operand1", "Operand2", "    Operator", "      Result");
		displayArray();
	}

}
