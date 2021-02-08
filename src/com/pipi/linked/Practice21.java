package com.pipi.linked;

import java.util.Objects;

public class Practice21 {

    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
     * <p>
     *  
     * <p>
     * 示例：
     * <p>
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);

        node1.next = node11;
        node11.next = node12;

        ListNode node2 = new ListNode(1);
        ListNode node21 = new ListNode(3);
        ListNode node22 = new ListNode(4);

        node2.next = node21;
        node21.next = node22;

        ListNode iterator = mergeTwoLists(node1, node2);
        while (Objects.nonNull(iterator)) {
            System.out.println(iterator.val);
            iterator = iterator.next;
        }

    }

    /**
     * 迭代
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);

        ListNode iterator = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                iterator.next = l1;
                l1 = l1.next;
            } else {
                iterator.next = l2;
                l2 = l2.next;
            }
            iterator = iterator.next;
        }
        iterator.next = l1 == null ? l2 : l1;
        return head.next;
    }

}
