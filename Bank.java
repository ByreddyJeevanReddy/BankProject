import java.util.ArrayList;

public class Bank implements BankOperations {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    // Open Account
    public void openAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account opened successfully.");
    }

    // Close Account
    public void closeAccount(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    // Deposit
    public void deposit(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw
    public void withdraw(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display Accounts
    public void displayAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account);
            System.out.println("-------------");
        }
    }

    // Find Account Helper Method
    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
