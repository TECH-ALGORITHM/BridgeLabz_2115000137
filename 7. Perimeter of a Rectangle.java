import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = input.nextint();
        System.out.print("Enter the width of the rectangle: ");
        int w = input.nextint();
        int perimeter = 2 * (l + w);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        input.close();
    }
}