package innerClass;

public class Employee {
    int id = 101;
    String name = "Raghu";

    class InnerClass {
        public void display(Employee e) {
            System.out.println("ID: " + e.id);
            System.out.println("Name: " + e.name);
        }
    }

    static void main() {
        Employee e = new Employee();
        InnerClass ic = e.new InnerClass();
        ic.display(e);
    }
}
