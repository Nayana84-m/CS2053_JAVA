// Lab Session 1: Class, Object, Constructor and 'this' keyword

class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;    
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book Title  : " + this.title);
        System.out.println("Author      : " + this.author);
        System.out.println("Price Rs.   : " + this.price);
        System.out.println("-----------------------------");
    }
}

public class LabSession1 {
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling", 550);
        Book b2 = new Book("Python Essentials", "Guido van Rossum", 499);

        b1.displayDetails();
        b2.displayDetails();
    }
}
