/* LEETCODE (# 1636) */

// import java.util.Arrays;

public class Main_26 {
  // public int[] frequencySort(int[] nums) {

  //   Arrays.sort(nums);

  //   int[][] freq = new int[nums.length][2];

  //   for (int i = 0; i < nums.length; i++) {
  //     int frequency = 0;

  //     for (int j = 0; j < nums.length; j++) {
  //       if (nums[j] == nums[i]) {
  //         frequency++;
  //       }
  //     }
  //     freq[i][0] = nums[i];
  //     freq[i][1] = frequency;
  //   }

  //   bubbleSort(freq);

  //   for (int i = 0; i < nums.length; i++) {
  //     nums[i] = freq[i][0];
  //   }
  //   return nums;
  // }

  // static void bubbleSort(int[][] arr) {
  //   for (int i = 0; i < arr.length; i++) {
  //     for (int j = 1; j < arr.length; j++) {
  //       if ((arr[j - 1][1] > arr[j][1]) || ((arr[j - 1][1] == arr[j][1]) && (arr[j - 1][0] < arr[j][0]))) {
  //         int[] temp = arr[j];
  //         arr[j] = arr[j - 1];
  //         arr[j - 1] = temp;
  //       }
  //     }
  //   }
  // }
}
