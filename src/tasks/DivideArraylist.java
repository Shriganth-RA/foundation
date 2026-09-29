package tasks;

import java.util.ArrayList;
import java.util.List;

public class DivideArraylist {
    static void main() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(-10);
        numbers.add(12);
        numbers.add(55);
        numbers.add(-76);
        numbers.add(32);
        numbers.add(-22);
        numbers.add(-79);
        numbers.add(90);
        numbers.add(-11);

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (Integer n : numbers) {
            if (n >= 0) {
                positive.add(n);
            } else {
                negative.add(n);
            }
        }

        System.out.print("Positive numbers: ");
        for (Integer num : positive) {
            System.out.print(num + ", ");
        }

        System.out.println();

        System.out.print("Negative numbers: ");
        for (Integer num : negative) {
            System.out.print(num + ", ");
        }
    }
}
