import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers[index] = num;
            total += num;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total sum: " + total);
    }
}