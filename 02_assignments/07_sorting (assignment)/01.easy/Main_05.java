/* LEETCODE (# 349) */

// import java.util.Arrays;

public class Main_05 {
  // public int[] intersection(int[] nums1, int[] nums2) {

  //   int[] ans = new int[nums2.length];
  //   int j = 0;

  //   Arrays.sort(nums1);
  //   Arrays.sort(nums2);

  //   for (int i = 0; i < nums2.length; i++) {
  //     boolean ans1 = binarySearch(nums1, nums2[i]);

  //     if (i > 0 && nums2[i] == nums2[i - 1]) {
  //       continue;
  //     }

  //     if (ans1 == true) {
  //       ans[j++] = nums2[i];
  //     }
  //   }
  //   return Arrays.copyOf(ans, j);
  // }

  // public boolean binarySearch(int[] arr, int target) {

  //   int start = 0;
  //   int end = arr.length - 1;

  //   while (start <= end) {
  //     int mid = start + (end - start) / 2;

  //     if (arr[mid] < target) {
  //       start = mid + 1;
  //     } else if (arr[mid] > target) {
  //       end = mid - 1;
  //     } else {
  //       return true;
  //     }
  //   }
  //   return false;
  // }
}
