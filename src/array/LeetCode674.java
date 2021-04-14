package array;

public class LeetCode674 {

    /**
     * 解法：贪心
     *    循环数组，计数最长连续递增序列
     * @param nums
     * @return
     */
    public static int findLengthOfLCIS(int[] nums) {
//        int len = 0, maxLen = len;
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0 || nums[i] > nums[i - 1]) {
//                len += 1;
//            } else {
//                len = 1;
//            }
//            maxLen = Math.max(len, maxLen);
//        }
//        return maxLen;

        int start = 0, len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] <= nums[i - 1]) {
                start = i;
            }
            len = Math.max(len, i - start + 1);
        }
        return len;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 3, 5, 4, 7};
//        int[] nums = new int[]{2, 2, 2, 2, 2};
        int[] nums = new int[]{1, 3, 5, 4, 2, 3, 4, 5};
        System.out.println(findLengthOfLCIS(nums));
    }

}
