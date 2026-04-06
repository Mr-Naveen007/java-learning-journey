import java.util.*;


class Student1 implements Comparable<Student1> {
    int rollNumber;
    String name;
    int marks;

    Student1(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 other) {
        return this.rollNumber - other.rollNumber;
    }

    @Override
    public String toString() {
        return rollNumber + " " + name + " " + marks;
    }
}


    class SortByMarks1 implements Comparator<Student1> {
        @Override
        public int compare(Student1 a, Student1 b) {
            return b.marks - a.marks;
        }
    }

    public class Main1 {
        public static void main(String[] args) {
            List<Student1> students = new ArrayList<>();
            students.add(new Student1(3, "Ravi", 80));
            students.add(new Student1(1, "laxman", 50));
            students.add(new Student1(2, "Bheem", 92));
            Collections.sort(students);
            System.out.println(students);
            students.sort(new SortByMarks1());
            System.out.println(students);

        }
    }
