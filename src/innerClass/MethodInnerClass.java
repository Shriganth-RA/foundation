package innerClass;

public class MethodInnerClass {

    public void outerMethod() {
        class InnerClass {
            public void innerMethod() {
                System.out.println("\nInner-class...");
            }
        }

        InnerClass ic = new InnerClass();
        ic.innerMethod();
    }

    static void main() {
        MethodInnerClass mic = new MethodInnerClass();
        mic.outerMethod();
    }
}
