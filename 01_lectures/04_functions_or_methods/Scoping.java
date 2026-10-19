public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // a = 45; //already initialized outside the block in the same method hence you
            // cannot initialize it again
            a = 100; // can update the value only
            System.out.println(a);
            int c = 34;
            // values initialized in this block will remain in this block
        }
        // System.out.println(c);
        // cannot be used outside the block
        System.out.println(a);
    }

    static void random() {
        int num = 67;
        System.out.println(num);
    }
}
