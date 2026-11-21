public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 9, 7 };
        boolean ans = sorted(arr, 0);
        System.out.println(ans);
    }

    static boolean sorted(int[] arr, int i) {
        // base condition
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] <= arr[i + 1] && sorted(arr, i + 1);
    }
}
