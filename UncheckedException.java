import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
