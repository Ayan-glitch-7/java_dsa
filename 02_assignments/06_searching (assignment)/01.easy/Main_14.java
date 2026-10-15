/* LEETCODE (#888) */

public class Main_14 {
    // public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    //     int m = aliceSizes.length;
    //     int n = bobSizes.length;
    //     int aliceTotal = 0;
    //     int bobTotal = 0;

    //     for (int i = 0; i < m; i++) {
    //         aliceTotal += aliceSizes[i];
    //     }

    //     for (int j = 0; j < n; j++) {
    //         bobTotal += bobSizes[j];
    //     }

    //     Arrays.sort(aliceSizes);
    //     Arrays.sort(bobSizes);

    //     for (int l = 0; l < m; l++) {
    //         int numerator = bobTotal + 2 * aliceSizes[l] - aliceTotal;

    //         if (numerator % 2 != 0) {
    //             continue;
    //         }

    //         int target = numerator / 2;

    //         if (binarySearch(bobSizes, target)) {
    //             return new int[] { aliceSizes[l], target };
    //         }
    //     }

    //     return new int[0];
    // }

    // private boolean binarySearch(int[] arr, int target) {
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (target < arr[mid]) {
    //             end = mid - 1;
    //         } else if (target > arr[mid]) {
    //             start = mid + 1;
    //         } else {
    //             return true;
    //         }
    //     }

    //     return false;
    // }
}
