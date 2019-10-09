package Compare;

public class ComparisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Declaring a for loop.	
		System.out.println("\tSerial Number"\t"Name");
		for(int i = 1; i < 41; i++ ) {
			System.out.printf("%d.  %s%n",i, "Isaac");
		}*/
	// an illustration of how a while loop is to be declared.
	//int i = 1;
	//while(i < 41) {
		//System.out.println(i + "\t" +".Isaac");
		//i++;
	//}
		 
		Comparison numbers = new Comparison();
		Comparison Kunle = new Comparison(3, 4);
		Comparison Isaac = new Comparison(4, 6);
		
		System.out.println(Kunle.compare(Kunle.getFirstNumber(), Kunle.getSecondNumber()));
		System.out.println(Isaac.compare(Isaac.getFirstNumber(), Isaac.getSecondNumber()));
		
 }

}



