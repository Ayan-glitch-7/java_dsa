/* LEETCODE (# 43) */

public class Main_09 {
    // public String multiply(String num1, String num2) {
    //     if (num1.equals("0") || num2.equals("0")) {
    //         return "0";
    //     }

    //     int m = num1.length();
    //     int n = num2.length();
    //     int[] result = new int[m + n];

    //     for (int i = m - 1; i >= 0; i--) {
    //         for (int j = n - 1; j >= 0; j--) {
    //             int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

    //             int sum = mul + result[i + j + 1];

    //             result[i + j + 1] = sum % 10;
    //             result[i + j] = result[i + j] + sum / 10;
    //         }
    //     }

    //     StringBuilder ans = new StringBuilder();

    //     for (int i = 0; i < result.length; i++) {
    //         if (ans.length() == 0 && result[i] == 0) {
    //             continue;
    //         }

    //         ans.append(result[i]);
    //     }

    //     return ans.toString();
    // }
}
