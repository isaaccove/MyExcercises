package parking;

import java.util.Scanner;

public class ParkingCharges {

	double minimumCharge = 2;
	double additionalCharge = 0.50;
	int minimumHour = 3;
	double yesterdayChargeGreater;
	double yesterdayChargeLower;
	double todayChargeGreater;
	double todayChargeLower;

	Scanner input = new Scanner(System.in);

	public void calculateCharges() {
		// charges for yesterday
		System.out.println("Enter the number of hours for yesterday:");
		int yesterdayHours = input.nextInt();
		if (yesterdayHours > 3) {
			yesterdayChargeGreater = minimumCharge + ((yesterdayHours - minimumHour) * 0.5);
			System.out.printf("Your charge for %d hours yesterday is %.2f\n", yesterdayHours, yesterdayChargeGreater);

		} else {
			yesterdayChargeLower = (yesterdayHours * minimumCharge) / minimumHour;
			System.out.printf("Your charge for %d hours yesterday is %.2f\n", yesterdayHours, yesterdayChargeLower);
		}
			// charges for today
			System.out.println("Enter the number of hours for today:");
			int todayHours = input.nextInt();
			if (todayHours > 3) {
				todayChargeGreater = minimumCharge + ((todayHours - minimumHour) * 0.5);
				System.out.printf("Your charge for %d hours today is %.2f\n", todayHours, todayChargeGreater);

			} else {
				todayChargeLower = (todayHours * minimumCharge) / minimumHour;
				System.out.printf("Your charge for %d hours today is %.2f\n", todayHours, todayChargeLower);
			
			}

	
			
				
		}
	}

	
