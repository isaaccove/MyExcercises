package Compare;

/* The framework class of a program that checks two inputed numbers to see which of them is the maximum
number*/
public class Comparison {
	// Declaring the instance variables.
	private int firstNumber;
	private int secondNumber;
	
	
	/*Declaring a default constructor just in case we don't intend to set a
	  parameter to it.*/
		public Comparison() {
		 
	}
	// Declaring a constructor to set for an instance that takes two parameters.
	public Comparison(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		
	}
	// Declaring a constructor to set for a single parameter instance.
	public Comparison(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int  getFirstNumber() {
		return firstNumber;
	}
	public int  getSecondNumber() {
		return secondNumber;
	}
	
	// Declaring the method that compares both numbers.
	public int compare(int x, int y) {
		 firstNumber = x;
		secondNumber = y;
		
		int max = 0;// Initializing the value of max to zero.
	
		
		if(x > y) {
			
			max = x;
		}
		else {
			
			max = y;
		}
		return max;
		
		
		}
		public int compareAndEquals(int x, int y) {
			int max = 0;
			if(x > y) {
				max = x;
			}
			if(y > x) {
				max = y;
			}
			else {
				max = max;
			}
			return max;
		}
}
