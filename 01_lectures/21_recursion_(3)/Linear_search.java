public class Linear_search {
    public static void main(String[] args) {
        int[] arr = { 12, 8, 6, 7, 9, 11 };
        System.out.println(search(arr, 0, 9));
    }

    static int search(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        } else {
            return search(arr, i + 1, target);
        }
    }
}
