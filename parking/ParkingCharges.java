package parking;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParkingCharges {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("$##.00");

		System.out.println("Enter the number of cars parked yesterday: ");
		final int numberOfCars = input.nextInt();

		double hoursParked = 0;
		double currentCost = 0;
		double totalCost = 0;

		for (int count = 1; count <= numberOfCars; count++) {
			System.out.println("Enter hours parked for car " + count + ": ");
			hoursParked = input.nextDouble();
			currentCost = calculateCharges(hoursParked); // most recent customer
			totalCost += currentCost; // Running total
		}

		System.out.println("Most recent customer paid: " + formatter.format(currentCost));
		System.out.println("Running total of receipts: " + formatter.format(totalCost));

	}

	public static double calculateCharges(double numHours) {

		double garageCost = 0;

		if (numHours <= 3)
			garageCost = 2;

		else if (numHours > 3 && numHours <= 19)
			garageCost = 2.0 + 0.5 * (numHours - 3);

		else if (numHours > 19)
			garageCost = 10;

		return garageCost;
	}

}

//}  class ParkingCharges

//	double minimumCharge = 2;
//	double additionalCharge = 0.50;
//	int minimumHour = 3;
//	double yesterdayChargeGreater;
//	double yesterdayChargeLower;
//	double todayChargeGreater;
//	double todayChargeLower;
//
//	Scanner input = new Scanner(System.in);
//
//	public void calculateCharges() {
//		// charges for yesterday
//		System.out.println("Enter the number of hours for yesterday:");
//		int yesterdayHours = input.nextInt();
//		if (yesterdayHours > 3) {
//			yesterdayChargeGreater = minimumCharge + ((yesterdayHours - minimumHour) * 0.5);
//			System.out.printf("Your charge for %d hours yesterday is %.2f\n", yesterdayHours, yesterdayChargeGreater);
//
//		} else {
//			yesterdayChargeLower = (yesterdayHours * minimumCharge) / minimumHour;
//			System.out.printf("Your charge for %d hours yesterday is %.2f\n", yesterdayHours, yesterdayChargeLower);
//		}
//			// charges for today
//			System.out.println("Enter the number of hours for today:");
//			int todayHours = input.nextInt();
//			if (todayHours > 3) {
//				todayChargeGreater = minimumCharge + ((todayHours - minimumHour) * 0.5);
//				System.out.printf("Your charge for %d hours today is %.2f\n", todayHours, todayChargeGreater);
//
//			} else {
//				todayChargeLower = (todayHours * minimumCharge) / minimumHour;
//				System.out.printf("Your charge for %d hours today is %.2f\n", todayHours, todayChargeLower);
//			
//			}
//
//	
//			
//				
//		}
//}
