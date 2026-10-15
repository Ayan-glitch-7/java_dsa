
import java.util.Scanner;

public class Weekdays_and_weekends {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int day = in.nextInt();

    /* NORMAL SWITCH: */
    // switch (day) {
    // case 1:
    // case 2:
    // case 3:
    // case 4:
    // case 5:
    // System.out.println("WEEKDAYS");
    // break;
    // case 6:
    // case 7:
    // System.out.println("WEEKENDS");
    // break;
    // default:
    // System.out.println("INVALID!");
    // break;
    // }

    /* ENHANCED SWITCH: */
    switch (day) {
      case 1, 2, 3, 4, 5 -> System.out.println("WEEKDAYS");
      case 6, 7 -> System.out.println("WEEKENDS");
      default -> System.out.println("INVALID!");
    }

    in.close();
  }
}
