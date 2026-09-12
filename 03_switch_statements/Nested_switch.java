
import java.util.Scanner;

public class Nested_switch {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int empID = in.nextInt();
    String department = in.next();

    /* NORMAL SWITCH STATEMENT: */
    // switch (empID) {
    // case 1:
    // System.out.println("Ayan");
    // break;
    // case 2:
    // System.out.println("Aditi");
    // break;
    // case 3:
    // switch (department) {
    // case "CSIT":
    // System.out.println("CSIT");
    // break;
    // case "IT":
    // System.out.println("IT");
    // break;
    // default:
    // System.out.println("Invalid!");
    // }
    // break;
    // default:
    // System.out.println("Invalid!");
    // }

    /* ENHANCED SWITCH: */
    switch (empID) {
      case 1 -> System.out.println("Ayan");
      case 2 -> System.out.println("Aditi");
      case 3 -> {
        switch (department) {
          case "CSIT" -> System.out.println("CSIT");
          case "IT" -> System.out.println("IT");
          default -> System.out.println("Invalid!");
        }
      }
      default -> System.out.println("Invalid!");
    }

    in.close();
  }
}
