public class Offer24 {

//    public static ListNode reverseList(ListNode head) {
//        ListNode newHead = new ListNode(-1);
//
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode tmp = curr;
//            curr = curr.next;
//            tmp.next = newHead.next;
//            newHead.next = tmp;
//        }
//
//        return newHead.next;
//    }

//    public static ListNode reverseList(ListNode head) {
//
//        ListNode prev = null, curr = head;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        return prev;
//    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return node;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode n = reverseList(node1);
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
