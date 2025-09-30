package Level2;

// Base class
class Book {
    public String ISBN;         // public → accessible everywhere
    protected String title;     // protected → accessible in same package & subclasses
    private String author;      // private → only accessible inside Book class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access modifiers
class EBook extends Book {
    private double fileSize; // in MB

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method using public and protected members
    public void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN);      // public → direct access
        System.out.println("EBook Title: " + title);    // protected → direct access
        System.out.println("EBook Author: " + getAuthor()); // private accessed via getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Test class
public class Library_system {
    public static void main(String[] args) {
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();

        System.out.println("\nUpdating Author...");
        b1.setAuthor("J. Bloch"); // modifying private variable via setter
        b1.displayBookDetails();

        System.out.println("\n--- EBook ---");
        EBook eb1 = new EBook("978-1492078005", "Java Concurrency", "Brian Goetz", 5.8);
        eb1.displayEBookDetails();
    }
}

