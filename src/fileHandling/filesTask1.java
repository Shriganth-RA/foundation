package fileHandling;

import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}

public class filesTask1 {

    public void serialization() {

    }

    public void deSerialization() {

    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1. Write");
            System.out.println("2. Read");
            System.out.println("3. Search by Id");

            System.out.print("Enter your choice: ");
//            int choice =
        }
    }
}
