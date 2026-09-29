package genrics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTask7 {
    public List<?> printList(List<?> list) {
        return list;
    }

    public Double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number l : list) {
            sum = sum + l.doubleValue();
        }
        return sum;
    }

    public void addNumbers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
        list.add(300);
    }


    public static void main(String[] args) {
        GenericsTask7 gt = new GenericsTask7();

        List<Integer> l1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Values of l1: " + gt.printList(l1));
        System.out.println("Sum of l1: " + gt.sumNumbers(l1));
        gt.addNumbers(l1);
        System.out.println("Values of l1 (After adding): " + gt.printList(l1));

        System.out.println();

        List<Double> l2 = new ArrayList<>(Arrays.asList(10.39, 49.00, 28.76, 56.99, 63.94));
        System.out.println("Values of l2: " + gt.printList(l2));
        System.out.println("Sum of l2: " + gt.sumNumbers(l2));
        gt.sumNumbers(l2);
        System.out.println("Values of l2 (After adding): " + gt.printList(l2));
    }
}
