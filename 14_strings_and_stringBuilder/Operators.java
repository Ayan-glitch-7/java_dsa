import java.util.ArrayList;

public class Operators {
  public static void main(String[] args) {
    System.out.println('a' + 'b'); // 195
    System.out.println("a" + "b"); // ab
    System.out.println('a' + 3); // 100
    System.out.println((char) ('a' + 3)); // d
    System.out.println("a" + 1); // a1
    // integer will be converted to Integer that will call toString()
    // this is same as after a few steps: "a" + "1"

    System.out.println("Ayan" + new ArrayList<>()); // Ayan[]
    System.out.println("Ayan" + new Integer(7)); // Ayan7

    String ans = new Integer(7) + " " + new ArrayList<>();
    System.out.println(ans); // 7 []
  }
}
