package Inheritance;

class Alpha {
    int x = 10;
    void display() {
        System.out.println("A display...");
        System.out.println("Alpha: " + x + "\n");
    }
}

class Beta extends Alpha {
    int x = 20;
    @Override
    protected void display() {
        System.out.println("B display...");
        System.out.println("Alpha: " + super.x);
        System.out.println("Beta: " + x + "\n");
    }
}

class Gamma extends Beta {
    int x = 30;
    @Override
    public void display() {
        System.out.println("C display...");
        System.out.println("Beta: " + super.x);
        System.out.println("Gamma: " + x + "\n");
    }
}

public class InheritanceExample2 {
    static void main() {
        Alpha alpha = new Gamma();
        alpha.display();
//        System.out.println(alpha.x);


        Beta beta = new Gamma();
        beta.display();
//        System.out.println(beta.x);


        Gamma gamma = new Gamma();
        gamma.display();
//        System.out.println(gamma.x);
    }
}
