package genrics;

import java.util.ArrayList;
import java.util.List;

interface Identifiable {
    public int getId();
}

class Employees implements Identifiable {
    int id;
    String name;
    double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "  |  Name: " + name + "  |  Salary: " + salary + "\n";
    }
}

class Repositories<T extends Identifiable> {
    List<T> employeeList = new ArrayList<>();

    public void add(T obj) {
        employeeList.add(obj);
    }
    public void remove(T obj) {
        employeeList.remove(obj);
    }
    public T finById(int id) {
        for (T e : employeeList) {
            if (id == e.getId()) {
                return e;
            }
        }
        return null;
    }
    public List<T> getAll() {
        return employeeList;
    }
}

public class GenericsTask8 {
    static void main() {
        Employee e = new Employee(0, null, 0);
        Repositories<Employees> r1 = new Repositories<>();
        r1.add(new Employees(100, "Shriganth", 300000));
        r1.add(new Employees(101, "Abishek", 1000000));
        r1.add(new Employees(102, "Dinesh", 700000));
        r1.add(new Employees(103, "Suriya", 500000));
        r1.add(new Employees(104, "Kalai", 900000));
        System.out.println("Employee list: " + r1.getAll());
        System.out.println("Employee details of Id-101: " + r1.finById(101));
    }
}