import java.util.ArrayList;

public class Search_list {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 4, 1, 7 };
        ArrayList<Integer> ans = search(arr, 0, 1, new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> search(int[] arr, int i, int target, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }

        if (arr[i] == target) {
            list.add(i);
        }

        return search(arr, i + 1, target, list);
    }
}
