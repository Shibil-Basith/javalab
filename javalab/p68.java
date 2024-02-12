import java.util.*;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0 || amount > balance) {
            throw new InvalidAmountException("Invalid withdrawal amount for account holder " + accountHolder);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class p68 {
    public static void main(String[] args) {
        String name;
        int balance, withdrawalAmount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of account holder: ");
        name = input.nextLine();
        System.out.println("Enter balance amount: ");
        balance = input.nextInt();
        BankAccount account = new BankAccount(name, balance);
        System.out.println("Enter amount to withdraw: ");
        withdrawalAmount = input.nextInt();

        try {
            account.withdraw(withdrawalAmount);

        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
