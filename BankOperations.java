public class interface BankOperations {void openAccount(String accountNumber, String accountHolderName, double initialBalance);
    void closeAccount(String accountNumber);
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
    void displayAccounts();

}
