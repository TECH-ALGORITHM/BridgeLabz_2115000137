import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int c = scanner.nextint();
        int f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
        scanner.close();
    }
}