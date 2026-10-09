package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Book {
    private String name;
    private long price;

    public Book(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{Name: " + name + ", Price: " + price + "}";
    }
}

public class ConcurrentModificationExample {
    static void main() {
//        TreeMap<Integer, Book> books = new TreeMap<>();
//        books.put(100, new Book("Book1", 546446));
//        books.put(108, new Book("Book2", 654477));
//        books.put(189, new Book("Book3", 523154));
//        books.put(121, new Book("Book4", 848546));
//        books.put(165, new Book("Book5", 456788));
//        books.put(132, new Book("Book6", 354844));
//
//        Set<Map.Entry<Integer, Book>> bookSet = books.entrySet();
//        Iterator<Map.Entry<Integer, Book>> iterator = bookSet.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        HashMap<Integer, Book> books = new HashMap<>();
        books.put(100, new Book("Book1", 546446));
        books.put(108, new Book("Book2", 654477));
        books.put(189, new Book("Book3", 523154));
        books.put(121, new Book("Book4", 848546));
        books.put(165, new Book("Book5", 456788));
        books.put(132, new Book("Book6", 354844));

        ConcurrentHashMap<Integer, Book> chm = new ConcurrentHashMap<>(books);

        Set<Map.Entry<Integer, Book>> bookSet = chm.entrySet();
        Iterator<Map.Entry<Integer, Book>> iterator = bookSet.iterator();
        while (iterator.hasNext()) {
            chm.put(1112, new Book("Book10", 53546));
//            System.out.println(iterator.next());
            iterator.next();
        }

        books.clear();
        books.putAll(chm);

        Iterator<Map.Entry<Integer, Book>> bookIterate = books.entrySet().iterator();
        while (bookIterate.hasNext()) {
            System.out.println(bookIterate.next());
        }
    }
}
