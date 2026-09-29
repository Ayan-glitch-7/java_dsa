public class Comparison {
  public static void main(String[] args) {
    String a = "Ayan";
    String b = "Ayan";

    System.out.println(a == b); // true

    String c = "Ayan";
    String d = new String("Ayan");

    System.out.println(c == d); // false

    System.out.println(c.equals(d)); // true

    System.out.println(a.charAt(0)); // A
  }
}
