
import java.util.Scanner;

public class Argument_string {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("enter your name: ");
    String name = in.next();

    String message = myGreet(name);
    System.out.println(message);

    in.close();
  }

  static String myGreet(String name) {
    String message = "how are you " + name;
    return message;
  }

}
