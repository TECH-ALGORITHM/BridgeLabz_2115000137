import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
        }
        scanner.close();
    }
}
