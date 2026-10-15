/* LEETCODE (# 227) */

public class Main_10 {
    // public int calculate(String s) {
    //     int result = 0;
    //     int num = 0;
    //     int lastNum = 0;
    //     int sign = '+';

    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);

    //         if (Character.isDigit(ch)) {
    //             num = num * 10 + (ch - '0');
    //         }

    //         if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
    //             if (sign == '+') {
    //                 result = result + lastNum;
    //                 lastNum = num;
    //             } else if (sign == '-') {
    //                 result = result + lastNum;
    //                 lastNum = -num;
    //             } else if (sign == '*') {
    //                 lastNum = lastNum * num;
    //             } else if (sign == '/') {
    //                 lastNum = lastNum / num;
    //             }

    //             sign = ch;
    //             num = 0;
    //         }
    //     }

    //     int ans = result + lastNum;
    //     return ans;
    // }
}
