package PatternPrinting;

public class Problem2 {
    static void main() {
        int row = 4;
        int col = 4;

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
