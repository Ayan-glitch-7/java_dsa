/* LEETCODE (# 539) */

public class Main_16 {
    // public int findMinDifference(List<String> timePoints) {
    //     int[] time = new int[timePoints.size()];

    //     for (int i = 0; i < timePoints.size(); i++) {
    //         String s = timePoints.get(i);

    //         int hours = Integer.parseInt(s.substring(0, 2));
    //         int minutes = Integer.parseInt(s.substring(3, 5));

    //         time[i] = hours * 60 + minutes;
    //     }

    //     Arrays.sort(time);

    //     int ans = Integer.MAX_VALUE;

    //     for (int i = 1; i < time.length; i++) {
    //         int difference = time[i] - time[i - 1];
    //         ans = Math.min(ans, difference);
    //     }

    //     int difference = 1440 - time[time.length - 1] + time[0];
    //     ans = Math.min(ans, difference);

    //     return ans;
    // }
}
