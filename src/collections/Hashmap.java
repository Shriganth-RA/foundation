package collections;

import genrics.ArrayLists;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }
}
