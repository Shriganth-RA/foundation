package clone;


class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

//    Shallow copy
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nName: " + name +
                "\nAge: " + age + "\n";
    }
}


public class CopyContructor {
    static void main() {
        Student student1 = new Student(101, "Shriganth", 24);
        System.out.println(student1);

        Student student2 = student1;
        System.out.println(student2);

        System.out.println(student1 == student2);
    }
}
