package innerClass;

public class OuterClass {
    static class InnerClass {
        public void display() {
            System.out.println("Inside inner class...");
        }
    }

    static void main() {
        InnerClass ic = new OuterClass.InnerClass();
        ic.display();
    }
}
