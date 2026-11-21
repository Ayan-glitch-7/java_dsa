public class Number_of_zeros {
    public static void main(String[] args) {
        System.out.println(count(10010001));

    }

    // special pattern, how to pass a number to above calls
    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        n = n / 10;

        if (rem == 0) {
            return helper(n, c + 1);
        } else {
            return helper(n, c);
        }
    }
}
