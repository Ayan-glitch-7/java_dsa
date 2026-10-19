public class Smallest_letter {
    public static void main(String[] args) {

        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';

        char ans = search(letters, target);
        System.out.println(ans);
    }

    static char search(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start == letters.length) {
            return letters[0];
        }
        return letters[start];
    }
}