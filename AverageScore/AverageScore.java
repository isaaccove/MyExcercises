package AverageScore;

import java.util.Scanner;
public class AverageScore {
	//private double score;
	
	public double average() {
		int counter = 0;
		double score = 0.0;
		double total = 0.0;
		double average = 0.0;
		int student = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		counter = input.nextInt();
		while(counter>0) {
			System.out.println("Enter score: ");
			score = input.nextDouble();
			total = total + score; 
			counter--;
			student++;
		}
		average = total / student;
		return average;
		
	}
}

