package array;

public class LeetCode643 {

    /**
     * 解法：滑动窗口
     *    初始化窗口，每次操作需要做的处理：
     *    1、减去上一个窗口的值
     *    2、加上新进入窗口的值
     *    求出最大值后，除窗口大小
     *
     * @param nums
     * @param k
     * @return
     */
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0d;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
//        System.out.println(findMaxAverage(nums, 4));

        int[] nums = new int[]{5};
        System.out.println(findMaxAverage(nums, 1));
    }

}
