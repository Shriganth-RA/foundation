package collections;

import java.util.Vector;

public class VectorExample1 {
    static void main() {
        Vector<Integer> number = new Vector<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(null);

        System.out.println(number);
    }
}
