import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            while (true) {
                salaries[i] = scanner.nextDouble();
                if (salaries[i] <= 0) {
                    System.out.print("Invalid salary. Please enter a positive value: ");
                } else {
                    break;
                }
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            while (true) {
                yearsOfService[i] = scanner.nextInt();
                if (yearsOfService[i] < 0) {
                    System.out.print("Invalid years of service. Please enter a non-negative value: ");
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            double bonus = (yearsOfService[i] > 5) ? salaries[i] * 0.05 : salaries[i] * 0.02;
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}