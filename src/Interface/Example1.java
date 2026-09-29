package Interface;

abstract class A {
    static int a;
    public A(int a) {
        A.a = a;
    }
}

interface B {
    int a = 20;
}

public class Example1 extends A implements B {
    public Example1() {
        super(10);
    }
    public void display() {
        System.out.println(A.a);
    }

    static void main() {
        Example1 e = new Example1();
        e.display();

        System.out.println(B.a);
    }
}