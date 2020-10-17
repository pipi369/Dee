package com.pipi.array;

public class Practice27 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
    }

    /**
     * 双指针，挪动不等于val的元素
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (val != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
