package genrics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
    public void display(List<?> list) {
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnboundedWildcard uw = new UnboundedWildcard();

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        uw.display(l1);

        List<String> l2 = Arrays.asList("Shriganth", "Arul", "Vikram", "Ajay");
        uw.display(l2);
    }
}
