import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetCorrectDemo {

    static class User {
        int id;

        User(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User user)) return false;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {

        Set<User> set = new HashSet<>();

        set.add(new User(1));
        set.add(new User(1));

        System.out.println(set.size()); // OUTPUT: 1 ✅
    }
}
