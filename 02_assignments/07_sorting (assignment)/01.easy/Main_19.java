/* LEETCODE (# 1331) */

// import java.util.Arrays;

public class Main_19 {
  // public int[] arrayRankTransform(int[] arr) {
  //   if (arr.length == 0) {
  //     return arr;
  //   }

  //   int[] temp = arr.clone();
  //   Arrays.sort(temp);

  //   int[] rank = new int[temp.length];
  //   int r = 1;

  //   rank[0] = r;

  //   for (int i = 1; i < temp.length; i++) {
  //     if (temp[i] != temp[i - 1]) {
  //       r++;
  //     }
  //     rank[i] = r;
  //   }

  //   for (int i = 0; i < arr.length; i++) {
  //     int index = binarySearch(temp, arr[i]);
  //     arr[i] = rank[index];
  //   }
  //   return arr;
  // }

  // static int binarySearch(int[] arr, int target) {
  //   int low = 0;
  //   int high = arr.length - 1;

  //   while (low <= high) {
  //     int mid = low + (high - low) / 2;

  //     if (arr[mid] == target) {
  //       return mid;
  //     } else if (arr[mid] < target) {
  //       low = mid + 1;
  //     } else {
  //       high = mid - 1;
  //     }
  //   }

  //   return -1;
  // }
}
