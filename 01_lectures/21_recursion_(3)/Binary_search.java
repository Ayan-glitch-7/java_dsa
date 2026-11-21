public class Binary_search {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };

        int ans = search(arr, 0, arr.length - 1, 6);
        System.out.println(ans);
    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] > target) {
            return search(arr, start, mid - 1, target);
        } else if (arr[mid] < target) {
            return search(arr, mid + 1, end, target);
        } else {
            return mid;
        }
    }
}
