import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("image.jpg");
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            byte[] byteArray = out.toByteArray();
            ByteArrayInputStream bin = new ByteArrayInputStream(byteArray);
            FileOutputStream fout = new FileOutputStream("copy.jpg");
            while ((b = bin.read()) != -1) {
                fout.write(b);
            }
            in.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
