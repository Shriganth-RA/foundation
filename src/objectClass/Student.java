package objectClass;

public class Student {
    int id;
    String name;
    int marks;

    public Student (int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nName: " + name + "\nMarks: " + marks;
    }

    public static void main() {
        Student s1 = new Student(101, "Rahul", 85);
        System.out.println(s1);
    }
}
