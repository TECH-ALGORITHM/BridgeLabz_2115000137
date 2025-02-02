public class LibraryBook {
    String title, author;
    int price;
    boolean availability;

    public LibraryBook(String t, String a, int p, boolean av) {
        title = t;
        author = a;
        price = p;
        availability = av;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + (availability ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("Data Structures", "Mark Weiss", 600, true);
        lb1.display();
        lb1.borrowBook();
        lb1.display();
    }
}
