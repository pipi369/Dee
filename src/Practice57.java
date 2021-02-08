public class Practice57 {


//    /**
//     * 动态规划
//     *
//     * @param nums
//     * @return
//     */
//    public static int maxSubArray(int[] nums) {
//        int max = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i - 1] > 0) {
//                nums[i] = nums[i] + nums[i - 1];
//            }
//            max = Math.max(max, nums[i]);
//        }
//        return max;
//    }

    /**
     * 贪心算法
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, -3, -1, -5};
        System.out.println(maxSubArray(nums));
    }

}
