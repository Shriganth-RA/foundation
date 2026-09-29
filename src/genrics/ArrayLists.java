package genrics;

import java.util.ArrayList;

public class ArrayLists<T> {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ragul");
        list.add("Pravin");
        list.add("Kavin");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
