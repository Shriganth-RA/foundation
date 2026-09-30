import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
    String category;
    String[] vechiles;

    public Vehicle(String category, String[] vechiles) {
        this.category = category;
        this.vechiles = vechiles;
    }
}

public class Sample {
    
    public static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Vehicle> v = new ArrayList<>();
        v.add(new Vehicle("Car", new String[]{"Volvo", "Nissan"}));
        v.add(new Vehicle("Bike", new String[]{"Yamaha", "Hero"}));

        boolean menu = true;
        while (menu) {
            for (Vehicle obj : v) {
                System.out.println("1. " + obj.category);
            }
            System.out.println();

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            Vehicle vehicle = v.get(choice - 1);

            for (int i = 0; i < vehicle.vechiles.length; i++) {
                System.out.println((i + 1) + ". " + vehicle.vechiles[i]);
            }
            System.out.println();
        }
    }
}
