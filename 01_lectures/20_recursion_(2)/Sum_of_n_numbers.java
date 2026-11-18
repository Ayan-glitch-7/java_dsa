public class Sum_of_n_numbers {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    static int sum(int n) {
        if (n < 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
