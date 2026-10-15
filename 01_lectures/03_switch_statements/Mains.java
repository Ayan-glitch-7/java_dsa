import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String fruit = in.next();

    // if(fruit.equals("mango")) {
    // System.out.println("YELLOW");
    // }

    // if(fruit.equals("apple")) {
    // System.out.println("RED");
    // }

    /*
     * SYNTAX OF SWITCH STATEMENT:
     * switch (expression) {
     * //cases
     * case one:
     * //block one
     * break;
     * 
     * case two:
     * //block two
     * break;
     * 
     * default:
     * //block 3
     */

    switch (fruit) {
      case "mango":
        System.out.println("YELLOW");
        break;
      case "apple":
        System.out.println("RED");
        break;
      case "orange":
        System.out.println("ORANGE");
        break;
      case "grapes":
        System.out.println("GREEN");
        break;
      default:
        System.out.println("INVALID!");
        break;
    }

    in.close();
  }
}
