package Level2;
class BankAccount {
    public String accountNumber;     // public → accessible everywhere
    protected String accountHolder;  // protected → accessible in same package & subclasses
    private double balance;          // private → accessible only inside BankAccount

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds!");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass to demonstrate access
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method using public + protected members
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Number: " + accountNumber);  // public → direct access
        System.out.println("Account Holder: " + accountHolder);          // protected → direct access
        System.out.println("Balance: " + getBalance());                  // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Test class
public class Bank_account {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC1001", "Alice", 5000);
        acc1.displayAccountDetails();

        System.out.println("\nDepositing and Withdrawing...");
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.displayAccountDetails();

        System.out.println("\n--- Savings Account ---");
        SavingsAccount sav1 = new SavingsAccount("SAV2001", "Bob", 10000, 4.5);
        sav1.displaySavingsAccountDetails();
    }
}
