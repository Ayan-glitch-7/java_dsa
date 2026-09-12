import java.util.Arrays;

public class Search_in_2D_array {
  public static void main(String[] args) {
    int[][] arr = {
        { 23, 5, 7 },
        { 3, 56, 76 },
        { 32, 54, 45 },
        { 43, 67, 9 },
        { 21, 90, 71 }
    };
    int target = 54;

    int[] ans = search(arr, target); // format of return value {row, column}
    System.out.println(Arrays.toString(ans));
  }

  static int[] search(int[][] arr, int target) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}