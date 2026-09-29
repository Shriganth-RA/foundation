package tasks;

public class MissingArrayElements {
    static void main() {
        int[] arr = {1, 3, 5, 7, 8, 10, 15};
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == count) {
                count++;
            } else {
                System.out.print(count + " ");
                i--;
                count++;
            }
        }
    }
}
