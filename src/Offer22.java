import java.util.Currency;

public class Offer22 {

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head, fast = head;

        while (fast != null) {
            fast = fast.next;
            if (k > 0) {
                k--;
            } else {
                slow = slow.next;
            }
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode n = getKthFromEnd(node1, 2);
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
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
