import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextint();
        System.out.print("Enter the second number: ");
        int num2 = input.nextint();
        int total = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + total);
        input.close();
    }
}