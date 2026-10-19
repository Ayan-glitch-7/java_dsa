public class First_and_last_position {
    public static void main(String[] args) {

        int[] nums = { 5, 7, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;

        System.out.println(searchRange(nums, target));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findStartIndex) {
                    end = end - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}