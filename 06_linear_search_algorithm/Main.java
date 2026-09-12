public class Main {
  public static void main(String[] args) {
    int[] nums = { 3, 4, 65, 22, 63, 76, 43, 66, 0 };
    int target = 0;

    int ans1 = linearSearch1(nums, target);
    System.out.println(ans1);

    int ans2 = linearSearch2(nums, target);
    System.out.println(ans2);

    boolean ans3 = linearSearch3(nums, target);
    System.out.println(ans3);
  }

  // search int the array : return the index if item found
  // otherwise if item not found return -1
  static int linearSearch1(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int i = 0; i < arr.length; i++) {
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

  // search the target and return the element
  static int linearSearch2(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int i = 0; i < arr.length; i++) {
      // check for element at every index if it is = target
      int element = arr[i];
      if (element == target) {
        return element;
      }
    }

    // this line will be only executed if above no return statement is executed
    // hence target not found
    return Integer.MAX_VALUE;
  }

  // search the target and return true or false
  static boolean linearSearch3(int[] arr, int target) {
    if (arr.length == 0) {
      return false;
    }

    // run a for loop
    for (int i = 0; i < arr.length; i++) {
      // check for element at every index if it is = target
      int element = arr[i];
      if (element == target) {
        return true;
      }
    }

    // this line will be only executed if above no return statement is executed
    // hence target not found
    return false;
  }
}
