
import java.util.Scanner;

public class For_loops {
  public static void main(String[] args) {

    /*
     * SYANTAX OF FOR-LOOP:
     * for (initialization; condition; increment/decrement) {
     * // body
     * }
     */

    // Q-print numbers from 1 to 10:
    // for (int num = 1; num <= 10; num++) {
    // System.out.println(num);
    // }

    // Q-print numbers from 1 to n:
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int num = 1; num <= n; num++) {
      System.out.println(num);
    }

    in.close();
  }
}
