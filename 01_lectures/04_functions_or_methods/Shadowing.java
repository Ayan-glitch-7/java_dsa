public class Shadowing {
    static int x = 99; // this will be shadowed at line 6

    public static void main(String[] args) {
        System.out.println(x); // 99
        int x = 100; // class variable at line 2 will be shadowed by this
        x = 101;
        System.out.println(x); // 101
        fun();
    }

    static void fun() {
        System.out.println(x); // 99
    }
}
