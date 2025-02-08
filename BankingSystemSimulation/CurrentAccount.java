
public class CurrentAccount extends BankAccount{
	private double overdraftLimit;
	
	public CurrentAccount(double balance, String accountNumber, String accountHolderName, double 		overdraftLimit){
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
	}	

	public void withdraw(double amount){
		if(amount > overdraftLimit){
			super.withdraw(amount);
		}
		else {
			System.out.println("Overdraft Limit exceeded!");
		}
	}
	
}
