import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int b = input.nextint();
        System.out.print("Enter the exponent: ");
        int e = input.nextint();
        int result = Math.pow(b, e);
        System.out.println("Result: " + result);
        input.close();
    }
}