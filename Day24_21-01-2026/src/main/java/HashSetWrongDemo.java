import java.util.HashSet;
import java.util.Set;

public class HashSetWrongDemo {

    static class User {
        int id;

        User(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {

        Set<User> set = new HashSet<>();

        set.add(new User(1));
        set.add(new User(1));

        System.out.println(set.size()); // OUTPUT: 2 ❌
    }
}
