package collections;

import java.util.LinkedHashMap;

public class Linkedhashmap {
    static void main() {

        LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<>();
        hashmap.put("ABC", 10);
        hashmap.put("B", 20);
        hashmap.put("C", 30);
        hashmap.put("D", 40);
        hashmap.put("E", 50);

        System.out.println(hashmap);
    }
}
