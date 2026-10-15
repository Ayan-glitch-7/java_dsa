public class Rotated_sorted_array {
  public static void main(String[] args) {

    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;
    System.out.println(findPivot(nums));
    System.out.println(binarySearch(nums, target, 0, nums.length - 1));
    System.out.println(search(nums, target));
  }

  static int search(int[] nums, int target) {
    int pivot = findPivot(nums);

    // if pivot is not found then it means that array is not rotated
    if (pivot == -1) {
      // just do normal binary search
      return binarySearch(nums, target, 0, nums.length - 1);
    }

    // if pivot is found then you have found two ascending sorted arrays
    if (nums[pivot] == target) {
      return pivot;
    }

    if (target >= nums[0]) {
      return binarySearch(nums, target, 0, pivot - 1);
    }

    return binarySearch(nums, target, pivot + 1, nums.length - 1);

  }

  static int binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {

      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        // answer found
        return mid;
      }
    }

    return -1;
  }

  // this will not work for duplicate values
  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      // 4 cases:
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }

      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }

      if (arr[mid] <= arr[start]) {
        end = mid - 1;
      }

      else {
        start = mid + 1;
      }
    }

    return -1;
  }
}