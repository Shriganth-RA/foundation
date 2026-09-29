package genrics;

class Box<T> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsTask1 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.setValue(100);

        Box<Float> b2 = new Box<>();
        b2.setValue(10.00f);

        Box<Double> b3 = new Box<>();
        b3.setValue(20.345);

        Box<Long> b4 = new Box<>();
        b4.setValue(2000000L);

        Box<Character> b5 = new Box<>();
        b5.setValue('A');

        Box<String> b6 = new Box<>();
        b6.setValue("Kavin");

        System.out.println("Value of B1 (Integer)  : " + b1.getValue());
        System.out.println("Value of B2 (Float)    : " + b2.getValue());
        System.out.println("Value of B3 (Double)   : " + b3.getValue());
        System.out.println("Value of B4 (Long)     : " + b4.getValue());
        System.out.println("Value of B5 (Character): " + b5.getValue());
        System.out.println("Value of B6 (String)   : " + b6.getValue());
    }
}
