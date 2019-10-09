package GasMileage;

import java.util.Scanner;

public class Mileage {
 
    
 public double mileageCal() {
        int miles;  
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;
 
        Scanner input = new Scanner(System.in); 
 
        System.out.println("This Application Determines Miles covered and Gallon used\n");
 
        System.out.println("\nEnter miles driven or -1 to Quit: ");
        miles = input.nextInt();
         
        while (miles != -1 ) {            
            System.out.println("Enter gallons used: ");
            gallons = input.nextInt();
            System.out.println("\nMiles driven for this trip: " + miles);
            System.out.println("Gallons used for this trip: " + gallons);
            totalMiles += miles;
            totalGallons += gallons;
            System.out.printf("\nMiles per gallon for this trip: %.2f\nCombined Miles "
                    + "per gallon: %.2f\n",(double)miles/gallons, (double)totalMiles/totalGallons);
             
            System.out.println("\nEnter miles driven or -1 to Quit: ");
            miles = input.nextInt();
        }
        System.out.println();
		return 0;
    }  

}

