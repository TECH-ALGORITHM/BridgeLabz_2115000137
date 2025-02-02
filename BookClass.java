public class Book {
    String title, author;
    int price;

    public Book() {
        title = ;
        author = ;
        price = 0;
    }

    public Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    public void display() {
        System.out.println(Title  + title + , Author  + author + , Price  + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book(Java Programming, James Gosling, 500);
        b1.display();
    }
}
