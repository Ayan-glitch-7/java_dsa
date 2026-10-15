/* LEETCODE (#1351) */

public class Main_11 {
    // public int countNegatives(int[][] grid) {
    //     int count = 0;

    //     for (int i = 0; i < grid.length; i++) {
    //         int start = 0;
    //         int end = grid[0].length - 1;
    //         int index = -1;

    //         while (start <= end) {
    //             int mid = start + (end - start) / 2;

    //             if (grid[i][mid] < 0) {
    //                 index = mid;
    //                 end = mid - 1;
    //             } else {
    //                 start = mid + 1;
    //             }
    //         }

    //         if (index != -1) {
    //             count += grid[0].length - index;
    //         }
    //     }

    //     return count;
    // }
}
