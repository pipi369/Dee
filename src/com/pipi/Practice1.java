package com.pipi;

import java.util.Arrays;
import java.util.HashMap;

public class Practice1 {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * <p>
     *  
     * <p>
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * <p>
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * 实现方案：Hash表
     * 算法复杂度 O(N)
     * 空间复杂度 O(N)
     */
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2]; // 定义返回结果
        // 记录补数Hash
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { // 循环
            int current = nums[i];
            // 如果补数Hash不为空，则计两数相加等于target
            if (map.containsKey(current)) {
                // 从补数Hash中获得当前值对应的补数
                results[0] = map.get(current);
                // 赋值当前值对应的下表
                results[1] = i;
                return results;
            }
            // 记录当前值需要的补数
            map.put(target - current, i);
        }
        return results;
    }

}
