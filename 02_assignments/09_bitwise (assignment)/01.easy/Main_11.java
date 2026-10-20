/* LEETCODE (# 762) */

public class Main_11 {
    // public int countPrimeSetBits(int left, int right) {
    //     int countPrime = 0;

    //     for (int i = left; i <= right; i++) {
    //         int countBits = 0;
    //         int num = i;

    //         for (int j = 0; j < 32; j++) {
    //             if ((num & 1) == 1) {
    //                 countBits++;
    //             }

    //             num = num >>> 1;
    //         }

    //         boolean isPrime = true;

    //         if (countBits < 2) {
    //             isPrime = false;
    //         }

    //         for (int k = 2; k < countBits; k++) {
    //             if (countBits % k == 0) {
    //                 isPrime = false;
    //                 break;
    //             }
    //         }

    //         if (isPrime) {
    //             countPrime++;
    //         }
    //     }

    //     return countPrime;
    // }
}
