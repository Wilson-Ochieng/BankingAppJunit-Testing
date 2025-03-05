package demo;
import java.util.HashMap;
import java.util.Map;

public class BankService { private Map<String, BankAccount> accounts;

    public BankService() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account already exists.");
        }
        accounts.put(accountNumber, new BankAccount(accountNumber, initialBalance));
    }

    public double getBalance(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account does not exist.");
        }
        return account.getBalance();
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account does not exist.");
        }
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account does not exist.");
        }
        account.withdraw(amount);
    }
}