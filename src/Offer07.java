import java.util.HashMap;
import java.util.Map;

public class Offer07 {

    private static Map<Integer, Integer> inOrderDic = new HashMap<>();

    private static TreeNode recur(int[] preorder, int root, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootVal = preorder[root];

        TreeNode node = new TreeNode(rootVal);

        int rootIndex = inOrderDic.get(rootVal);

        node.left = recur(preorder, root + 1, left, rootIndex - 1);
        node.right = recur(preorder, root + 1 + rootIndex - left, rootIndex + 1, right);

        return node;
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        // 将中序遍历的值做个索引
        for (int i = 0; i < inorder.length; i++) {
            inOrderDic.put(inorder[i], i);
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
