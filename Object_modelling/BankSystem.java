package Object_modelling;

import java.util.ArrayList;

// Customer class
class Customer {
    private String name;
    private int customerId;
    private ArrayList<BankAccount> accounts;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    // Add account for the customer
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // View balances of all accounts
    public void viewBalance() {
        System.out.println("Customer: " + name + " (ID: " + customerId + ")");
        for (BankAccount acc : accounts) {
            System.out.println("Account No: " + acc.getAccountNumber() + 
                               ", Balance: " + acc.getBalance() +
                               ", Bank: " + acc.getBank().getBankName());
        }
        System.out.println();
    }
}

// BankAccount class
class BankAccount {
    private int accountNumber;
    private double balance;
    private Bank bank;

    public BankAccount(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

// Bank class
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    // Open account for a customer
    public void openAccount(Customer customer, int accountNumber, double initialDeposit) {
        BankAccount account = new BankAccount(accountNumber, initialDeposit, this);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer + " in " + bankName);
    }

    // Display all customers of the bank
    public void displayCustomers() {
        System.out.println("Bank: " + bankName + " has customers:");
        for (Customer c : customers) {
            System.out.println(" - " + c);
        }
        System.out.println();
    }
    
    @Override
    public String toString() {
        return bankName;
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        // Create Banks
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("Axis Bank");

        // Create Customers
        Customer c1 = new Customer("Alice", 101);
        Customer c2 = new Customer("Bob", 102);

        // Open Accounts
        bank1.openAccount(c1, 1001, 5000);
        bank1.openAccount(c2, 1002, 7000);
        bank2.openAccount(c1, 2001, 12000); // same customer with another bank

        // View balances
        c1.viewBalance();
        c2.viewBalance();
    }
}

