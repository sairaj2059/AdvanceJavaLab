

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(double interestRate, double balance, String accountNumber, String accountHolderName){
		super(accountNumber, accountHolderName, balance );
		this.interestRate = interestRate;
	}	
	public void addInterest(){
		double interestAmount = balance * (interestRate/100);
		balance += interestAmount;
		System.out.println("Interest Amount: " + interestAmount + "\nNew Balance: " + balance );		
	}
	
	
}
