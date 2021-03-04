public class Offer29 {

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int total = matrix.length * matrix[0].length;
        int[] res = new int[total];
        int[][] direction = new int[][]{
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0},
        };
        int i = 0, j = 0, di = 0;
        for (int g = 0; g < total; g++) {
            res[g] = matrix[i][j];
            visited[i][j] = true;

            int ni = i + direction[di][0], nj = j + direction[di][1];

            if (ni < 0 || ni > matrix.length - 1 || nj < 0 || nj > matrix[0].length - 1 || visited[ni][nj]) {
                di = (di + 1) % 4;
            }

            i += direction[di][0];
            j += direction[di][1];

        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        int[] res = spiralOrder(matrix);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

}
