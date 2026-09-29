package innerClass;

public class InstanceInnerClass {
    int radius = 30;

    class InnerClass {
        int width = 10;
        int breadth = 20;
        public void areaOfRectangle() {
            System.out.println("\nArea of rectangle is " + (width * breadth) + "cm.");
            System.out.println("Radius: " + InstanceInnerClass.this.radius);
        }
    }

    static void main() {
        InstanceInnerClass iic = new InstanceInnerClass();
        InnerClass ic = iic.new InnerClass();
        ic.areaOfRectangle();
    }
}