public class Offer04 {
    /**
     * 解题思路，源数据是一个从左到右递增，从上到下递增的图。
     * <p>
     * 从左上角出发，往右走变大，往下走都大，不能走
     * 从右上角出发，往左走变小，往下走是大，可走
     * 从左下角出发，往上走变小，往右走是大，可走
     * 从右下角出发，往上走变下，往左走变下，不可走
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

            int row = matrix.length - 1, column = 0;
            while (row >= 0 && column <= matrix[0].length - 1) {

                if (matrix[row][column] == target) {
                    return true;
                }

                if (matrix[row][column] > target) {
                    row--;
                } else {
                    column++;
                }

            }

            return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
//        int[][] matrix = new int[][]{
//                {-5}
//        };
        System.out.println(findNumberIn2DArray(matrix, 5));
    }

}
