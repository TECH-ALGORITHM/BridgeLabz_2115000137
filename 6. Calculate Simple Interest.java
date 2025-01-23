import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int p = input.nextint();
        System.out.print("Enter the rate of interest: ");
        int r = input.nextint();
        System.out.print("Enter the time (in years): ");
        int t = input.nextint();
        int si = (p * r * t) / 100;
        System.out.println("The simple interest is: " + si);
        input.close();
    }
}