package genrics;

import java.util.Arrays;
import java.util.List;

class GenericMethod {
    public <T> void printArray(T[] list) {
        for (T l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
}

public class GenericsTask4 {
    static void main() {
        GenericMethod gm = new GenericMethod();

        Integer[] l1 = {1, 2, 3, 4, 5};
        Double[] l2 = {10.2, 40.93, 52.72, 92.00, 99.23};
        String[] l3 = {"Shriganth", "Kavin", "Rahul", "Naveen", "Abishek"};

        System.out.println("Values of l1");
        gm.printArray(l1);
        System.out.println("Values of l2");
        gm.printArray(l2);
        System.out.println("Values of l3");
        gm.printArray(l3);
    }
}
