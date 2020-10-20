package com.pipi.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice448 {

    /**
     * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
     * <p>
     * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
     * <p>
     * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
     * <p>
     * 示例:
     * <p>
     * 输入:
     * [4,3,2,7,8,2,3,1]
     * <p>
     * 输出:
     * [5,6]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     * @return
     */
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(nums);
        result.forEach(System.out::println);
    }

//    /**
//     * 方案一：不适用额外空间，将数组下表元素数据乘-1，用来标记数字是否出现过
//     * @param nums
//     * @return
//     */
//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            int index = Math.abs(nums[i]) - 1;
//            if (nums[index] < 0) continue;
//            nums[index] *= -1;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                result.add(i + 1);
//            }
//        }
//        return result;
//    }

    /**
     * 方案二：使用hash表记录出现过的数字
     *
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], true);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.getOrDefault(i + 1, false)) {
                result.add(i + 1);
            }
        }
        return result;
    }


}
