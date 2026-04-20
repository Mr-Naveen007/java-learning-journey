import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            User user = new User("Naveen", 22, 120000);

            FileOutputStream fileOut = new FileOutputStream("user.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(user);

            out.close();
            fileOut.close();

            System.out.println("Object serialized successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}