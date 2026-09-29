package collections;

import java.util.Arrays;
import java.util.List;

public class Arraylist2 {
    static void main() {
        List<Character> characters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'w', 'y');

        for (int i = 0; i < characters.size(); i++) {
            if (i == 0 || i == characters.size() - 1) {
                System.out.print(characters.get(i) + " ");
            }
        }
    }
}
