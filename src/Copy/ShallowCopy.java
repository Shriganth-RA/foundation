package Copy;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class ShallowCopy {
    static void main() {
        Person p1 = new Person("Abishek", 27);
        Person p2 = p1;

        System.out.println(p1);
        System.out.println(p2);

        p2.age = 26;

        System.out.println(p1);
        System.out.println(p2);
    }
}
