/* LEETCODE (# 238) */

public class Main_05 {
    // public int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int[] ans = new int[n];

    //     ans[0] = 1;

    //     // Product of all elements to the left
    //     for (int i = 1; i < n; i++) {
    //         ans[i] = ans[i - 1] * nums[i - 1];
    //     }

    //     int r = 1;

    //     // Product of all elements to the right
    //     for (int j = n - 1; j >= 0; j--) {
    //         ans[j] = ans[j] * r;
    //         r = r * nums[j];
    //     }

    //     return ans;
    // }
}
