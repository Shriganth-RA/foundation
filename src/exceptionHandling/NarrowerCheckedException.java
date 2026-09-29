package exceptionHandling;

import java.io.IOException;

class Vehicle {
    void show() throws Exception {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void show() throws IOException {
        System.out.println("Car");
    }
}

public class NarrowerCheckedException {
    static void main() throws Exception {
        Vehicle vehicle = new Car();
        vehicle.show();
    }
}
