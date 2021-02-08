package com.pipi.linked;

import java.util.Objects;

public class Practice83 {

    /**
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 1->1->2
     * 输出: 1->2
     * 示例 2:
     * <p>
     * 输入: 1->1->2->3->3
     * 输出: 1->2->3
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-1);
        ListNode node11 = new ListNode(0);
        ListNode node12 = new ListNode(3);
        ListNode node13 = new ListNode(3);

        node1.next = node11;
        node11.next = node12;
        node12.next = node13;

        ListNode iterator = deleteDuplicates(node1);
        while (Objects.nonNull(iterator)) {
            System.out.println(iterator.val);
            iterator = iterator.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
//        ListNode result = new ListNode(Integer.MIN_VALUE);
//        ListNode iterator = result;
//        int num = result.val;
//        while (head != null) {
//            if (head.val != num) {
//                num = head.val;
//                iterator.next = head;
//                iterator = iterator.next;
//            } else {
//                iterator.next = null;
//            }
//            head = head.next;
//        }
//        return result.next;

        ListNode current = head;
        while (current != null && current.next != null)  {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
