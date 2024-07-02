public class Bank implements BankAccount{
    import java.util.ArrayList;
import java.util.List;

    public class Bank implements BankOperations {
        private List<BankAccount> accounts;

        public Bank() {
            accounts = new ArrayList<>();
        }

        @Override
        public void openAccount(String accountNumber, String accountHolderName, double initialBalance) {
            BankAccount newAccount = new BankAccount(accountNumber, accountHolderName, initialBalance);
            accounts.add(newAccount);
            System.out.println("Account opened successfully.");
        }

        @Override
        public void closeAccount(String accountNumber) {
            BankAccount accountToRemove = null;
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    accountToRemove = account;
                    break;
                }
            }
            if (accountToRemove != null) {
                accounts.remove(accountToRemove);
                System.out.println("Account closed successfully.");
            } else {
                System.out.println("Account not found.");
            }
        }

        @Override
        public void deposit(String accountNumber, double amount) {
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    account.deposit(amount);
                    return;
                }
            }
            System.out.println("Account not found.");
        }

        @Override
        public void withdraw(String accountNumber, double amount) {
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    account.withdraw(amount);
                    return;
                }
            }
            System.out.println("Account not found.");
        }

        @Override
        public void displayAccounts() {
            if (accounts.isEmpty()) {
                System.out.println("No accounts to display.");
            } else {
                for (BankAccount account : accounts) {
                    System.out.println(account);
                }
            }
    }
}
