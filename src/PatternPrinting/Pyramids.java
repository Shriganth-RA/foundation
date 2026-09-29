package PatternPrinting;

public class Pyramids {
    static void main() {
        int row = 5;
        int col = 2 * row - 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2 - i; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l < 2 * i + 1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
