package Copy;

class Bike {
    int id;
    String name;
    public Bike(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Bike(Bike b) {
        this.id = b.id;
        this.name = b.name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class CopyConstructor {
    static void main() {
        Bike b1 = new Bike(100, "A");
        Bike b2 = new Bike(b1);

        System.out.println(b1);
        System.out.println(b2);
    }
}
