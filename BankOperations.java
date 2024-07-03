public interface BankOperations {
    void openAccount(BankAccount account);
    void closeAccount(String accountNumber);
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
    void displayAccounts();
}
