package collections;

import java.util.ArrayDeque;

class A {
    private A() {}
}

public class ArrayDequeueExample {
    static void main() {
        ArrayDeque<Integer> number = new ArrayDeque<>();

        number.add(10);
        number.add(10);
        number.add(10);
//        number.add(null);

        System.out.println(number);
    }
}
