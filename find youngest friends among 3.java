import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] friends = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height for " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);
    }
}