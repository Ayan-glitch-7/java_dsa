import java.util.Scanner;

public class Main_07 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter number : ");
    int num = in.nextInt();

    prime(num);

    in.close();
  }

  static void prime(int num) {
    if (num <= 1) {
      System.out.println(num + " is not prime");
      return;
    }

    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        System.out.println(num + " is not prime");
        return;
      }
    }

    System.out.println(num + " is prime");
  }
}
