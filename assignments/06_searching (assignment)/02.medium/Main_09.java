/* LEETCODE (#1802) */

public class Main_09 {
  // public int maxValue(int n, int index, int maxSum) {
  //   long low = 1;
  //   long high = maxSum;
  //   int ans = 1;

  //   while (low <= high) {
  //     long mid = low + (high - low) / 2;
  //     long sum = mid;

  //     // Left side =>
  //     long left = index;

  //     if (mid > left) {
  //       sum = sum + (mid - 1 + mid - left) * left / 2;
  //     } else {
  //       sum = sum + mid * (mid - 1) / 2;
  //       sum = sum + left - mid + 1;
  //     }

  //     // Right side =>
  //     long right = n - index - 1;

  //     if (mid > right) {
  //       sum = sum + (mid - 1 + mid - right) * right / 2;
  //     } else {
  //       sum = sum + mid * (mid - 1) / 2;
  //       sum = sum + right - mid + 1;
  //     }

  //     if (sum <= maxSum) {
  //       ans = (int) mid;
  //       low = mid + 1;
  //     } else {
  //       high = mid - 1;
  //     }
  //   }

  //   return ans;
  // }
}