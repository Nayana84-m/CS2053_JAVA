// Lab Session 4: Polymorphism and Abstract Classes
// Demonstrates Account -> SavingsAccount / CurrentAccount hierarchy

// Abstract class
abstract class Account {
    String accountHolder;
    double balance;

    // Constructor
    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method (no body)
    abstract void calculateInterest();

    // Concrete method (common to all)
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
}

// Subclass 1 - Savings Account
class SavingsAccount extends Account {
    double interestRate = 0.04; // 4%

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Savings Account Interest: Rs." + interest);
    }
}

// Subclass 2 - Current Account
class CurrentAccount extends Account {
    double serviceCharge = 100; // flat service charge

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account. Service charge: ₹" + serviceCharge);
    }
}

// Main class
public class lab4Polymorphism {
    public static void main(String[] args) {
        // Using polymorphism (reference of parent, object of child)
        Account acc1 = new SavingsAccount("Nayana", 10000);
        Account acc2 = new CurrentAccount("Maya", 20000);

        // Display details and call methods dynamically
        acc1.displayDetails();
        acc1.calculateInterest();
        System.out.println();

        acc2.displayDetails();
        acc2.calculateInterest();
    }
}
