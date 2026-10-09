package collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class desendingIterator {
    static void main() {
        ArrayDeque<Integer> num = new ArrayDeque<>();
        num.add(10);
        num.add(100);
        num.add(20);
        num.add(40);
        num.add(500);

        System.out.println(num);

        Iterator<Integer> iterate = num.descendingIterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}
