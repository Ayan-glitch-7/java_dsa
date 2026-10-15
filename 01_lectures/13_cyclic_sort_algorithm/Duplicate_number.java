public class Duplicate_number {
  public static void main(String[] args) {
    int[] arr = { 3, 1, 3, 4, 2 };
    int answer = duplicate(arr);
    System.out.println(answer);
  }

  static int duplicate(int[] arr) {
    int i = 0;
    int ans = -1;

    while (i < arr.length) {
      int correct = arr[i] - 1;

      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }

    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j + 1) {
        ans = arr[j];
      }
    }
    return ans;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
