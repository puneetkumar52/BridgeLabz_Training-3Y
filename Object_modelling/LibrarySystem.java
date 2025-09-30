package Object_modelling;

import java.util.ArrayList;

// Book class (can exist independently)
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class (aggregates multiple books)
class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display library details
    public void displayLibrary() {
        System.out.println("Library: " + name);
        System.out.println("Books available:");
        for (Book book : books) {
            book.displayBookDetails();
        }
        System.out.println();
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        // Create books (independent objects)
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Java Programming", "James Gosling");

        // Create libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        // Aggregation: same book objects can be added to different libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        // Display library details
        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}
