

class Employee implements Cloneable {
    String name;
    int age;
    Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee copy = (Employee) super.clone();
        copy.address = address.clone();
        return copy;
    }
}


class Address implements Cloneable {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}


public class Main {
    static void main() throws CloneNotSupportedException {
        Address address = new Address("Chennai");
        Employee e1 = new Employee("Shriganth", 24, address);
        Employee e2 = e1.clone();

        System.out.println("Name: " + e1.name
                            + "\nAge: " + e1.age
                            + "\nCity: " + e1.address.city);

        System.out.println("Name: " + e2.name
                            + "\nAge: " + e2.age
                            + "\nCity: " + e2.address.city);
    }
}