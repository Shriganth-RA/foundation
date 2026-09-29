package innerClass;

public class StaticInnerClass {
    String name = "Laurio";
    static int age = 25;

    static class InnerClass {
        StaticInnerClass sic = new StaticInnerClass();
        int a = 100;
        int x = 50;
        public void display() {
            System.out.println("Value of a is " + a);
            System.out.println("Name: " + sic.name);
            System.out.println("Age : " + StaticInnerClass.age);
        }
    }

    public void display(InnerClass ic) {
        System.out.println("Value of x is " + ic.x);
    }

    static void main() {
        StaticInnerClass sic = new StaticInnerClass();
        StaticInnerClass.InnerClass ic = new StaticInnerClass.InnerClass();
        ic.display();
        sic.display(ic);
    }
}
