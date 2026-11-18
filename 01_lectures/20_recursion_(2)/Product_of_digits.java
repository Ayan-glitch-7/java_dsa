public class Product_of_digits {
    public static void main(String[] args) {
        System.out.println(prodDigits(1342));
    }

    static int prodDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int d = n % 10;
        n = n / 10;

        return d * prodDigits(n);
    }
}
