package objectClass;

public class Main {

    public Object getStudent() {
        return new Student(102, "Kevin", 76);
    }

    static void main() {
        Main m = new Main();
        Student s = (Student) m.getStudent();
        System.out.println("Id: " + s.id + "\nName: " + s.name + "\nMarks: " + s.marks);
    }
}
