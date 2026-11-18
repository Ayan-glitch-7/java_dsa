public class Reverse_a_number {
    public static void main(String[] args) {
        reverse1(1342);
        System.out.println(sum);
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
}
