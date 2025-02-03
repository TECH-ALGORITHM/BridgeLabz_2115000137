class Book {
    static String libraryName = "Central Library";
    final int isbn;
    String title, author;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    void display() {
        if (this instanceof Book) {
            System.out.println(title + " " + author + " " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Book A", "Author X", 12345);
        Book b2 = new Book("Book B", "Author Y", 67890);
        b1.display();
        b2.display();
        displayLibraryName();
    }
}
