import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        sum();
    }

    /*
     * METHOD:
     * return_type name() {
     * //body
     * return statement
     * }
     */

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("enter 1st number: ");
        num1 = in.nextInt();

        System.out.print("enter 2st number: ");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("Sum = " + sum);

        in.close();
    }
}
