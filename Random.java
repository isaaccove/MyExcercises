import java.util.Scanner;
public class Random{
public static void main(String[] args){
	
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);
	int number3 = (int)(Math.random() * 10);

	System.out.println(number1 + number2 + number3);

	Scanner input = new Scanner(System.in);
	System.out.println("What is the sum of this?"); 
	
	int answer = input.nextInt();
	
	int addition = number1 + number2 + number3;
	if(addition == answer){
	System.out.println("You are Correct");
}

	if(addition != answer){
	System.out.println("Oops!.You are Wrong");
	System.out.println(number1 + "+" + number2 + "+" + number3 + "should be:" + (number1 + number2 + number3));
}	

}
}	