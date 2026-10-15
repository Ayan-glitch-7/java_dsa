
import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    /* SYNTAX: */
    ArrayList<Integer> list = new ArrayList<>(10);

    // list.add(4);
    // list.add(6);
    // list.add(8);
    // list.add(94);
    // list.add(674);

    // list.set(0, 99);

    // list.remove(2);

    // System.out.println(list);
    // System.out.println(list.contains(674));

    in.close();

    // INPUT:
    for (int i = 0; i < 5; i++) {
      list.add(in.nextInt());
    }

    // get item at any index:
    for (int i = 0; i < 5; i++) {
      System.out.println(list.get(i)); // pass index here , list[index] syntax will not work here
    }
    // System.out.println(list);
  }
}
