public class Pattern_08 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }

                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }

                System.out.println();
            } else {
                for (int j = 1; j <= i - n; j++) {
                    System.out.print("  ");
                }

                for (int j = 2 * n - i; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                for (int j = 2; j <= 2 * n - i; j++) {
                    System.out.print(j + " ");
                }

                System.out.println();
            }
        }
    }
}
