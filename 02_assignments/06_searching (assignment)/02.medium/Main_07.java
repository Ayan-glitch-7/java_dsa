/* LEETCODE (#436) */

public class Main_07 {
    // public int[] findRightInterval(int[][] intervals) {
        
    //     int n = intervals.length;
    //     int[] ans = new int[n];
    //     int[][] store = new int[n][2];

    //     for(int i = 0; i < n; i++) {
    //         store[i][0] = intervals[i][0];
    //         store[i][1] = i;
    //     } 

    //     Arrays.sort(store, (a, b) -> Integer.compare(a[0], b[0]));

    //     for(int j = 0; j < n; j++) {
    //         int last = intervals[j][1];

    //         int start = 0;
    //         int end = n - 1;
    //         int index = -1;

    //         while(start <= end) {
    //             int mid = start + (end - start) / 2;

    //             if(store[mid][0] >= last) {
    //                 index = store[mid][1];
    //                 end = mid - 1;
    //             }
    //             else {
    //              start = mid + 1;
    //             }
    //             ans[j] = index;
    //         }
    //     } 
    //     return ans;
    // }
}