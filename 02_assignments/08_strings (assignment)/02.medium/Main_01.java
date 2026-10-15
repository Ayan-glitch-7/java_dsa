/* LEETCODE (# 1871) */

public class Main_01 {
    // public boolean canReach(String s, int minJump, int maxJump) {
    //     boolean[] visited = new boolean[s.length()];
    //     visited[0] = true;

    //     int count = 0;

    //     for (int i = 1; i < s.length(); i++) {

    //         if (i - minJump >= 0 && visited[i - minJump]) {
    //             count++;
    //         }

    //         if (i - maxJump - 1 >= 0
    //                 && visited[i - maxJump - 1]) {
    //             count--;
    //         }

    //         if (count > 0 && s.charAt(i) == '0') {
    //             visited[i] = true;
    //         }
    //     }

    //     return visited[s.length() - 1];
    // }
}
