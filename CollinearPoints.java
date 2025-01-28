import java.util.Scanner;
public class CollinearPoints {
public static boolean areCollinearUsingSlopes(int x1, int y1, int x2, int y2, int x3, int y3) {
double slopeAB = (double) (y2 - y1) / (x2 - x1);
double slopeBC = (double) (y3 - y2) / (x3 - x2);
return slopeAB == slopeBC;
}
public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
return area == 0;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter coordinates of point A (x1 y1): ");
int x1 = scanner.nextInt();
int y1 = scanner.nextInt();
System.out.print("Enter coordinates of point B (x2 y2): ");
int x2 = scanner.nextInt();
int y2 = scanner.nextInt();
System.out.print("Enter coordinates of point C (x3 y3): ");
int x3 = scanner.nextInt();
int y3 = scanner.nextInt();
boolean collinearSlopes = areCollinearUsingSlopes(x1, y1, x2, y2, x3, y3);
boolean collinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
System.out.println("Collinear using slopes: " + collinearSlopes);
System.out.println("Collinear using area: " + collinearArea);
}
}
