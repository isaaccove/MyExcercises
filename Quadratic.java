import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        
	System.out.println("Input a:");
	double a = input.nextDouble();

	System.out.println("Input b:");
	double b = input.nextDouble();

	System.out.println("Input c:");
	double c = input.nextDouble();

	double root1;
	double root2;
        double determinant = b * b - 4 * a * c;
        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.printf("The equation has one root %.2f;", root1);
        }
        // If roots are not real
        else {
            double realvalue = -b / (2 *a);
            double imaginaryvalue = Math.sqrt(-determinant) / (2 * a);
System.out.format("root1 = %.2f+%.2f and root2 = %.2f-%.2f", realvalue, imaginaryvalue, realvalue, imaginaryvalue);
        }
    }
}