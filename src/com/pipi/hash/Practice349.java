package com.pipi.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice349 {

    /**
     * 给定两个数组，编写一个函数来计算它们的交集。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出：[2]
     * 示例 2：
     * <p>
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[9,4]
     *  
     * <p>
     * 说明：
     * <p>
     * 输出结果中的每个元素一定是唯一的。
     * 我们可以不考虑输出结果的顺序。
     * <p>
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int value : nums1) {
            set.add(value);
        }

        Set<Integer> exists = new HashSet<>();
        for (int value : nums2) {
            if (set.contains(value))
                exists.add(value);
        }

        int[] result = new int[exists.size()];

        Iterator<Integer> iterator = exists.iterator();

        int index = 0;
        while (iterator.hasNext()) {
            result[index++] = iterator.next();
        }

        return result;

    }

}
