import java.util.Arrays;

public class Mismatch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 4 };
    int[] answer = findErrorNums(arr);
    System.out.println(Arrays.toString(answer));
  }

  static int[] findErrorNums(int[] arr) {
    int[] ans = new int[2];
    int i = 0;

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
        ans[0] = arr[j];
        ans[1] = j + 1;
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
