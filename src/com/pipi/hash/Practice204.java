package com.pipi.hash;

public class Practice204 {

    /**
     * 统计所有小于非负整数 n 的质数的数量。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：n = 10
     * 输出：4
     * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
     * 示例 2：
     * <p>
     * 输入：n = 0
     * 输出：0
     * 示例 3：
     * <p>
     * 输入：n = 1
     * 输出：0
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/count-primes
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        int result = 0;
        // 初始化数组，标记所有的数字都是素数
        boolean[] primes = new boolean[n];

        // 如果大于 2 则一定拥有 2 这个质数，偶数只有2是质数
        if (2 < n) result++;

        // 从 3 开始遍历，且只遍历奇数
        for (int i = 3; i < n; i += 2) {
            // 是质数
            if (!primes[i]) {
                for (int j = 3; i * j < n; j += 2) {
                    // 将当前质数的奇数倍都设置成非质数标记 true
                    primes[i * j] = true;
                }
                // 质数个数 +1
                result++;
            }
        }
        return result;
    }

}
