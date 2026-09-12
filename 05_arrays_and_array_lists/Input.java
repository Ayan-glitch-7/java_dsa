
import java.util.Arrays;
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // int[] arr = new int[5];
    // arr[0] = 23;
    // arr[1] = 45;
    // arr[2] = 56;
    // arr[3] = 86;
    // arr[4] = 20;
    // System.out.println(Arrays.toString(arr));

    // input using for loops:
    // for (int i = 0; i < 5; i++) {
    // arr[i] = in.nextInt();
    // }

    // for (int i = 0; i < 5; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // for(int num : arr) { //for every element in array print the array
    // System.out.println(num + " "); //here num represents the elements of the
    // array
    // }

    // arrays of objects:
    String[] str = new String[5];
    for (int i = 0; i < str.length; i++) {
      str[i] = in.next();
    }
    System.out.println(Arrays.toString(str));

    in.close();
  }
}
