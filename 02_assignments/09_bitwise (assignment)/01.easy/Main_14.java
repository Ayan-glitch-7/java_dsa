/* LEETCODE (# 1356) */

public class Main_14 {
    // public int[] sortByBits(int[] arr) {
    //     int n = arr.length;
    //     int[][] copy = new int[n][2];

    //     for (int i = 0; i < n; i++) {
    //         int num = arr[i];
    //         int count = 0;

    //         while (num > 0) {
    //             if ((num & 1) == 1) {
    //                 count++;
    //             }

    //             num = num >> 1;
    //         }

    //         copy[i][0] = arr[i];
    //         copy[i][1] = count;
    //     }

    //     Arrays.sort(copy, (a, b) -> {
    //         if (a[1] != b[1]) {
    //             return Integer.compare(a[1], b[1]);
    //         }

    //         return Integer.compare(a[0], b[0]);
    //     });

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = copy[i][0];
    //     }

    //     return arr;
    // }
}
