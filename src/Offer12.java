public class Offer12 {

    public static boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, chars, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, char[] chars, int i, int j, int k) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] != chars[k]) {
            return false;
        }
        if (k == chars.length - 1) {
            return true;
        }
        board[i][j] = '\0';
        boolean res = dfs(board, chars, i + 1, j, k + 1) || dfs(board, chars, i - 1, j, k + 1) ||
                dfs(board, chars, i, j + 1, k + 1) || dfs(board, chars, i, j - 1, k + 1);
        board[i][j] = chars[k];
        return res;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };

        System.out.println(exist(board, "ABCCEC"));
    }

}
