import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextint();
        System.out.print("Enter the second number: ");
        int b = input.nextint();
        System.out.print("Enter the third number: ");
        int c = input.nextint();
        int average = (a + b + c) / 3;
        System.out.println("The average is: " + average);
        input.close();
    }
}