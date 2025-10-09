class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Not enough balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: Rs. " + balance);
    }
}

public class lab6_ExceptionHandling {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000); // Initial balance

        try {
            account.withdraw(5000);  // Works
            account.withdraw(7000);  // Throws exception
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction finished. Balance: Rs. " + account.balance);
        }
    }
}
