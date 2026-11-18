public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1343));
    }

    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        int d = n % 10;
        n = n / 10;

        return d + sumDigits(n);
    }
}
