package com.pipi;

import java.util.Arrays;
import java.util.Objects;

public class Practice1365 {

    /**
     * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
     * <p>
     * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
     * <p>
     * 以数组形式返回答案。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [8,1,2,2,3]
     * 输出：[4,0,1,1,3]
     * 解释：
     * 对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
     * 对于 nums[1]=1 不存在比它小的数字。
     * 对于 nums[2]=2 存在一个比它小的数字：（1）。
     * 对于 nums[3]=2 存在一个比它小的数字：（1）。
     * 对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
     * 示例 2：
     * <p>
     * 输入：nums = [6,5,4,8]
     * 输出：[2,1,0,3]
     * 示例 3：
     * <p>
     * 输入：nums = [7,7,7,7]
     * 输出：[0,0,0,0]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

//    /**
//     * 方案一：暴力
//     * @param nums
//     * @return
//     */
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                count += nums[j] < nums[i] ? 1 : 0;
//            }
//            result[i] = count;
//        }
//
//        return result;
//    }

//    /**
//     * 方案二：Hash表映射
//     * @param nums
//     * @return
//     */
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] result = new int[nums.length];
//
//        System.arraycopy(nums, 0, result, 0, nums.length);
//
//        Arrays.sort(nums);
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i])) {
//                map.put(nums[i], i);
//            }
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = map.get(result[i]);
//        }
//
//        return result;
//    }

    /**
     * 方案三：Hash数字个数映射
     *
     * @param nums
     * @return
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] nm = new int[101];

        for (int i = 0; i < nums.length; i++) {
            nm[nums[i]]++;
        }

        for (int i = 1; i < nm.length; i++) {
            nm[i] += nm[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] == 0 ? 0 : nm[nums[i] - 1];
        }

        return nums;
    }

}
