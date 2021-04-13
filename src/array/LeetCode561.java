package array;

public class LeetCode561 {

    /**
     * 解法：快排
     *    快排后取双数下表元素累加在一起。
     *
     * @param nums
     * @param low
     * @param high
     */
    public static void quickSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivot = nums[high];
        int left = low, right = high - 1;

        while (left < right) {

            while (nums[left] <= pivot && left < right) {
                left++;
            }

            while (nums[right] >= pivot && left < right) {
                right--;
            }

            swap(nums, left, right);

        }

        if (nums[left] > nums[high]) {
            swap(nums, left, high);
        } else {
            left++;
        }

        quickSort(nums, low, left - 1);
        quickSort(nums, left + 1, high);

    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static int arrayPairSum(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(nums));
    }

}
