package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    static void main(String[] args) {
        List<Integer> arrays = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrays.add(i);
        }

        for (Integer a : arrays) {
            System.out.print(a + " ");
        }
    }
}
