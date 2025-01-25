import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = new int[10];
        
        while (number > 0) {
            digits[number % 10]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.println("Digit " + i + ": " + digits[i] + " times");
            }
        }
    }
}