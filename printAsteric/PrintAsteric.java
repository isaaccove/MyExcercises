package printAsteric;

import java.util.Scanner;
public class PrintAsteric {
public static void main(String[] args){   

	int num1, num2, num3, num4, num5;
  
  
   Scanner input = new Scanner(System.in);
   System.out.println("Enter an integer (1-30): ");
   num1 = input.nextInt();
   System.out.println("Enter an integer (1-30): ");
       num2= input.nextInt();
   System.out.println("Enter an integer (1-30): ");
       num3= input.nextInt();
   System.out.println("Enter an integer (1-30): ");
       num4= input.nextInt();
   System.out.println("Enter an integer (1-30): ");
	num5= input.nextInt();
  

for(int j=1;j<=num1; j++){
System.out.print("*");
  
}
System.out.println();
   for(int j=1;j<=num2; j++){
System.out.print("*");
  
}
   System.out.println();
   for(int j=1;j<=num3; j++){
System.out.print("*");
  
}
   System.out.println();
   for(int j=1;j<=num4; j++){
System.out.print("*");
  
}
   System.out.println();
   for(int j=1;j<=num5; j++){
System.out.print("*");
  
}
           System.out.println();
  

  
}
}