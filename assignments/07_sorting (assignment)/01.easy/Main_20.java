/* LEETCODE (# 1356) */

public class Main_20 {
  // public int[] sortByBits(int[] arr) {

  //   int[][] copy = new int[arr.length][2];

  //   for (int i = 0; i < arr.length; i++) {
  //     copy[i][0] = arr[i];
  //     copy[i][1] = Integer.bitCount(arr[i]);
  //   }

  //   for (int i = 0; i < copy.length; i++) {
  //     for (int j = 1; j < copy.length - i; j++) {

  //       if (copy[j - 1][1] > copy[j][1] || (copy[j - 1][1] == copy[j][1] && copy[j - 1][0] > copy[j][0])) {
  //         int[] temp = copy[j - 1];
  //         copy[j - 1] = copy[j];
  //         copy[j] = temp;
  //       }
  //     }
  //   }

  //   for (int i = 0; i < arr.length; i++) {
  //     arr[i] = copy[i][0];
  //   }

  //   return arr;
  // }
}
