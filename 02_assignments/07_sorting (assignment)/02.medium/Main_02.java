/* LEETCODE (# 16) */

// import java.util.Arrays;

public class Main_02 {
  // public int threeSumClosest(int[] nums, int target) {

  //   Arrays.sort(nums);

  //   int minDiff = Integer.MAX_VALUE;
  //   int ans = 0;

  //   for (int i = 0; i < nums.length; i++) {
  //     if (i > 0 && nums[i] == nums[i - 1]) {
  //       continue;
  //     }

  //     int start = i + 1;
  //     int end = nums.length - 1;

  //     while (start < end) {
  //       int sum = nums[i] + nums[start] + nums[end];
  //       int diff = Math.abs(sum - target);

  //       if (diff < minDiff) {
  //         minDiff = diff;
  //         ans = sum;
  //       }

  //       if (sum == target) {
  //         return sum;
  //       } else if (sum < target) {
  //         start++;
  //       } else if (sum > target) {
  //         end--;
  //       }
  //     }
  //   }
  //   return ans;
  // }
}
