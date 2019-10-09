package summation;

import javax.swing.JOptionPane;

public class SumMulDiv {

	
		public void cal() {
		double firstNumber, secondNumber, sum, sub, mult, div;
		
		firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the First value"));
		secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Second value"));
		String operator = (JOptionPane.showInputDialog("Please Enter the Operator"));
		
		
		 sum = firstNumber + secondNumber; 
		 sub = firstNumber - secondNumber;
		 mult = firstNumber * secondNumber;
		 div = firstNumber / secondNumber;
		String kk = "PLEASE PUT MONEY IN THE BANK FIRSTS!!! lolZZZZZ";
		
		switch (operator) {
		
		case "+":
			JOptionPane.showMessageDialog(null, "The Addition of this number is: " + sum );
			break;
		
		case "-":
			JOptionPane.showMessageDialog(null, "The Subtraction of this number is: " + sub );
			break;
			
		case "*":
			JOptionPane.showMessageDialog(null, "The Multplication of this number is: " + mult );
			break;
			
		case "/":
			JOptionPane.showMessageDialog(null, "The Division of this number is: " + div );
			break;
			
			default:
			JOptionPane.showMessageDialog(null, "PLEASE ENTER A VALID OPEARTOR");
			break;
			
		}
		
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "Thank you for using COVE BABA's application: " + kk);
		

	}

}
