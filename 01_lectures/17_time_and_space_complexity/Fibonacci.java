public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

    static long fibonacci(int n) {

        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
