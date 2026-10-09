package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationException {
    static void main() {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "William");
        students.put(104, "Arjun");
        students.put(102, "Jack");
        students.put(121, "Jamal");
        students.put(106, "Laurio");
        students.put(111, "Surya");
        students.put(115, "Shiva");


        Iterator<Map.Entry<Integer, String>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
//            students.put(221, "James");
//            iterator.remove();
            System.out.println(iterator.next());
        }
    }
}
