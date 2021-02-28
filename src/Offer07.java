import java.util.HashMap;
import java.util.Map;

public class Offer07 {

    private static Map<Integer, Integer> indexMap = new HashMap<>();

    private static TreeNode recur(int[] preorder, int root, int left, int right) {
        // 递归结果
        if (left > right) {
            return null;
        }

        // 根节点的值
        int rootVal = preorder[root];

        // 构建根节点
        TreeNode node = new TreeNode(rootVal);

        // 划分左子树和右子树
        int rootIndex = indexMap.get(rootVal);

        // 左子树递归
        node.left = recur(preorder, root + 1, left, rootIndex - 1);

        // 右子树递归
        node.right = recur(preorder, root + rootIndex - left + 1, rootIndex + 1, right);
        return node;
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        // 将中序遍历的值做个索引
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return recur(preorder, 0, 0, inorder.length - 1);
    }

    private static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode root = buildTree(preorder, inorder);

        preOrder(root);
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
