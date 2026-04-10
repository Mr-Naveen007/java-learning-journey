import java.io.*;
import java.time.LocalDateTime;

public class UserActivityLogger {

    public static void main(String[] args) {

        logActivity("Naveen", "LOGIN");
        logActivity("Naveen", "DOWNLOAD_FILE");
        logActivity("Naveen", "LOGOUT");

        System.out.println("\n--- LOGS ---\n");

        readLogs();
    }

    public static void logActivity(String username, String action) {

        String log = LocalDateTime.now() + " : " + username + " -> " + action;

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("app.log", true))) {

            bw.write(log);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Logging failed: " + e.getMessage());
        }
    }

    public static void readLogs() {

        try (BufferedReader br = new BufferedReader(
                new FileReader("app.log"))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Reading logs failed: " + e.getMessage());
        }
    }
}