public class Search_in_range {
  public static void main(String[] args) {

    int[] nums = { 3, 4, 65, 22, 63, 76, 43, 66, 0 };
    int target = 22;

    int ans1 = linearSearch1(nums, target, 2, 5);
    System.out.println(ans1);
  }

  // search int the array : return the index if item found
  // otherwise if item not found return -1
  static int linearSearch1(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int i = start; i <= end; i++) {
      // check for element at every index if it is = target
      int element = arr[i];
      if (element == target) {
        return i;
      }
    }

    // this line will be only executed if above no return statement is executed
    // hence target not found
    return -1;
  }
}
