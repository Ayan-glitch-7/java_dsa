public class Fibonacci_number {
    public static void main(String[] args) {
        int ans = fibonacci(7);
        System.out.println(ans);
        ;
    }

    static int fibonacci(int n) {

        // base condition:
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
