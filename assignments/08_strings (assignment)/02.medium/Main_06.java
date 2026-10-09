/* LEETCODE (# 556) */

public class Main_06 {
    // public int nextGreaterElement(int n) {
    //     char[] digits = String.valueOf(n).toCharArray();

    //     int i = digits.length - 2;

    //     while (i >= 0 && digits[i] >= digits[i + 1]) {
    //         i--;
    //     }

    //     if (i < 0) {
    //         return -1;
    //     }

    //     int j = digits.length - 1;

    //     while (j > i && digits[j] <= digits[i]) {
    //         j--;
    //     }

    //     swap(digits, i, j);
    //     Arrays.sort(digits, i + 1, digits.length);

    //     long ans = Long.parseLong(new String(digits));

    //     if (ans > Integer.MAX_VALUE) {
    //         return -1;
    //     }

    //     return (int) ans;
    // }

    // public static void swap(char[] arr, int i, int j) {
    //     char temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
}
