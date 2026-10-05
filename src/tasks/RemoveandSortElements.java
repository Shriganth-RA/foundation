package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class RemoveandSortElements {
    static void main() {

        ArrayList<String> names = new ArrayList<>(List.of("Thiyagaraj", "Nandhakumar", "Akash", "Jamal", "Nandhakumar", "Akash", "Akash", "Akash"));

        TreeSet<String> unique = new TreeSet<>(names);

//        for (int i = 0; i < names.size() - 1; i++) {
//            boolean isDelete = false;
//            for (int j = i + 1; j < names.size(); j++) {
//                if (Objects.equals(names.get(i), names.get(j))) {
//                    names.remove(j);
//                    isDelete = true;
//                }
//            }
//            if (isDelete) {
//                i--;
//            }
//        }
//
//        System.out.println(names);

        System.out.println(unique);
    }
}
