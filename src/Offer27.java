import java.util.Stack;

public class Offer27 {

//    public static TreeNode mirrorTree(TreeNode root) {
//        if (root == null) return null;
//
//        Stack<TreeNode> stack = new Stack<>();
//        stack.add(root);
//
//        while (!stack.isEmpty()) {
//
//            TreeNode node = stack.pop();
//
//            if (node != null) {
//                TreeNode tmp = node.left;
//                node.left = node.right;
//                node.right = tmp;
//
//                stack.add(node.left);
//                stack.add(node.right);
//            }
//        }
//
//        return root;
//    }

    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(7);
        root.left = left;
        root.right = right;

        TreeNode left1 = new TreeNode(1);
        TreeNode left2 = new TreeNode(3);
        left.left = left1;
        left.right = left2;

        TreeNode right1 = new TreeNode(6);
        TreeNode right2 = new TreeNode(9);
        right.left = right1;
        right.right = right2;

        TreeNode res = mirrorTree(root);
        preOrder(res);


    }

    private static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
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
