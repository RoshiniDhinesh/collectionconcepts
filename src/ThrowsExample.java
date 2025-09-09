import java.io.IOException;

public class ThrowsExample {

    // this method says it "throws" an IOException
    static void readFile() throws IOException {
        throw new IOException("File not found.");
    }

    public static void main(String[] args) {
        try {
            readFile(); // calling the method
        } catch (IOException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}
