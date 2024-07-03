import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Bank Account Management System");
            System.out.println("1. Open Account");
            System.out.println("2. Close Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Account Number: ");
                        String accountNumber = scanner.nextLine();
                        System.out.print("Enter Account Holder Name: ");
                        String accountHolderName = scanner.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double initialBalance = scanner.nextDouble();

                        break;
                    case 2:
                        System.out.print("Enter Account Number: ");
                        accountNumber = scanner.nextLine();
                        bank.closeAccount(accountNumber);
                        break;
                    case 3:
                        System.out.print("Enter Account Number: ");
                        accountNumber = scanner.nextLine();
                        System.out.print("Enter Deposit Amount: ");
                        double depositAmount = scanner.nextDouble();
                        bank.deposit(accountNumber, depositAmount);
                        break;
                    case 4:
                        System.out.print("Enter Account Number: ");
                        accountNumber = scanner.nextLine();
                        System.out.print("Enter Withdrawal Amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        bank.withdraw(accountNumber, withdrawAmount);
                        break;
                    case 5:
                        bank.displayAccounts();
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}

