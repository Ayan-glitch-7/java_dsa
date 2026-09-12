public class Find_max_in_2D_array {
  public static void main(String[] args) {
    int[][] arr = {
        { 23, 5, 7 },
        { 3, 56, 76 },
        { 32, 54, 45 },
        { 43, 67, 9 },
        { 21, 90, 71 }
    };

    int ans = search(arr);
    System.out.println(ans);
  }

  static int search(int[][] arr) {
    int max = arr[0][0];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
    }
    return max;
  }
}