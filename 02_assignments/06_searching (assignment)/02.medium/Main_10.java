/* LEETCODE (#875) */

// import java.util.Arrays;

public class Main_10 {
  // public int minEatingSpeed(int[] piles, int h) {
  //   Arrays.sort(piles);
  //   int low = 1;
  //   int high = piles[piles.length - 1];
  //   int k = 1;

  //   while (low <= high) {
  //     int mid = low + (high - low) / 2;
  //     long value = 0;

  //     for (int i = 0; i < piles.length; i++) {
  //       long result = (piles[i] + mid - 1) / mid;
  //       value = value + result;
  //     }

  //     if (value <= h) {
  //       k = mid;
  //       high = mid - 1;
  //     } else {
  //       low = mid + 1;
  //     }
  //   }
  //   return (int) k;
  // }
}