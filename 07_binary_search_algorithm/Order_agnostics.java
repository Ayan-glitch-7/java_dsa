public class Order_agnostics {
  public static void main(String[] args) {

    int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
    int target = 22;

    int ans = binarySearch(arr, target);
    System.out.println(ans);
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // find whether array is sorted in ascending or descending order
    boolean isAsc;
    if (arr[start] < arr[end]) {
      isAsc = true;
    } else {
      isAsc = false;
    }

    while (start <= end) {
      // int mid = (start + end) / 2; // there is a possibility that (start + end) may
      // exceed the integer range in java
      int mid = (start + (end - start) / 2);

      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {
        if (arr[mid] > target) {
          end = mid - 1;
        } else if (arr[mid] < target) {
          start = mid + 1;
        }
      } else {
        if (arr[mid] > target) {
          start = mid + 1;
        } else if (arr[mid] < target) {
          end = mid - 1;
        }
      }
    }
    return -1;
  }
}
