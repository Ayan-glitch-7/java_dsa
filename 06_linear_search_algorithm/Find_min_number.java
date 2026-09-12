public class Find_min_number {
  public static void main(String[] args) {
    int[] nums = { 3, 4, 65, -2, 63, 76, 43, 66, 0 };

    int ans = minNumber(nums);
    System.out.println(ans);
  }

  // assume arr.length != 0
  // return the minimum value in the array
  static int minNumber(int[] arr) {
    int min = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}
