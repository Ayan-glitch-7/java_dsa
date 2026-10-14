public class Pattern_06 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(" *");
                }
                System.out.println();
            } else {
                for (int j = 0; j < i - n; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * n - i; k++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
