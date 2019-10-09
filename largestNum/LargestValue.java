package largestNum;

import java.util.Scanner; //scanner class import declaration
	public class LargestValue{
	public void determineLargestValue(){
		Scanner input = new Scanner(System.in);

		int intCounter = 0;
		int total = 0;
		int number = 0;
		int largest;

		System.out.println("Enter number: ");
		largest = input.nextInt();

		total += largest;

		while (intCounter < 9){
			System.out.println("Enter number: ");
			number = input.nextInt();
			if(number > largest){
				largest = number;
			}
			total += number;
			intCounter++;


		}
		System.out.printf("The total is : %d\n", total);
		System.out.printf("\nThe largest of all 10 integers is: %d\n", largest, number);

	}


}






