public class Odd_even {
    public static void main(String[] args) {
        System.out.println(oddEven(68));
    }

    private static boolean oddEven(int n) {
        return ((n & 1) == 1);
    }

}
