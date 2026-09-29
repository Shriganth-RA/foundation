package collections;

import java.util.Arrays;
import java.util.List;

public class FrequencyElement {
    static void main() {
        List<Character> characters = Arrays.asList('a', 'b', 'r', 'a', 'q', 't', 's', 'b');
        int[] freq = new int[128];

        for (Character c : characters) {
            freq[c]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}
