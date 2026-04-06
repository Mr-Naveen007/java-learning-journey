import java.util.*;

// Student has a NATURAL order -> rollNumber
class Student implements Comparable<Student> {
    int rollNumber;
    String name;
    int marks;

    Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering (Comparable)
    @Override
    public int compareTo(Student other) {
        return this.rollNumber - other.rollNumber;
    }

    @Override
    public String toString() {
        return rollNumber + " " + name + " " + marks;
    }
}

// External sorting rule -> marks
class SortByMarks implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return b.marks - a.marks; // descending
    }
}

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Ravi", 85));
        students.add(new Student(1, "Anu", 92));
        students.add(new Student(2, "Kiran", 78));

        System.out.println("Before sorting:");
        System.out.println(students);

        // Uses Comparable (rollNumber)
        Collections.sort(students);
        System.out.println("\nSorted by rollNumber (Comparable):");
        System.out.println(students);

        // Uses Comparator (marks)
        students.sort(new SortByMarks());
        System.out.println("\nSorted by marks (Comparator):");
        System.out.println(students);
    }
}
