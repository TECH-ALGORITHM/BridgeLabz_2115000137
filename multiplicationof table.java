import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find the multiplication table for 6 to 9: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4 * 10];

        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                multiplicationResult[(i - 6) * 10 + (j - 1)] = i * j;
            }
        }

        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = (i % 10) + 1;
            int tableNum = 6 + (i / 10);
            System.out.println(tableNum + " * " + multiplier + " = " + multiplicationResult[i]);
        }
    }
}