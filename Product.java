class Product {
    static int discount = 10;
    final int productID;
    String productName;
    int price, quantity;

    Product(String productName, int price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }

    void display() {
        if (this instanceof Product) {
            System.out.println(productName + " " + price + " " + quantity + " " + discount);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 500, 2, 1);
        Product p2 = new Product("Phone", 300, 1, 2);
        p1.display();
        p2.display();
        updateDiscount(15);
        p1.display();
    }
}
