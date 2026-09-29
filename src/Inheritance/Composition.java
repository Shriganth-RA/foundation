package Inheritance;

class C {
    public void display() {
        System.out.println("C....");
    }
}

class D {
    C c;
    public D() {
        this.c = new C();
    }

    public void display() {
        c.display();
        System.out.println("D....");
    }
}

public class Composition {
    static void main() {
        D d = new D();
        d.display();
    }
}
