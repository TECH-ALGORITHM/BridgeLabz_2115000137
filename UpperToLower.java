import java.io.*;

public class UpperToLower {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            int c;
            while ((c = br.read()) != -1) {
                if (c >= 'A' && c <= 'Z') {
                    c += 32;
                }
                bw.write(c);
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
