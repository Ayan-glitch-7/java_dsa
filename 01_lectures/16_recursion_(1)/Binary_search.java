public class Binary_search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 9, 112 };
        int target = 7;
        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1);
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        } else if (arr[mid] == target) {
            return mid;
        }

        return mid;
    }
}
