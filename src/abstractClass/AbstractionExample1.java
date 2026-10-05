package abstractClass;

abstract class Alpha {
    public abstract void greet();

    public void display() {
        System.out.println("Alpha...");
    }
}

class Beta extends Alpha {
    @Override
    public void greet() {
        System.out.println("Hello...");
    }
}

public class AbstractionExample1 {
    static void main() {

    }
}
