/* LEETCODE (# 350) */

// import java.util.Arrays;

public class Main_06 {
  // public int[] intersect(int[] nums1, int[] nums2) {

  //   int[] ans = new int[nums2.length];
  //   int j = 0;

  //   Arrays.sort(nums1);
  //   Arrays.sort(nums2);

  //   for (int i = 0; i < nums2.length; i++) {
  //     int ans1 = binarySearch(nums1, nums2[i]);

  //     if (ans1 != -1) {
  //       ans[j++] = nums2[i];
  //       nums1[ans1] = Integer.MIN_VALUE;
  //       Arrays.sort(nums1);
  //     }
  //   }
  //   return Arrays.copyOf(ans, j);
  // }

  // public int binarySearch(int[] arr, int target) {

  //   int start = 0;
  //   int end = arr.length - 1;

  //   while (start <= end) {
  //     int mid = start + (end - start) / 2;

  //     if (arr[mid] < target) {
  //       start = mid + 1;
  //     } else if (arr[mid] > target) {
  //       end = mid - 1;
  //     } else {
  //       return mid;
  //     }
  //   }
  //   return -1;
  // }
}
