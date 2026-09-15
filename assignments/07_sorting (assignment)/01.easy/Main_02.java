/* LEETCODE (# 169) */

public class Main_02 {
  public int majorityElement(int[] nums) {
    int n = nums.length;

    bubbleSort(nums);

    int i = 0;

    while (i < n) {
      int count = 1;

      while (i + count < n && nums[i] == nums[i + count]) {
        count++;
      }

      if (count > n / 2) {
        return nums[i];
      }

      i = i + count;
    }

    return -1;
  }

  static void bubbleSort(int[] arr) {
    boolean swapped;

    for (int i = 0; i < arr.length; i++) {
      swapped = false;

      for (int j = 1; j < arr.length; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          swapped = true;
        }
      }

      if (swapped == false) {
        break;
      }
    }
  }
}
