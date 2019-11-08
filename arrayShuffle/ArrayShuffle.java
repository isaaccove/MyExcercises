package arrayShuffle;

import java.security.SecureRandom;


public class ArrayShuffle {
	public static void main(String[] args) {
	
	//public void shuffleArray() {
	SecureRandom input = new SecureRandom();
	int random = input.nextInt(20);
	int [] randomArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	int radomizer1 = input.nextInt(20);
	int radomizer2 = input.nextInt(20);
	
	for(int i =0; i<randomArray.length; i++) {
		if(radomizer1 == radomizer2) {
			
		}
		
	}
	
	

	
	}
	
}

// shuffle method
//	static void shuffleArray(int[] ar) {
//		Random rnd = ThreadLocalRandom.current();
//		for (int i = ar.length-1  ; i > 0; i--) {
//			int index = rnd.nextInt(i + 1);
//			int a = ar[index];
//			ar[index] = ar[i];
//			ar[i] = a;
//		}
//	}
//}
