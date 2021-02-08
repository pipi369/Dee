package com.pipi.linked;

import java.util.ArrayList;
import java.util.List;

public class Practice234 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(isPalindrome(node1));

    }

    public static boolean isPalindrome(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode iterator = head;
        while (iterator != null) {
            list.add(iterator);
            iterator = iterator.next;
        }

        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {
            if (list.get(i).val != list.get(j).val) return false;
        }

        return true;
    }

}
