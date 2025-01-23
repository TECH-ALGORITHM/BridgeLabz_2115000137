import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        int r = input.nextint();
        System.out.print("Enter the height of the cylinder: ");
        int h = input.nextint();
        int volume = Math.PI * r * r * h;
        System.out.println("The volume of the cylinder is: " + volume);
        input.close();
    }
}