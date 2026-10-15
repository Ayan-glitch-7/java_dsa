
import java.util.Arrays;
import java.util.Scanner;

public class Array_input_output {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // int[][] arr2D = {
    // {1, 2, 3}, //0th index
    // {4, 5, 6}, //1st index
    // {7, 8, 9} //2nd index -> arr2D[2] = {7, 8, 9}
    // };

    int[][] arr = new int[3][3];
    System.out.println(arr.length); // no of rows

    /* INPUT: */

    // for each row:
    for (int row = 0; row < arr.length; row++) {
      // for each column in every row:
      for (int column = 0; column < arr[row].length; column++) {
        // input values:
        arr[row][column] = in.nextInt();
      }
    }

    in.close();

    /* OUTPUT: */

    // for each row:
    // for (int row = 0; row < arr.length; row++) {
    // // for each column in every row:
    // for (int column = 0; column < arr[row].length; column++) {
    // System.out.print(arr[row][column] + " ");
    // }
    // System.out.println();
    // }

    // for (int row = 0; row < arr.length; row++) {
    // System.out.println(Arrays.toString(arr[row]));
    // }

    for (int[] a : arr) {
      System.out.println(Arrays.toString(a));
    }
  }
}
