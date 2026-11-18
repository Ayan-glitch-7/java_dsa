public class Reverse_a_number {
    public static void main(String[] args) {
        System.out.println(reverse2(1234));
    }

    static int sum = 0;

    static void reverse1(int n) {
        if (n == 0) {
            return;
        }

        int d = n % 10;
        sum = sum * 10 + d;
        n = n / 10;

        reverse1(n);
    }

    static int reverse2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another helper function

        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        n = n / 10;

        return rem * (int) (Math.pow(10, digits - 1)) + helper(n, digits - 1);
    }
}
