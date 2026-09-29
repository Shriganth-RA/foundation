package innerClass;

interface Shapes {
    void rectangle();
}

public class AnonymousInnerClass implements Shapes {
    int length = 45;
    int breadth = 73;

    @Override
    public void rectangle() {
        System.out.println("\nArea of rectangle is " + (length * breadth));
    }

    static void main() {
        AnonymousInnerClass aic = new AnonymousInnerClass();
        Shapes s = new Shapes() {
            @Override
            public void rectangle() {
                System.out.println("\nPerimeter of rectangle is " + (2 * (aic.length + aic.breadth)));
            }
        };

        s.rectangle();
    }
}
