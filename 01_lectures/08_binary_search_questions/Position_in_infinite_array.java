public class Position_in_infinite_array {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;

        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for target to lie in range
        while (target > arr[end]) {
            int newStart = end + 1;
            // end = prev end + boxSize * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }

    static int search(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
