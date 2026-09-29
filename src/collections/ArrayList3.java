package collections;

import java.util.Arrays;
import java.util.List;

public class ArrayList3 {
    static void main() {
        List<Character> list1 = Arrays.asList('a', 'b', 'r', 'a', 'q', 't', 's', 'b');
        List<Character> list2 = Arrays.asList('a', 'b', 'c', 'd', 'e', 'w', 'y');

        for (int i = 0; i < list1.size(); i++) {
            boolean unique = true;
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.print(list1.get(i) + ", ");
            }
        }
    }
}
