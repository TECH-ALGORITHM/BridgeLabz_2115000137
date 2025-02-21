import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("user_data.txt");
            System.out.println("Enter Name:");
            fw.write(br.readLine() + "\n");
            System.out.println("Enter Age:");
            fw.write(br.readLine() + "\n");
            System.out.println("Enter Favorite Language:");
            fw.write(br.readLine() + "\n");
            fw.close();
            br.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
