class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
}

class EBook extends Book {
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title);
    }

    public static void main(String[] args) {
        EBook eb = new EBook("123456", "Java Programming", "James Gosling");
        eb.display();
        eb.setAuthor("Updated Author");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}
