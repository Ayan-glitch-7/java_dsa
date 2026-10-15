/* LEETCODE (# 13) */

public class Main_23 {
    // public int romanToInt(String s) {
    //     int sum = 0;

    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         if (s.charAt(i) == 'I') {
    //             sum = sum + 1;
    //         }

    //         if (s.charAt(i) == 'V') {
    //             if (i > 0 && s.charAt(i - 1) == 'I') {
    //                 sum = sum + 4;
    //                 i = i - 1;
    //             } else {
    //                 sum = sum + 5;
    //             }
    //         }

    //         if (s.charAt(i) == 'X') {
    //             if (i > 0 && s.charAt(i - 1) == 'I') {
    //                 sum = sum + 9;
    //                 i = i - 1;
    //             } else {
    //                 sum = sum + 10;
    //             }
    //         }

    //         if (s.charAt(i) == 'L') {
    //             if (i > 0 && s.charAt(i - 1) == 'X') {
    //                 sum = sum + 40;
    //                 i = i - 1;
    //             } else {
    //                 sum = sum + 50;
    //             }
    //         }

    //         if (s.charAt(i) == 'C') {
    //             if (i > 0 && s.charAt(i - 1) == 'X') {
    //                 sum = sum + 90;
    //                 i = i - 1;
    //             } else {
    //                 sum = sum + 100;
    //             }
    //         }

    //         if (s.charAt(i) == 'D') {
    //             if (i > 0 && s.charAt(i - 1) == 'C') {
    //                 sum = sum + 400;
    //                 i = i - 1;
    //             } else {
    //                 sum = sum + 500;
    //             }
    //         }

    //         if (s.charAt(i) == 'M') {
    //             if (i > 0 && s.charAt(i - 1) == 'C') {
    //                 sum = sum + 900;
    //                 i = i - 1;
    //             } else {
    //                 sum = sum + 1000;
    //             }
    //         }
    //     }

    //     return sum;
    // }
}
