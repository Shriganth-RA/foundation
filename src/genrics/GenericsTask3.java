package genrics;

class GenricCalculator<T extends Number> {
    private final T value;
    public GenricCalculator(T value) {
        this.value = value;
    }

    public double add(T number) {
        return value.doubleValue() + number.doubleValue();
    }
    public double sub(T number) {
        return value.doubleValue() - number.doubleValue();
    }
    public double mul(T number) {
        return value.doubleValue() * number.doubleValue();
    }
}

public class GenericsTask3 {
    static void main() {
        GenricCalculator<Integer> gc1 = new GenricCalculator<>(100);
        System.out.println("Integer addition: " + gc1.add(203));
        System.out.println("Integer subtraction: " + gc1.sub(24));
        System.out.println("Integer multiplication: " + gc1.mul(3));

        System.out.println();

        GenricCalculator<Integer> gc2 = new GenricCalculator<>(950);
        System.out.println("Integer addition: " + gc2.add(143));
        System.out.println("Integer subtraction: " + gc2.sub(78));
        System.out.println("Integer multiplication: " + gc2.mul(10));
    }
}
