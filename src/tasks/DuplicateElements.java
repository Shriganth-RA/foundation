package tasks;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateElements {
    static void main() {
        String s = "abcadbefgc";

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

//        System.out.println(frequency);

//        for (char ch : frequency.keySet()) {
//            if (frequency.get(ch) > 1) {
//                System.out.print(ch + " ");
//            }
//        }

        System.out.print("The first non-repeating character: ");
        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) != 1) {
                continue;
            }
            System.out.print(s.charAt(i));
            break;
        }
    }
}
