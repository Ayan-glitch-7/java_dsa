/* LEETCODE (# 885) */

public class Main_03 {
    // public int[][] spiralMatrixIII(
    //         int rows,
    //         int cols,
    //         int rStart,
    //         int cStart) {
    //     int[][] ans = new int[rows * cols][2];

    //     int r = rStart;
    //     int c = cStart;
    //     int step = 1;
    //     int i = 0;

    //     ans[i++] = new int[] { r, c };

    //     while (i < rows * cols) {
    //         // Move right
    //         for (int j = 0; j < step; j++) {
    //             c++;

    //             if (r >= 0 && r < rows && c >= 0 && c < cols) {
    //                 ans[i++] = new int[] { r, c };
    //             }
    //         }

    //         // Move down
    //         for (int k = 0; k < step; k++) {
    //             r++;

    //             if (r >= 0 && r < rows && c >= 0 && c < cols) {
    //                 ans[i++] = new int[] { r, c };
    //             }
    //         }

    //         step++;

    //         // Move left
    //         for (int l = 0; l < step; l++) {
    //             c--;

    //             if (r >= 0 && r < rows && c >= 0 && c < cols) {
    //                 ans[i++] = new int[] { r, c };
    //             }
    //         }

    //         // Move up
    //         for (int m = 0; m < step; m++) {
    //             r--;

    //             if (r >= 0 && r < rows && c >= 0 && c < cols) {
    //                 ans[i++] = new int[] { r, c };
    //             }
    //         }

    //         step++;
    //     }

    //     return ans;
    // }
}