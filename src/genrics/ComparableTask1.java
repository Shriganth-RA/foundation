package genrics;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

//    Sort based on ID in ascending order
//    @Override
//    public int compareTo(Employee e) {
//        return this.id - e.id;
//    }

//    Sort based on salary in ascending order
//    @Override
//    public int compareTo(Employee e) {
//        return Double.compare(e.salary, this.salary);
//    }

//    Sort based on name in ascending order
//    @Override
//    public int compareTo(Employee e) {
//        return this.name.compareTo(e.name);
//    }

//    Sort based on salary in ascending order but if the salary is same then it compares the name in ascending order
//    @Override
//    public int compareTo(Employee e) {
//        int result = Double.compare(this.salary, e.salary);
//        if (result == 0) {
//            return this.name.compareTo(e.name);
//        }
//        return result;
//    }

//    Sort based on salary in descending order but if the salary is same then it compares name in ascending order
    @Override
    public int compareTo(Employee e) {
        int result = Double.compare(e.salary, this.salary);
        if (result == 0) {
            return this.name.compareTo(e.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
public class ComparableTask1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(105, "Abishek", 700000));
        employees.add(new Employee(108, "Dinesh", 500000));
        employees.add(new Employee(102, "Sivaganesh", 450000));
        employees.add(new Employee(104, "Yogesh", 500000));
        employees.add(new Employee(101, "Kalai", 700000));

        Collections.sort(employees);
        System.out.println(employees);
    }
}
