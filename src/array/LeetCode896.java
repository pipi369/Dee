package array;

public class LeetCode896 {

    /**
     * 解法，一次变量，两个标志位
     *    初始化 asc 和 desc 两个变量都为 true
     *
     * @param A
     * @return
     */
    public static boolean isMonotonic(int[] A) {
        boolean asc = true, desc = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                asc = false;
            }
            if (A[i] < A[i + 1]) {
                desc = false;
            }
        }
        return asc || desc;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        nums = new int[]{1, 2, 2, 3};
        nums = new int[]{6, 5, 4, 4};
        nums = new int[]{1, 3, 2};
        nums = new int[]{1, 1, 1};
        nums = new int[]{1, 1, 0};
        System.out.println(isMonotonic(nums));
    }

}
