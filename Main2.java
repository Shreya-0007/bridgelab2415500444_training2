class Book {
    static String libraryName = "City Library";  // Static variable
    private String title, author;
    private final String isbn;   // Final variable

    // Constructor using "this"
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {   // instanceof check
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Doe", "ISBN123");
        Book b2 = new Book("OOP Concepts", "Jane Smith", "ISBN456");

        Book.displayLibraryName();
        b1.displayDetails();
        b2.displayDetails();
    }
}
