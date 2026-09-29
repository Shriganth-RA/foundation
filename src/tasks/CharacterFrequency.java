package tasks;

import java.util.HashMap;

public class CharacterFrequency {
    static void main() {

        String s = "Hello";

        HashMap<Character, Integer> frequency = new HashMap<>();

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
