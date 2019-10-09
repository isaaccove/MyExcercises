package commission;

import java.util.Scanner;
public class SalesCommission{
	float a;
	int n;

		public void salesPeople(){
			Scanner input =new Scanner (System.in);
			float sum = 0;
			System.out.println("How many products do you want to sell:? ");
			n=input.nextInt();
			float a[]=new float[50];
			System.out.println("Enter prices of those products: ");
			for(int i=0;i<n;i++){
				a[i]=input.nextFloat();

			}
			System.out.println("Total prices are: ");
			for(int i=0;i<n;i++){
				sum=sum+a[i];

			}

			System.out.println(sum);
			float account;
			account=((sum*9)/100)+200;
			System.out.println("Earnings of this weak is "+"$" +account);

}

}



