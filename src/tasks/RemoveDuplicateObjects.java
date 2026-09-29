package tasks;


import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nName: " + name +
                "\nSalary: " + salary + "\n";
    }
}

public class RemoveDuplicateObjects {
    static void main() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Arjun", 9666000));
        employees.add(new Employee(102, "Ashok", 6700000));
        employees.add(new Employee(103, "Sharma", 5200000));
        employees.add(new Employee(104, "Mark", 7200000));
        employees.add(new Employee(105, "Jammal", 7300000));
        employees.add(new Employee(106, "Sharma", 5200000));
        employees.add(new Employee(107, "Arjun", 9666000));

        for (int i = 0; i < employees.size(); i++) {
            for (int j = 1; j < employees.size(); j++) {
                if (employees.get(i).name.equals(employees.get(j).name) && employees.get(i).salary == employees.get(j).salary) {
                    employees.remove(employees.get(j));
                }
            }
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
