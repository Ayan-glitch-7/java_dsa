/* LEETCODE (# 2000) */

public class Main_22 {
    // public String reversePrefix(String word, char ch) {
    //     String ans = "";

    //     for (int i = 0; i < word.length(); i++) {
    //         if (word.charAt(i) == ch) {
    //             ans = reverse(word.substring(0, i + 1));

    //             int j = i + 1;

    //             while (j < word.length()) {
    //                 ans = ans + word.charAt(j);
    //                 j++;
    //             }

    //             return ans;
    //         }
    //     }

    //     return word;
    // }

    // public static String reverse(String str) {
    //     char[] arr = str.toCharArray();

    //     int start = 0;
    //     int end = arr.length - 1;

    //     while (start <= end) {
    //         char temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;

    //         start++;
    //         end--;
    //     }

    //     return new String(arr);
    // }
}
