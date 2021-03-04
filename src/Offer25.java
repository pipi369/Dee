public class Offer25 {

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);

        ListNode curr = head;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                curr.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                curr.next = l1;
                l1 = l1.next;
            } else if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l111 = new ListNode(3);
        l1.next = l11;
        l11.next = l111;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l222 = new ListNode(4);
        l2.next = l22;
        l22.next = l222;

        ListNode curr = mergeTwoLists(l1, l2);
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
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
