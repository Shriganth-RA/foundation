package genrics;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student (int id, String name) {
        this.id = id;
        this.name = name;
    }

//    Compare using ID
//    @Override
//    public int compareTo(Student s) {
//        return this.id - s.id;
//    }

//    Compare using name
    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
public class ComparableExample1 {
    static void main() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Shriganth"));
        list.add(new Student(102, "Abishek"));
        list.add(new Student(100, "Dinesh"));
        list.add(new Student(103, "Manish"));

        Collections.sort(list);
        System.out.println(list);
    }
}
