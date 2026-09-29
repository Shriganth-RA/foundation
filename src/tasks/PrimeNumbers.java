package tasks;

public class PrimeNumbers {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 33};

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 1; j < arr[i]; j++) {
                if ((j != 1) && arr[i] % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
