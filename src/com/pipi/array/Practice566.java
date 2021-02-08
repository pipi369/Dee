package com.pipi.array;

import java.util.Arrays;

public class Practice566 {

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(nums, 1, 4)));
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0) return nums;
        if (nums[0].length * nums.length != r * c) return nums;

        int[][] result = new int[r][c];

        int ni = 0, nj = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[ni][nj++] = nums[i][j];
                if (nj == c) {
                    ni++;
                    nj = 0;
                }
            }
        }

        return result;
    }

}
