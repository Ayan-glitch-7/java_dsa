import java.util.ArrayList;

public class Duplicate_numbers {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    ArrayList<Integer> answer = duplicates(arr);
    System.out.println(answer);
  }

  static ArrayList<Integer> duplicates(int[] arr) {
    ArrayList<Integer> ans = new ArrayList<>();
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
        ans.add(arr[j]);
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
