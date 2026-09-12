public class Numbers_with_even_number_of_digits {
  public static void main(String[] args) {

    int[] nums = { 12, -45, 2, 6, 7896 };

    int ans = evenNumberOfDigits(nums);
    System.out.println(ans);
  }

  static int evenNumberOfDigits(int[] arr) {
    int even = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        arr[i] = arr[i] * -1;
      }

      int count = 0;

      while (arr[i] > 0) {
        count++;
        arr[i] = arr[i] / 10;
      }

      if (count % 2 == 0) {
        even++;
      }
    }
    return even;
  }
}