public class Descending_binary_search {
  public static void main(String[] args) {

    int[] arr = { 89, 78, 63, 54, 34, 30, 22, 8, -5, -45, -654, -6433, -6542 };
    int target = 22;

    int ans = binarySearch(arr, target);
    System.out.println(ans);
  }

  // return the index
  // return -1 if it does not exists
  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      // int mid = (start + end) / 2; // there is a possibility that (start + end) may
      // exceed the integer range in java
      int mid = (start + (end - start) / 2);

      if (arr[mid] > target) {
        start = mid + 1; // reverse the conditions
      } else if (arr[mid] < target) {
        end = mid - 1; // reverse the conditions
      } else {
        return mid;
      }
    }
    return -1;
  }
}
