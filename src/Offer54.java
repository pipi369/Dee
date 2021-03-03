public class Offer54 {

    private static TreeNode res;

    private static int ki;


    public static int kthLargest(TreeNode root, int k) {
        if (root == null) return -1;
        ki = k;
        dfs(root);
        return res.val;
    }

    private static void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (--ki >= 0) {
            res = root;
        }
        dfs(root.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(6);

        root.left = left;
        root.right = right;

        TreeNode left1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(4);

        left.left = left1;
        left.right = left2;

        TreeNode left11 = new TreeNode(1);

        left1.left = left11;

        System.out.println(kthLargest(root, 3));
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
