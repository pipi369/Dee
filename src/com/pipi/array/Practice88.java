package com.pipi.array;

import java.util.Arrays;

public class Practice88 {

    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     * <p>
     *  
     * <p>
     * 说明：
     * <p>
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *  
     * <p>
     * 示例：
     * <p>
     * 输入：
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * <p>
     * 输出：[1,2,2,3,5,6]
     *  
     * <p>
     * 提示：
     * <p>
     * -10^9 <= nums1[i], nums2[i] <= 10^9
     * nums1.length == m + n
     * nums2.length == n
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 双指针
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 定义合并指针，nums1指针，nums2指针
        int indexMerge = m + n - 1, index1 = m - 1, index2 = n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) { // 如果数组1没值了，放数组2的元素
                nums1[indexMerge--] = nums2[index2--];
            } else if (index2 < 0) { // 如果数组2没值了，放数组1的元素
                nums1[indexMerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) { // 如果数组1的元素比数组2的元素大，放数组1的元素
                nums1[indexMerge--] = nums1[index1--];
            } else { // 如果数组2的元素比数组1的元素大，放数组2的元素
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }

}
