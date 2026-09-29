package genrics;

import java.util.Arrays;
import java.util.List;

public class LowerboundWildcard {
    public void display(List<? super Integer> list) {
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LowerboundWildcard lw = new LowerboundWildcard();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.print("Print integer values: ");
        lw.display(list1);

        List<Number> list2 = Arrays.asList(1.2, 2.2, 5.6, 3.9);
        System.out.print("Print double values: ");
        lw.display(list2);
    }
}
