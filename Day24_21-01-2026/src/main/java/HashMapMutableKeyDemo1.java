import java.util.HashMap;
import java.util.Map;

public class HashMapMutableKeyDemo1 {
    static class Key {
        int id;
        Key(int id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(!(o instanceof Key key)) return false;
            return id == key.id;
        }

    }

    public static void main(String[] args) {
        Map<Key, String> map = new HashMap<>();
        Key k = new Key(1);
        map.put(k, "VALUE");
        System.out.println(map.get(k));
        k.id = 2;
        System.out.println(map.get(k));

    }
}