import java.util.*;

class Student2 implements Comparable<Student2> {
    int rollNumber;
    String name;
    int marks;
    Student2(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student2 other) {
        return this.rollNumber - other.rollNumber;
    }
    @Override
    public String toString() {
        return rollNumber + " " + name + " " + marks;
    }
}
class SortByMarks2 implements Comparator<Student2> {
    @Override
    public int compare(Student2 a, Student2 b) {
        return b.marks - a.marks;
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2(3, "Ravi",60));
        students.add(new Student2(1, "Vishnu",80));
        students.add(new Student2(2, "Shankar",95));
        Collections.sort(students);
        System.out.println(students);
        students.sort(new SortByMarks2());
        System.out.println(students);
    }
}
