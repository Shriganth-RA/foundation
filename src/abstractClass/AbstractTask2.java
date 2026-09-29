package abstractClass;

abstract class Vehicle {
    abstract double calculateRent();
}

class Car extends Vehicle {
    int distance;
    int price = 480;
    double rent;
    public Car(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "CAR" +
                "\nDistance: " + distance +
                "\nPrice (per Km): " + price +
                "\nRent: " + rent +
                "\n========================================";
    }

    @Override
    public double calculateRent() {
        rent = price * distance;
        return rent;
    }
}

class Bike extends Vehicle {
    int distance;
    int price = 600;
    double rent;
    public Bike(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return  "BIKE" +
                "\nDistance: " + distance +
                "\nPrice (per Km): " + price +
                "\nRent: " + rent +
                "\n========================================";
    }

    @Override
    public double calculateRent() {
        rent = price * distance;
        return rent;
    }
}

class Truck extends Vehicle {
    int distance;
    int price = 2000;
    double rent;
    public Truck(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "TRUCK" +
                "\nDistance: " + distance +
                "\nPrice (per Km): " + price +
                "\nRent: " + rent +
                "\n========================================";
    }

    @Override
    public double calculateRent() {
        rent = price * distance;
        return rent;
    }
}

public class AbstractTask2 {
    double totalRent;

    public void calculateTotalRent(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car || vehicle instanceof Bike || vehicle instanceof Truck) {
                totalRent += vehicle.calculateRent();
            }
        }
    }

    @Override
    public String toString() {
        return "Total rent of all vehicles" +
                "\nRent: " + totalRent +
                "\n========================================";
    }

    static void main() {
        Car car = new Car(278);
        Bike bike = new Bike(875);
        Truck truck = new Truck(934);

        AbstractTask2 at2 = new AbstractTask2();

        Vehicle[] vehicles = {car, bike, truck};

        at2.calculateTotalRent(vehicles);

        System.out.println(car);
        System.out.println(bike);
        System.out.println(truck);
        System.out.println(at2);
    }
}
