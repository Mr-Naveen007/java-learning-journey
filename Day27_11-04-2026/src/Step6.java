import java.io.FileReader;
import java.io.IOException;

public class Step6 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("activity.log");

            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}