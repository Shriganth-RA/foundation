package genrics;

public class GenericsTask5 {
    public <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];

        for (T value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    static void main() {
        GenericsTask5 gt1 = new GenericsTask5();

        Integer[] l1 = {9, 4, 8, 3, 0};
        Double[] l2 = {78.33, 90.67, 25.45, 21.99};

        System.out.println("Maximum value of Integer array: " + gt1.findMax(l1));
        System.out.println("Maximum value of Double array: " + gt1.findMax(l2));
    }
}
