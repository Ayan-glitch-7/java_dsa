/* LEETCODE (# 1573) */

public class Main_03 {
    // public int numWays(String s) {
    //     int[] count1 = new int[s.length()];
    //     int count = 0;
    //     int n = s.length();

    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i) == '1') {
    //             count1[i] = ++count;
    //         } else {
    //             count1[i] = count;
    //         }
    //     }

    //     if (count1[n - 1] % 3 != 0) {
    //         return 0;
    //     } else {
    //         if (count1[n - 1] == 0) {
    //             return (int) (((long) (n - 1) * (n - 2) / 2) % 1_000_000_007);
    //         } else {
    //             int part = count1[n - 1] / 3;
    //             int firstCut = 0;
    //             int secondCut = 0;

    //             for (int i = 0; i < n - 1; i++) {
    //                 if (count1[i] == part) {
    //                     firstCut++;
    //                 } else if (count1[i] == part * 2) {
    //                     secondCut++;
    //                 }
    //             }

    //             return (int) ((long) firstCut * secondCut % 1_000_000_007);
    //         }
    //     }
    // }
}
