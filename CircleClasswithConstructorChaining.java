public class Circle {
    int radius;

    public Circle() {
        this(1);
    }

    public Circle(int r) {
        radius = r;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        c1.display();
        c2.display();
    }
}
