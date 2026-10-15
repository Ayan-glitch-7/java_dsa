
import java.util.Scanner;

public class Type_casting {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // float num = in.nextFloat();
    // int num1 = in.nextInt();
    // System.out.println(num);
    // System.out.println(num1);

    // TYPE CASTING:
    // int num = (int)(78.754753);
    // System.out.println(num);

    // AUTOMATIC TYOE PROMOTION IN EXPRESSIONS:
    // int a = 257;
    // byte b = (byte)(a);
    // System.out.println(b);

    // byte a = 40;
    // byte b = 50;
    // byte c = 100;
    // int d = (a * b) / c;
    // System.out.println(d);

    // byte b = 50;
    // b = b * 2;

    // int num = 'A';
    // System.out.println(num);

    // System.out.println(3 *5.5);

    // REVIEW:
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = 0.1234;

    // smaller ones will be converted into bigger ones
    double result = (f * b) + (i / c) - (d * s);
    System.out.println((f * b) + " " + (i / c) + " " + (d * s));
    System.out.println(result);

    in.close();
  }
}
