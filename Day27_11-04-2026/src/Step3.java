import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Step3 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("test.txt", true)
            );

            bw.write("Buffered writing 3");
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}