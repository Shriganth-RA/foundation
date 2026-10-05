package tasks;

import collections.Hashset;

import java.util.*;

public class FequencyOfElements {
    static void main() {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 50, 10, 20, 70, 50, 30));

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;

            for (int j = 0; j < numbers.size(); j++) {
                if (Objects.equals(numbers.get(i), numbers.get(j))) {
                    count++;
                }
            }

            frequency.put(numbers.get(i), count);
        }

        System.out.println(frequency);

    }
}
