import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("source.txt");
            FileOutputStream out = new FileOutputStream("destination.txt");
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("File not found or error occurred.");
        }
    }
}
