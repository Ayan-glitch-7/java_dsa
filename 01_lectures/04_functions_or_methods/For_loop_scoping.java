public class For_loop_scoping {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 99;
            int a = 9;
        }
        // System.out.println(i);
        // anything initialized outside the block can be used inside the block but
        // anythinh initialized inside the block cannot be used outside the block
    }
}
