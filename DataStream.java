import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("students.dat"));
            out.writeInt(1);
            out.writeUTF("Alice");
            out.writeDouble(3.5);
            out.close();
            DataInputStream in = new DataInputStream(new FileInputStream("students.dat"));
            System.out.println(in.readInt() + " " + in.readUTF() + " " + in.readDouble());
            in.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
