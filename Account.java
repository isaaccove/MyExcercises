
public class Account {
	private String name;
	private double bvn;
	private String accountType;
	private double balance;
	private boolean isActive;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBvn() {
		return bvn;
	}
	public void setBvn(double bvn) {
		this.bvn = bvn;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public double credit(double value){
		double deduction = 0.05 * value;
		double result = value - deduction;
		return result;
	}
		public double deduct(double value) {
		double finalValue = 0;
		double deduction = 0.05 * value;
		double balance = value - deduction;
		if (balance <= 10000);{
			finalValue = balance;
		}
	if(balance > 10000) {
		finalValue = balance;
	}
	return finalValue;
	}
}
