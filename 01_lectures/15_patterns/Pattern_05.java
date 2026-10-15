public class Pattern_05 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
