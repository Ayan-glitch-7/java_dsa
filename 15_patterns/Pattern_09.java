public class Pattern_09 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int originalN = n;
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int left = j;
                int right = n - j;
                int up = i;
                int down = n - i;

                int value1 = Math.max(left, right);
                int value2 = Math.max(up, down);
                int value = Math.max(value1, value2);
                int val = (value - originalN);

                System.out.print(val + " ");

            }
            System.out.println();
        }
    }
}
