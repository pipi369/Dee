import java.util.Stack;

public class Offer06 {

    public static int[] reversePrint(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        int[] arrays = new int[stack.size()];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = stack.pop();
        }

        return arrays;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        head.next = node1;
        node1.next = node2;

        for (int i : reversePrint(head)) {
            System.out.println(i);
        }

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
