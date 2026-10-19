public class Power {
    public static void main(String[] args) {
        // a is base
        // b is power

        int a = 3;
        int b = 6;

        int ans = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a;
            }
            a = a * a;
            b = b >> 1;
        }
        System.out.println(ans);
    }
}
