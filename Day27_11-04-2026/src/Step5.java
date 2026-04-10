import java.time.LocalDateTime;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Step5 {
    public static void main(String[] args) {
       log("Naveen");
    }

    public static void log(String message) {
        try { //Normal try-catch
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("app.log", true)
            );

            bw.write(LocalDateTime.now() + " : " + message);
            bw.newLine();
            bw.close(); //manual closing required

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}