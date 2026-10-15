import java.util.Scanner;

public class Main_04 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();

    int x = a;
    int y = b;

    while (y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }

    int hcf = x;
    int lcm = (a * b) / hcf;

    System.out.println("HCF = " + hcf);
    System.out.println("LCM = " + lcm);

    in.close();
  }
}
