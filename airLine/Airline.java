package airLine;

import java.util.Scanner;

public class Airline {

	// Array of seats
	boolean[] flightSeats = new boolean[11];
	Scanner input = new Scanner(System.in);

	public void start() {
		while (true) {
			bookSeat();
		}
	}

	// Method for booking a seat
	public void bookSeat() {
		System.out.println("Type '1' for First Class or '2' for Economy Class:");
		int passengerClass = input.nextInt();
		if (passengerClass == 1) {
			firstClassBooking();
		} else {
			economyClassBooking();
		}
		
	}

	
	// Check and book for first class seating
	public void firstClassBooking() {
		for (int i = 1; i <= 5; i++) {
			// check if seat is available to allocate to user booking.
			if (flightSeats[i] == false) {
				// book seat
				flightSeats[i] = true;
				System.out.printf("First Class Seat Booking: Seat %d\n", i);
				break;
			} else if (flightSeats[5] == true) {
				if (flightSeats[10] == true) {
					// if both classes are fully booked
					System.out.println("Sorry! Next flight leaves in '3' hours.");
				} else {
					// provide passenger another available class option
					System.out.println("Sorry,First Class bookings are over. Would you like to opt for Economy class ? select '1' for Yes and '2' for No");
					int selection = input.nextInt();
					if (selection == 1) {
						economyClassBooking();
						start();
					} else {
						System.out.println("Next flight leaves in '3' hours.");
						System.exit(0);
					}
				}
			}
		}
	}

	// Check and book for economy class seating
	public void economyClassBooking() // assign an economy seat
	{
		for (int i = 6; i <= 10; i++) {
			if (flightSeats[i] == false) {
				flightSeats[i] = true;
				System.out.printf("economy class seat booking: Seat %d\n", i);
				break;
			} else if (flightSeats[10] == true) {
				if (flightSeats[5] == true) {
					System.out.println("Next flight leaves in '3' hours.");

				} else {
					System.out.println("Sorry, Economy Class seat bookings are over. Would you like to opt for first Class seat? press '1' for Yes and '2' for No");
					int selection = input.nextInt();
					if (selection == 1) {
						firstClassBooking();
						start();
					} else {
						System.out.println("Next flight leaves in 3 hours");

					}
				}
			}
		}
	}

}
