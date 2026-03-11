import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(String name, double initialBalance) {
        Account account = new Account(name, initialBalance);
        accounts.add(account);
        System.out.println("Account created for " + name);
    }

    public void showAccounts() {
        for (Account acc : accounts) {
            System.out.println("Account Holder: " + acc.getAccountHolder());
            System.out.println("Balance: $" + acc.getBalance());
            System.out.println("---------------------");
        }
    }

    public Account findAccount(String name) {
        for (Account acc : accounts) {
            if (acc.getAccountHolder().equalsIgnoreCase(name)) {
                return acc;
            }
        }
        return null;
    }
}
