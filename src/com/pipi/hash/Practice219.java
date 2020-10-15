package com.pipi.hash;

import java.util.HashMap;
import java.util.Map;

public class Practice219 {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

//    /**
//     * 解法一：对比数据每个元素附近的k个元素，计算超时
//     * @param nums
//     * @param k
//     * @return
//     */
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i - k; j < i + k; j++) {
//                if (j < 0 || j > nums.length - 1 || j == i) continue;
//                if (nums[i] == nums[j] && Math.abs(i - j) <= k) return true;
//            }
//        }
//        return false;
//    }

    /**
     * 解法二：使用哈希表存储数字最后出现的位置，判断当前位置跟上次出现的位置是否小于k
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
