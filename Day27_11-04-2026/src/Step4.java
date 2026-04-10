import java.time.LocalDateTime;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Step4 {
    public static void main(String[] args) {
        String log = LocalDateTime.now() + " : Test log ";
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("test.txt", true)
            );

            bw.write(log);
            bw.write("Buffered writing 4");
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}