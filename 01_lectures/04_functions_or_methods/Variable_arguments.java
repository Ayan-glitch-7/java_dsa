import java.util.Arrays;

public class Variable_arguments {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        multiple(2, 3, "ayan", "aditi", "kalyani");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
