package PatternPrinting;

public class Butterfly {
    static void main() {
        int n = 5;

        int row = n;
        int col = 2 * n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < col; j++) {
                if (j <= i || j >= col - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int x = n - 2; x >= 0; x--) {
            for (int y = 0; y < col; y++) {
                if (y <= x || y >= col - 1 - x) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
