package collections;

import java.util.Comparator;
import java.util.TreeSet;

class Student {
    private int id;
    private String name;
    int percentage;

    public Student(int id, String name, int percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Percentage: " + percentage;
    }
}

class CompareStudentByPercentage implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.percentage > o2.percentage) {
            return -1;
        } else if (o1.percentage < o2.percentage) {
            return 1;
        }
        return 0;
    }
}

public class StudentList {
    static void main() {
        CompareStudentByPercentage csp = new CompareStudentByPercentage();
        TreeSet<Student> studentTreeSet = new TreeSet<>(csp);

        studentTreeSet.add(new Student(104, "S", 65));
        studentTreeSet.add(new Student(102, "O", 87));
        studentTreeSet.add(new Student(106, "J", 45));
        studentTreeSet.add(new Student(103, "T", 28));
        studentTreeSet.add(new Student(101, "Y", 53));

        System.out.println(studentTreeSet);
    }
}
