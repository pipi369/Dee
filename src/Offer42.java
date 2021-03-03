public class Offer42 {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1};
        System.out.println(maxSubArray(nums));
    }

}
