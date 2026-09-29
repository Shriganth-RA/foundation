package PatternPrinting;

public class TowerofHanoi {
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 0) {
            return;
        }

        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("The disc " + n + " moved from " + fromRod + " to " + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    static void main() {
        int n = 4;

        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
