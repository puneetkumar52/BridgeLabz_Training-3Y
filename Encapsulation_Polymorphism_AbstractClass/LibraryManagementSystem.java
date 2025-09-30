package Oops.Encapsulation_Polymorphism_AbstractClass;

// Interface for reservable items
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    // Encapsulation with getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Concrete method
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Reserve status methods
    protected void setReserved(boolean reserved) {
        this.isReserved = reserved;
    }

    public boolean isReserved() {
        return isReserved;
    }
}

// Subclass Book
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            System.out.println("Book reserved successfully for " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            System.out.println("Magazine reserved successfully for " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Subclass DVD
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            System.out.println("DVD reserved successfully for " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Main class to demonstrate polymorphism
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B101", "The Alchemist", "Paulo Coelho");
        LibraryItem magazine = new Magazine("M201", "National Geographic", "John Doe");
        LibraryItem dvd = new DVD("D301", "Inception", "Christopher Nolan");

        // Polymorphism: Same reference type managing all items
        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }

        // Reserving items
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("Alice");

        Reservable reservableDVD = (Reservable) dvd;
        reservableDVD.reserveItem("Bob");

        // Checking availability
        System.out.println("Is Book available? " + reservableBook.checkAvailability());
        System.out.println("Is DVD available? " + reservableDVD.checkAvailability());
    }
}

