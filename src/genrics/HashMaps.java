package genrics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ajay");
        map.put(2, "Rithan");
        map.put(3, "Guna");

        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry e = iterator.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
