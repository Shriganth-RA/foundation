package collections;

import java.util.PriorityQueue;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Id: " + id +
//                "\nName: " + name +
//                "\nAge: " + age +
//                "\nSalary: " + salary + "\n";
//    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Age: " + age + " Salary: " + salary;
    }

    @Override
    public int compareTo(Employee e) {
        if (this.id < e.id) {
            return -1;
        } else if (this.id > e.id) {
            return 1;
        }
        return 0;
    }

//    @Override
//    public int compareTo(Employee e) {
//        return this.name.compareTo(e.name);
//    }
}

public class EmployeeList {
    static void main() {
        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Employee(104, "D", 32, 870000));
        priorityQueue.add(new Employee(103, "B", 30, 930000));
        priorityQueue.add(new Employee(101, "C", 24, 340000));
        priorityQueue.add(new Employee(102, "A", 26, 560000));

        System.out.println(priorityQueue);

        priorityQueue.remove();

        System.out.println(priorityQueue);
    }
}


