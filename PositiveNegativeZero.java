import java.util.Scanner;
public class PositiveNegativeZero {
public static int checkNumber(int number) {
if (number > 0) return 1;
if (number < 0) return -1;
return 0;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number: ");
int number = scanner.nextInt();
System.out.println(checkNumber(number));
}
}

