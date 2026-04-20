import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("user.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            User user = (User) in.readObject();

            in.close();
            fileIn.close();

            user.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}