package com.pipi;

public class Practice4 {

    /**
     * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
     * <p>
     * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     * 示例 2：
     * <p>
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     * 示例 3：
     * <p>
     * 输入：nums1 = [0,0], nums2 = [0,0]
     * 输出：0.00000
     * 示例 4：
     * <p>
     * 输入：nums1 = [], nums2 = [1]
     * 输出：1.00000
     * 示例 5：
     * <p>
     * 输入：nums1 = [2], nums2 = []
     * 输出：2.00000
     *  
     * <p>
     * 提示：
     * <p>
     * nums1.length == m
     * nums2.length == n
     * 0 <= m <= 1000
     * 0 <= n <= 1000
     * 1 <= m + n <= 2000
     * -106 <= nums1[i], nums2[i] <= 106
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

//    /**
//     * 初始实现思路，用双指针将两个有序数组合并成一个有序数组，然后取中位数
//     *
//     * @param nums1
//     * @param nums2
//     * @return
//     */
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        // 初始化大的有序数组
//        int[] container = new int[nums1.length + nums2.length];
//        // 设置的数组下表指针
//        int indexMerge = nums1.length + nums2.length - 1;
//        // 本别设置两个指针，倒序
//        int index1 = nums1.length - 1, index2 = nums2.length - 1;
//        // 任意数组不为空，都要进行排序
//        while (index1 >= 0 || index2 >= 0) {
//            if (index1 < 0) { // 如果第一个数组为空，放2个数组元素
//                container[indexMerge--] = nums2[index2--];
//            } else if (index2 < 0) { // 如果第二个数组为空，放1个数组元素
//                container[indexMerge--] = nums1[index1--];
//            } else if (nums1[index1] > nums2[index2]) { // 如果第一个数组元素比第一个大，插入第一个数组元素
//                container[indexMerge--] = nums1[index1--];
//            } else { // 否则，插入第一个数组元素
//                container[indexMerge--] = nums2[index2--];
//            }
//        }
//
//
//        if (container.length % 2 == 0) {
//            int left = container.length / 2 - 1;
//            int sum = container[left] + container[left + 1];
//            return sum / 2.0;
//        } else {
//            return container[container.length / 2];
//        }
//    }

    /**
     * TODO 官方解决方案，还未理解
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 将最短的数据放到前面处理
        if (nums2.length > nums1.length) {
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }

        int m = nums1.length;
        int n = nums2.length;

        // 分割线左边的所有元素需要满足的个数 m + (n - m + 1) / 2;
        int totalLeft = (m + n + 1) / 2;

        // 在 nums1 的区间 [0, m] 里查找恰当的分割线，
        // 使得 nums1[i - 1] <= nums2[j] && nums2[j - 1] <= nums1[i]
        int left = 0;
        int right = m;

        while (left < right) {
            int i = left + (right - left + 1) / 2;
            int j = totalLeft - i;
            if (nums1[i - 1] > nums2[j]) {
                // 下一轮搜索的区间 [left, i - 1]
                right = i - 1;
            } else {
                // 下一轮搜索的区间 [i, right]
                left = i;
            }
        }

        int i = left;
        int j = totalLeft - i;
        int nums1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int nums1RightMin = i == m ? Integer.MAX_VALUE : nums1[i];
        int nums2LeftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int nums2RightMin = j == n ? Integer.MAX_VALUE : nums2[j];


        if (((m + n) % 2) == 1) {
            return Math.max(nums1LeftMax, nums2LeftMax);
        } else {
            return (double) ((Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin))) / 2;
        }

    }

}
