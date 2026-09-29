package genrics;

import java.util.ArrayList;
import java.util.List;

public class UpperboundWildcard {
    public Double calculateSum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number l : list) {
            sum = sum + l.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        UpperboundWildcard uw = new UpperboundWildcard();

        List<Integer> l1 = new ArrayList<>();
        l1.add(20);
        l1.add(100);

        List<Double> l2 = new ArrayList<>();
        l2.add(20.143);
        l2.add(98.55);
        l2.add(34.212);

        System.out.println("Print sum value of Integer: " + uw.calculateSum(l1));
        System.out.println("Print sum value of Double: " + uw.calculateSum(l2));
    }
}
