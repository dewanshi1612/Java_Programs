package Assignment6;

public class Book {

    int bookId;
    String title;

    Book() {
        bookId = 0;
        title = "No Title";
    }

    Book(int bookId) {
        this.bookId = bookId;
        title = "Unknown";
    }

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println();
    }
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book(101);
        Book b3 = new Book(102, "Java Programming");

        b1.display();
        b2.display();
        b3.display();
    }
}
