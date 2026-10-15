/* LEETCODE (# 65) */

public class Main_01 {
    // public boolean isNumber(String s) {
    //     char[] ch = s.toCharArray();

    //     boolean digit = false;
    //     boolean dot = false;
    //     boolean exp = false;

    //     for (int i = 0; i < ch.length; i++) {
    //         if (Character.isDigit(ch[i])) {
    //             digit = true;
    //         } else if (ch[i] == '+' || ch[i] == '-') {
    //             if (i > 0 && ch[i - 1] != 'e' && ch[i - 1] != 'E') {
    //                 return false;
    //             }
    //         } else if (ch[i] == '.') {
    //             if (dot || exp) {
    //                 return false;
    //             }
    //             dot = true;
    //         } else if (ch[i] == 'e' || ch[i] == 'E') {
    //             if (exp || !digit) {
    //                 return false;
    //             }
    //             exp = true;
    //             digit = false;
    //         } else {
    //             return false;
    //         }
    //     }

    //     return digit;
    // }
}
