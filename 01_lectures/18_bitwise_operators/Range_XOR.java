public class Range_XOR {
    public static void main(String[] args) {
        // range xor for a, b = xor(b) ^ xor(a-1)

        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);

        // only for check, this will give TLE
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 = ans2 ^ i;
        }
        System.out.println(ans2);
    }

    // this gives XOR from 0 to a
    static int xor(int a) {
        switch (a % 4) {
            case 0 -> {
                return a;
            }
            case 1 -> {
                return 1;
            }
            case 2 -> {
                return a + 1;
            }
            default -> {
                return 0;
            }
        }
    }
}
