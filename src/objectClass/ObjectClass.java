package objectClass;

//class Student implements Cloneable {
//    int id = 101;
//    String name = "Jackson";

//    @Override
//    public String toString() {
//        return "Id: " + id + "\nName: " + name;
//    }

//    @Override
//    public Student clone() throws CloneNotSupportedException {
//        return (Student) super.clone();
//    }

//    @Override
//    public int hashCode() {
//        return 10002;
//    }
//}

public class ObjectClass {
    @Override
    public int hashCode() {
        return 10002;
    }

    @Override
    public String toString() {
        return "java";
    }

//    @Override
//    public void finalize() {
//        System.out.println("I'm finalized method...");
//    }

    static void main() throws CloneNotSupportedException {
//        Student s = new Student();
//        System.out.println("S: " + s);
//
//        objectClass.Student s1 = s.clone();
//        System.out.println("S1: " + s1);

//        String greet = "Hello...";
//        System.out.println(greet.hashCode());   //-728075140

        ObjectClass obj = new ObjectClass();
//        System.out.println(obj.toString());     //objectClass.ObjectClass@5caf905d
//        System.out.println(obj.hashCode());     //1555009629

        obj = null;
        System.gc();
    }
}
