class Book {
    String title;
    String author;
    double price;

    // Constructor using 'this' keyword
    Book(String title, String author, double price) {
        this.title = title;     // 'this' refers to the current object's field
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("📖 Book Details:");
        System.out.println("Title : " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price : ₹" + this.price);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 350.00);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 299.50);

        // Displaying details
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
    }
}
