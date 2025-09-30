package Oops.Encapsulation_Polymorphism_AbstractClass;

// Loanable interface
interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

// Abstract BankAccount class
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation (Getters & Setters)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; // 4% annual interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // Savings accounts allow loans if balance is > 5000
        return getBalance() > 5000 && amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // up to 2x the balance
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount {
    private double interestRate = 0.02; // 2% annual interest

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // Current accounts allow loans if balance is > 10000
        return getBalance() > 10000 && amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3; // up to 3x the balance
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV123", "Alice", 8000);
        BankAccount acc2 = new CurrentAccount("CUR456", "Bob", 15000);

        BankAccount[] accounts = { acc1, acc2 };

        // Polymorphism: process all accounts
        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());

            // Deposit & withdraw demo
            acc.deposit(2000);
            acc.withdraw(3000);

            // Loan check
            double loanAmount = 20000;
            if (acc.applyForLoan(loanAmount)) {
                System.out.println(acc.getHolderName() + " is eligible for loan of " + loanAmount);
            } else {
                System.out.println(acc.getHolderName() + " is NOT eligible for loan of " + loanAmount);
            }

            System.out.println("Max Loan Eligibility: " + acc.calculateLoanEligibility());
            System.out.println("----------------------------------");
        }
    }
}

