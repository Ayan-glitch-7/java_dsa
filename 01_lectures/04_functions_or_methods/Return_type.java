import java.util.Scanner;

public class Return_type {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("enter 1st number: ");
        num1 = in.nextInt();

        System.out.print("enter 2st number: ");
        num2 = in.nextInt();

        in.close();

        sum = num1 + num2;
        return sum;
    }
}