public class Practice35 {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length, mid;
        while (left <= right) {
            mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(nums, 2));
    }

}
