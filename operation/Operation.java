package operation;
import java.util.Scanner;
public class Operation {
	
	public double OperatorCal() {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the FirstNumber: ");
	int firstNumber = input.nextInt();
	System.out.println("Enter the SecondNumber: ");
	int secondNumber = input.nextInt();
	System.out.println("Enter the Operator: ");
	String operator = input.next();
	
	double addition = firstNumber + secondNumber;
	double subtraction = firstNumber - secondNumber;
	double multiplication = firstNumber * secondNumber;
	double division = firstNumber / secondNumber;
	
    switch (operator) {
    case "+":
    	System.out.printf("The sum of %d and %d is %.0f", firstNumber, secondNumber, addition);
    	break;
    
    case "-":
    	System.out.printf("The subtraction of %d and %d is %.0f", firstNumber, secondNumber, subtraction);
    	break;
    
    case "*":
    	System.out.printf("The multiplication of %d and %d is %.0f", firstNumber, secondNumber, multiplication);
    	break;
    
    case "/":
    	System.out.printf("The division of %d and %d is %.0f", firstNumber, secondNumber, division);
    	break;
    
    }
	return 0;
}
}
