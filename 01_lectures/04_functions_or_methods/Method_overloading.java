public class Method_overloading {
    public static void main(String[] args) {
        fun(67);
        fun("ayan");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}