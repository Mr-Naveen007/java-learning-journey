import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Step7 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                    new FileReader("activity.log"))){

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}