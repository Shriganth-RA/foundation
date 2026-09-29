package genrics;

import java.util.ArrayList;
import java.util.List;

class Repository<T> {
    List<T> arrayLists = new ArrayList<>();

    public void add(T obj) {
        arrayLists.add(obj);
    }
    public void remove(T obj) {
        arrayLists.remove(obj);
    }
    public T get(int index) {
        return arrayLists.get(index);
    }
    public List<T> getAll() {
        return arrayLists;
    }
}

public class GenericsTask6 {
    static void main() {
        Repository<Integer> r1 = new Repository<>();
        r1.add(10);
        r1.add(20);
        r1.add(30);
        r1.add(40);
        r1.add(50);
        r1.remove(30);
        System.out.println("Arraylist of R1: " + r1.getAll());

        Repository<String> r2 = new Repository<>();
        r2.add("Shriganth");
        r2.add("Abishek");
        r2.add("Suriya");
        r2.add("Dinesh");
        r2.add("Kalai");
        System.out.println("Arraylist of R2: " + r2.getAll());
        System.out.println("Elements of index[1] in R2: " + r2.get(2));
    }
}
