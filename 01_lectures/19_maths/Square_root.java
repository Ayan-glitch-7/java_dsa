public class Square_root {
    public static void main(String[] args) {
        double ans = sqrt(40, 3);
        System.out.printf("%.3f", ans);
    }

    // TIME COMPLEXITY : O(log(n))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m > n) {
                e = m - 1;
            } else if (m * m < n) {
                s = m + 1;
            } else if (m * m == n) {
                return m;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root = root + incr;
            }

            root = root - incr;
            incr = incr / 10;
        }
        return root;
    }
}
