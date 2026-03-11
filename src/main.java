import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n=== Banking System ===");
            System.out.println("1 - Create Account");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Show Accounts");
            System.out.println("5 - Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = scanner.nextLine();

                    System.out.print("Initial deposit: ");
                    double balance = scanner.nextDouble();

                    bank.createAccount(name, balance);
                    break;

                case 2:
                    System.out.print("Account holder name: ");
                    name = scanner.nextLine();

                    Account accDeposit = bank.findAccount(name);

                    if (accDeposit != null) {
                        System.out.print("Deposit amount: ");
                        double amount = scanner.nextDouble();
                        accDeposit.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Account holder name: ");
                    name = scanner.nextLine();

                    Account accWithdraw = bank.findAccount(name);

                    if (accWithdraw != null) {
                        System.out.print("Withdrawal amount: ");
                        double amount = scanner.nextDouble();
                        accWithdraw.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    bank.showAccounts();
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
