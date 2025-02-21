import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("largefile.txt");
            FileOutputStream out = new FileOutputStream("copy.txt");
            BufferedInputStream bin = new BufferedInputStream(in);
            BufferedOutputStream bout = new BufferedOutputStream(out);
            byte[] buffer = new byte[4096];
            int bytesRead;
            long start = System.nanoTime();
            while ((bytesRead = bin.read(buffer)) != -1) {
                bout.write(buffer, 0, bytesRead);
            }
            long end = System.nanoTime();
            System.out.println("Time: " + (end - start));
            bin.close();
            bout.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
