package innerClass;

class Outer {
    private final int x = 10;
    void display() {
        System.out.println(x);
    }
    class Inner {
        int y = 20;
        void display() {
            Outer.this.display();
            System.out.println("Value of x: " + x);
        }
    }
}

public class InnerclassExample1 {
    static void main() {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
//        o.display();
        i.display();
    }
}
