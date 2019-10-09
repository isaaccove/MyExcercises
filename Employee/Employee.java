package Employee;

public class Employee {
	
	private String firstName;
	private String lastname;
	private double salary;
	
	public Employee(String name, String surname, double pay) {
		this.firstName = name;
		this.lastname = surname;
		this.salary = pay;
	
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String surname) {
		this.lastname = surname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int pay) {
		this.salary = pay;
	}
	
	public double getYearlySalary() {
		double YearlySalary = getSalary() * 12;
		if(salary < 0) {
		this.salary =0;
	}
	return YearlySalary;
	
	}
	
	public double getIncreasedSalary() {
		double IncreasedSalary = 1.1 * getSalary();
		return IncreasedSalary;
	}
		
		
	}
