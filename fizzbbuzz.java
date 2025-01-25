import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String[] result = new String[number + 1];
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}