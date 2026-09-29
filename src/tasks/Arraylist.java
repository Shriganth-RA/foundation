package tasks;

import genrics.ArrayLists;

import java.util.*;

public class Arraylist {
    static void main() {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Queue<Integer> list1 = new PriorityQueue<>();

        Queue<Integer> list2 = new ArrayDeque<>(Arrays.asList(10, 20, 30));

        System.out.println(list2.element());

        System.out.println(list.subList(2, 4));

//        list.add(4, 10);
//
//        list.set(5, 88);
//
//        list.remove(9);
//
//        for (Integer i : list) {
//            System.out.print(i + " ");
//        }
    }
}
