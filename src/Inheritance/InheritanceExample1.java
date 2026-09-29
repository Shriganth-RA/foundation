package Inheritance;

abstract class Parent {
//    static int y = 50;
//    int x = 100;
void display() {
        System.out.println("I'm parent class...");
    }

//    public void add(int a) {
//        System.out.println(100);
//    }
//    protected int add(int a, int b) {
//        return 200;
//    }
}

class Child extends Parent {
    int x = 200;
//    protected void display() {
//        System.out.println(super.y);
//        System.out.println(super.x);
//        System.out.println("I'm child class...");
//    }
}

public class InheritanceExample1 extends Parent {
    protected void display() {
//        System.out.println(super.y);
//        System.out.println(super.x);
        System.out.println("I'm child class...");
    }

//    public void add(int a) {
//        System.out.println(100);
//    }
//    private void add(long a) {
//        System.out.println(200);
//    }

    static void main() {
//        Parent p = new Child();
//        System.out.println(p.x);
//        p.display();
//        Parent.display();


//        InheritanceExample1 i = new InheritanceExample1();
//        i.add(1000);

        Parent p = new Child();
        p.display();


    }
}
