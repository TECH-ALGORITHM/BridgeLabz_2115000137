import java.io.*;

class WriterThread extends Thread {
    PipedOutputStream out;

    WriterThread(PipedOutputStream out) {
        this.out = out;
    }

    public void run() {
        try {
            out.write("Message".getBytes());
            out.close();
        } catch (IOException e) {
        }
    }
}

class ReaderThread extends Thread {
    PipedInputStream in;

    ReaderThread(PipedInputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            int b;
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
            }
            in.close();
        } catch (IOException e) {
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) throws IOException {
        PipedOutputStream out = new PipedOutputStream();
        PipedInputStream in = new PipedInputStream(out);
        new WriterThread(out).start();
        new ReaderThread(in).start();
    }
}
