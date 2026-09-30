package collections;

import genrics.ArrayLists;

import java.util.*;

public class Hashmap {
    static void main() {

//        Map<String, String> map1 = new HashMap<>();
//        map1.put("A", "tes1");
//        map1.put("B", "test2");
//        map1.put(null, null);
//
//        System.out.println(map1);


        String s1 = "Hello";
        String s2 = "Hello";

//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        String s3 = new String("Hello");
        String s4 = new String("Java");

//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.hashCode() == s3.hashCode());
//
//
//        System.out.println(s3.equals(s4));
//        System.out.println(s3.hashCode() == s4.hashCode());


        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" java");

        StringBuilder sb2 = new StringBuilder("Hello");

//        System.out.println(sb1 == sb2);
//        System.out.println(sb1.equals(sb2));

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Orange", 20);
        map.put("Jackfruit", 30);

//        System.out.println(map);

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//
//            System.out.println("Key: " + key + " Value: " + value);
//        }

        String s = "abbac";

//        System.out.println(s.toCharArray());

//        HashMap<String, Integer> freq = new HashMap<>();
//        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
//
//        }

        PriorityQueue<String> a = new PriorityQueue<>(Comparator.reverseOrder());
        a.add("a");
        a.add("c");
        a.add("e");
        a.add("a");
//        a.add(null);

        a.remove();

        System.out.println(a);


    }
}
