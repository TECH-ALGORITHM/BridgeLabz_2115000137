import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = input.nextint();
        int area = Math.PI * r * r;
        System.out.println("The area of the circle is: " + area);
        input.close();
    }
}