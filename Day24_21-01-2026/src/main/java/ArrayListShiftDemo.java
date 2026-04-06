import java.util.ArrayList;
import java.util.List;

public class ArrayListShiftDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(0, i);   // insert at index 0
            System.out.println(list);
        }
    }
}
