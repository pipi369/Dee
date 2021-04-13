package array;

public class LeetCode628 {

    /**
     *
     * 解法一：使用排序
     *    通过排序取最大的3个。
     *
     * 解法二：并查集
     *    可能构成数组的情况：
     *    1、全小于0  [-4, -3, -2, -1] = -3 * -2 * -1
     *    2、有大有小 [-3, -1, 1, 2] = -3 * -1 * 2
     *    3、全大于0  [1, 2, 3, 4] = 2 * 3 * 4
     *
     *    全大于0或全小于0的组合取最大的3个就可以了。
     *    有大有小时，需要考虑负负得正的情况，最小的两个 * 最大的一个 > 最大的三个相乘
     *
     *    时间复杂度O(n)
     *    空间复杂度O(1)
     *
     * @param nums
     * @return
     */
    public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        return Math.max(min2 * min1 * max1, max3 * max2 * max1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-100, -98, -1, 2, 3, 4};
//        int[] nums = new int[]{1, 2, 3};
        System.out.println(maximumProduct(nums));
    }

}
