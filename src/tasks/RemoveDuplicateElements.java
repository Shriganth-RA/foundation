package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicateElements {
    static void main() {

        ArrayList<Integer> duplicate_elements = new ArrayList<>(List.of(10, 20, 30, 50, 10, 20, 70, 50, 30, 30, 30));

        for (int i = 0; i < duplicate_elements.size() - 1; i++) {
            for (int j = i + 1; j < duplicate_elements.size(); j++) {
                if (Objects.equals(duplicate_elements.get(i), duplicate_elements.get(j))) {
                    duplicate_elements.set(j, -1);
                }
            }
        }

        for (int i = 0; i < duplicate_elements.size(); i++) {
            if (duplicate_elements.get(i) == -1) {
                duplicate_elements.remove(i);
                i--;
            }
        }

        System.out.println(duplicate_elements);
    }
}
