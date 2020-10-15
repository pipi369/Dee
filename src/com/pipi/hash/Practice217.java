package com.pipi.hash;

import java.util.Arrays;

public class Practice217 {

    /**
     * 给定一个整数数组，判断是否存在重复元素。
     * <p>
     * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
     * <p>
     *  
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,2,3,1]
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: [1,2,3,4]
     * 输出: false
     * 示例 3:
     * <p>
     * 输入: [1,1,1,3,3,4,3,2,4,2]
     * 输出: true
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/contains-duplicate
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

//    /**
//     * 解法一：通过HashSet，保证唯一，如果add失败则表示数字重复
//     * @param nums
//     * @return
//     */
//    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (!set.add(num)) return true;
//        }
//        return false;
//    }


    /**
     * 解法二：先排序，在检查数组相邻元素是否重复
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }


}
