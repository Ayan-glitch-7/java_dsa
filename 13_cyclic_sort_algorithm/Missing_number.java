
public class Missing_number {
  public static void main(String[] args) {
    int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    int ans = missing(arr);
    System.out.println(ans);
  }

  static int missing(int[] arr) {
    int i = 0;

    while (i < arr.length) {
      int correct = arr[i];

      if (arr[i] < arr.length && arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }

    for (int j = 0; j < arr.length; j++) {
      if (j != arr[j]) {
        return j;
      }
    }

    return arr.length;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
