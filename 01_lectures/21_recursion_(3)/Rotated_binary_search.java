public class Rotated_binary_search {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int ans = search(arr, 0, arr.length - 1, 3);
        System.out.println(ans);
    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, start, mid - 1, target);
            } else {
                return search(arr, mid + 1, end, target);
            }
        } else if (arr[mid] < target && target <= arr[end]) {
            return search(arr, mid + 1, end, target);
        } else {
            return search(arr, start, mid - 1, target);
        }
    }
}
