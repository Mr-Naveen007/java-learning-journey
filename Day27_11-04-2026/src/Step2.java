import java.io.FileWriter;
import java.io.IOException;

public class Step2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt", true);
            writer.write("Hello\n");
            writer.write("This is step 2");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}