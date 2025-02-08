import java.util.ArrayList; 

public class Bank{
	private ArrayList<BankAccount> accounts;
	
	public Bank(){
		this.accounts = new ArrayList<>();
	}

	public void createBankAccount(BankAccount account){
		this.accounts.add(account);
	}
	
	public void findAccount(String accountNumber){
		for(BankAccount account: accounts){
			if(account.getAccountNumber() == accountNumber){	
				account.displayAccountInfo();
			}
			else{
				System.out.println("Account Not Found!");
			}
		}
	}	

	public void listAllAccounts(){
		for(BankAccount account: accounts){
			account.displayAccountInfo();
			System.out.println("\n\n");
		}
	}
	
}

