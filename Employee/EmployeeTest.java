package Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee kunle = new Employee("Isaac", "Olowofila", 50_000);
		Employee seun = new Employee("Seun", "Oluwole", 40_000);
		
		double amount = kunle.getSalary();
		System.out.printf("Kunle's Salary Amount is: %s%n", amount);
		
		double value = seun.getSalary();
		System.out.printf("Seun's Salary Amount is: %s%n", value);
		
		double increment = kunle.getIncreasedSalary();
		System.out.printf("Kunle's Increased Salary Amount is: %.7s%n", increment);
		
		double increase = seun.getIncreasedSalary();
		System.out.printf("Seun's Increased Salary Amount is: %s", increase);
	}

}
