package tasks;

import java.util.HashMap;

public class WordFrequency {
    static void main() {
        String sentence = "Java is easy Java is powerful Java is popular Java is easy to learn.";
        String[] sen_array = sentence.split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : sen_array) {
            int count = 0;

            if (frequency.containsKey(word)) {
                count = frequency.get(word);
                count++;
                frequency.put(word, count);
            } else {
                count++;
                frequency.put(word, count);
            }

        }

        System.out.println(frequency);
    }
}
