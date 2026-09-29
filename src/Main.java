import java.util.concurrent.atomic.AtomicLongArray;

class Address implements Cloneable {
    String city;
    String pinCode;
    public Address(String city, String pinCode) {
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}

class Employee implements Cloneable {
    String name;
    double salary;
    Address a;
    public Employee(String name, double salary, Address a) {
        this.name = name;
        this.salary = salary;
        this.a = a;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee copy = (Employee) super.clone();
        copy.a = a.clone();
        return copy;
    }
}

public class Main {
    static void main() throws CloneNotSupportedException {
        Employee e1 = new Employee("Kavin", 200000, new Address("Chennai", "6000017"));
        Employee e2 = e1.clone();

        e1.name = "Noorul";

        System.out.println(e1.name);
        System.out.println(e2.name);

    }
}