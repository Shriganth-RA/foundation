package genrics;

public class Calculator {
    double sum;

    public <T extends Number> void add(T value) {
        sum = sum + value.doubleValue();
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(20);
        c.add(33.33);
        c.add(9876.432);

        System.out.println("Value of calculated sum: " + c.sum);
    }
}
