package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {
    static void main() {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("B", 10);
        treeMap.put("A", 20);
        treeMap.put("M", 30);
        treeMap.put("K", 40);
        treeMap.put("T", 50);
        treeMap.put("R", 60);
        treeMap.put("S", 70);

//        System.out.println(treeMap);

//        System.out.println(treeMap.containsKey("S"));
//        System.out.println(treeMap.containsValue(40));

//        System.out.println(treeMap.keySet());
//        System.out.println(treeMap.values());

//        System.out.println(treeMap.entrySet());

//        System.out.println(treeMap.firstEntry());
//        System.out.println(treeMap.lastEntry());

//        System.out.println(treeMap.headMap("J"));
//        System.out.println(treeMap.tailMap("J"));

//        System.out.println(treeMap.subMap("B", "S"));

//        System.out.println(treeMap.comparator());

        Set<String> keySet = treeMap.keySet();
//        Iterator<>
    }
}
