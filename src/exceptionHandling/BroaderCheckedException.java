package exceptionHandling;

class Parent {
    void show() throws Exception {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void show() throws Exception {
        System.out.println("Child");
    }
}

public class BroaderCheckedException {
    static void main() throws Exception {
        Parent parent = new Child();
        parent.show();
    }
}
