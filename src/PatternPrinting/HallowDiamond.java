package PatternPrinting;

public class HallowDiamond {
    static void main() {
        int row = 5;
        int col = 2 * row - 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2 + 1 + i; j++) {
                if (j == col / 2 + i || j == col / 2 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int x = row - 2; x >= 0; x--) {
            for (int y = 0; y < col / 2 + 1 + x; y++) {
                if (y == col / 2 - x || y == col / 2 + x) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
