import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Open Account");
            System.out.println("2. Close Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accHolder = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initBalance = scanner.nextDouble();
                    bank.openAccount(new BankAccount(accNumber, accHolder, initBalance));
                    break;
                case 2:
                    System.out.print("Enter account number to close: ");
                    String closeAccNumber = scanner.nextLine();
                    bank.closeAccount(closeAccNumber);
                    break;
                case 3:
                    System.out.print("Enter account number to deposit: ");
                    String depositAccNumber = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAccNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("Enter account number to withdraw: ");
                    String withdrawAccNumber = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAccNumber, withdrawAmount);
                    break;
                case 5:
                    bank.displayAccounts();
                    break;
                case 6:
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


