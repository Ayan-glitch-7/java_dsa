/* LEETCODE (#540) */

public class Main_02 {
    // public int singleNonDuplicate(int[] nums) {

    //     int start = 0;
    //     int end = nums.length - 1;

    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (mid == 0 || mid == nums.length - 1) {
    //             return nums[mid];
    //         } else if (nums[mid] == nums[mid - 1] && mid % 2 == 0) {
    //             end = mid - 1;
    //         } else if (nums[mid] == nums[mid - 1] && mid % 2 != 0) {
    //             start = mid + 1;
    //         } else if (nums[mid] == nums[mid + 1] && mid % 2 == 0) {
    //             start = mid + 1;
    //         } else if (nums[mid] == nums[mid + 1] && mid % 2 != 0) {
    //             end = mid - 1;
    //         } else {
    //             return nums[mid];
    //         }
    //     }
    //     return -1;
    // }
}
