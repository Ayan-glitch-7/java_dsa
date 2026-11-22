/* geeksforgeeks */

public class Main_02 {
    // public static void main(String[] args) {
    //     int[] arr = { 1, 4, 3, -5, -4, 8, 6 };

    //     ArrayList<Integer> res = maxMin(arr);

    //     System.out.println(res.get(0) + " , " + res.get(1));
    // }

    // public static ArrayList<Integer> maxMin(int[] arr) {
    //     return helper(arr, arr.length - 1);
    // }

    // private static ArrayList<Integer> helper(int[] arr, int i) {
    //     // base case
    //     if (i == 0) {
    //         ArrayList<Integer> base = new ArrayList<>();
    //         base.add(arr[0]);
    //         base.add(arr[0]);

    //         return base;
    //     }

    //     ArrayList<Integer> save = helper(arr, i - 1);

    //     if (arr[i] < save.get(0)) {
    //         save.set(0, arr[i]);
    //     }

    //     if (arr[i] > save.get(1)) {
    //         save.set(1, arr[i]);
    //     }

    //     return save;
    // }
}
