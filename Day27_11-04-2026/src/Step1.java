import java.io.FileWriter;
import java.io.IOException;

public class Step1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello\n");
            writer.write("This is step 1");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}