package objectClass;

import java.util.HashSet;
import java.util.Objects;

public class Employee {
    int id;
    String name;
    double salary;
    Employee e;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setEmployee(Employee e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nName: " + name + "\nSalary: " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return this.id == emp.id && this.name.equals(emp.name) && this.salary == emp.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    static void main() {
        Employee e1 = new Employee(101, "Vikram", 20000);
//        e1.setEmployee(e1);
        System.out.println(e1);
        Employee e2 = new Employee(101, "Vikram", 20000);
        Employee e3 = new Employee(102, "Arun", 30000);
//        System.out.println(e2.equals(e1));

//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
//        System.out.println(e3.hashCode());

//        HashSet<Employee> emp = new HashSet<>();
//        emp.add(e1);
//        emp.add(e2);
//        emp.add(e3);
//
//        for (Employee e : emp) {
//            System.out.println("Id: " + e.id + "\nName: " + e.name + "\nSalary: " + e.salary);
//        }
    }
}
