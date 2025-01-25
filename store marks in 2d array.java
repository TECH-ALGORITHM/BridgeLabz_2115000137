import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter marks for student " + (i + 1) + " (Physics, Chemistry, Math): ");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.print("Invalid marks. Please enter positive marks: ");
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < number; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ": Marks = " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] +
                    ", Percentage = " + percentages[i] + ", Grade = " + grades[i]);
        }
    }
}