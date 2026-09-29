package Inheritance;

class A {
    public void display() {
        System.out.println("A....");
    }
}

class B {
    A a;
    public B(A a) {
        this.a = a;
    }
    public void display() {
        a.display();
        System.out.println("B....");
    }
}

public class Aggregation {
    static void main() {
        A a = new A();
        B b = new B(a);
        b.display();
    }
}
