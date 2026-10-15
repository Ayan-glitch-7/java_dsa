/* LEETCODE (# 1030) */

public class Main_15 {
  // public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

  //   int[][] ans = new int[rows * cols][2];
  //   int[] distance = new int[rows * cols];

  //   int k = 0;

  //   for (int i = 0; i < rows; i++) {
  //     for (int j = 0; j < cols; j++) {

  //       ans[k][0] = i;
  //       ans[k][1] = j;

  //       distance[k++] = Math.abs(i - rCenter) + Math.abs(j - cCenter);
  //     }
  //   }

  //   for (int i = 0; i < distance.length; i++) {
  //     for (int j = i + 1; j < distance.length; j++) {
  //       if (distance[i] > distance[j]) {
  //         swapValue(distance, i, j);
  //         swapArrayValue(ans, i, j);
  //       }
  //     }
  //   }
  //   return ans;
  // }

  // static void swapValue(int[] arr, int first, int second) {
  //   int temp = arr[first];
  //   arr[first] = arr[second];
  //   arr[second] = temp;
  // }

  // static void swapArrayValue(int[][] arr, int first, int second) {
  //   int[] temp = arr[first];
  //   arr[first] = arr[second];
  //   arr[second] = temp;
  // }
}
