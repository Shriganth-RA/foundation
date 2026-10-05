package abstractClass;

abstract class VehicleParts {
    public abstract void engine();
    public abstract void wheel();
    public abstract void silencer();
    public abstract void audioSystem();
    public abstract void airConditioner();
}

abstract class Airplane extends VehicleParts {
    @Override
    public void audioSystem() {
        System.out.println("Dolby-atmos audio system...");
    }

    @Override
    public void airConditioner() {
        System.out.println("16 deg Celsius...");
    }
}

class Scooter extends Airplane {
    @Override
    public void engine() {
        System.out.println("Two-stroke engine...");
    }

    @Override
    public void wheel() {
        System.out.println("Two wheeler...");
    }

    @Override
    public void silencer() {
        System.out.println("Red-rooster silencer...");
    }
}

public class AbstractionExample2 {
    static void main() {
        VehicleParts v = new Scooter();
        v.engine();
        v.wheel();
        v.silencer();
        v.audioSystem();
        v.airConditioner();
    }
}
