package array;

public class LeetCode605 {

    /**
     * 解法：贪心
     *    顺着数组左边开始种花即可，需要考虑左边界和有边界问题。
     *    最左边不需要考虑 i - 1 = 0, 最右边不需要考虑 i + 1 = 0, 中间的花正常种, 需要判断两边是不是 0.
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ans = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0)
                        && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    ans = ans + 1;
                }
            }
        }
        return ans >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }

}
