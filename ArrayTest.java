
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] test = new int[10];
//		System.out.print("Index\t Value\n");
//		for (int i = 0; i < test.length; i++) {
//			System.out.printf("%d%11d%n", i, test[i]);
//
//		}
//
//		 }

		int[] test = new int[10];
		System.out.print("Index\t Value\n");
		for (int i = 0; i < test.length; i++) {
			test[i] = 9 - i;
			System.out.printf("%d%11d%n", i, test[i]);
		}
	}
}