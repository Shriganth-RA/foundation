package PatternPrinting;

public class Diamond {
    static void main() {
        int row = 5;
        int col = 2 * row - 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int x = row - 1; x >= 0; x--) {
            for (int y = 0; y < col / 2 - x + 1; y++) {
                System.out.print("  ");
            }
            for (int z = 0; z < 2 * x - 1; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
