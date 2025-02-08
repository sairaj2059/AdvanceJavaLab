public class BankAccount{
	private String accountNumber;
	private String accountHolderName;
	protected double balance;

	public BankAccount(String accountNumber, String accountHolderName, double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	} 

	public String getAccountNumber(){
		return accountNumber;
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}

	public double getBalance(){
		return balance;
	}

	public void deposit(double amount){
		balance += amount;
	}

	public void  withdraw(double amount){
		if(balance < amount){
			System.out.println("Insufficient Balance");
			return;	
		}
		System.out.println("Amount Withdrawed: "+ amount);	
		balance -= amount;
	}

	public void displayAccountInfo(){
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Holder Name: "+ accountHolderName);
		System.out.println("Balance: "+ balance);
	}

	
}
