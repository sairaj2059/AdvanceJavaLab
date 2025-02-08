public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        BankAccount bankAccount1 = new BankAccount("BA201", "Raj Guragain", 5000.0);
        BankAccount bankAccount2 = new BankAccount("BA202", "Amit Sharma", 2000.0);
        
        CurrentAccount currentAccount1 = new CurrentAccount(3000.0, "CA201", "Nina Kumari", 1000.0);
        
        SavingsAccount savingsAccount1 = new SavingsAccount(5.0, 1500.0, "SA201", "Maya Rai");

        bank.createBankAccount(bankAccount1);
        bank.createBankAccount(bankAccount2);
        bank.createBankAccount(currentAccount1);
        bank.createBankAccount(savingsAccount1);

        System.out.println("All Accounts:\n");
        bank.listAllAccounts();

        System.out.println("\nSearching for account with account number BA202:\n");
        bank.findAccount("BA202");

        System.out.println("\nPerforming operations on BankAccount (BA201):");
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(2000);
        bankAccount1.displayAccountInfo();

        System.out.println("\nPerforming operations on CurrentAccount (CA201):");
        currentAccount1.deposit(500); 
        currentAccount1.withdraw(1200); 
        currentAccount1.withdraw(2000);
        currentAccount1.displayAccountInfo();
        

        System.out.println("\nPerforming operations on SavingsAccount (SA201):");
        savingsAccount1.addInterest(); 
        savingsAccount1.displayAccountInfo();
    }
}
