import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        int km = input.nextInt();
        int miles = (int) (km * 0.621371); 
        System.out.println("Distance in miles: " + miles);
        input.close();
    }
}