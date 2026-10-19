public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        /* swapping numbers */
        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        swap(a, b);
        System.out.println(a + " " + b);
    }

    /* using method: */
    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // this change will only be valid in this function scope only
    }
}
