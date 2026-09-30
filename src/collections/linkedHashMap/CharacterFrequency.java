package collections.linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharacterFrequency {
    static void main() {

        String s = "Hello";

        LinkedHashMap<Character, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;

            if (frequency.containsKey(c)) {
                count = frequency.get(c);
                count++;
                frequency.put(c, count);
            } else {
                count++;
                frequency.put(c, count);
            }
        }

        System.out.println(frequency);

    }
}
