package com.pipi;

import java.util.Objects;

public class Practice2 {

    /**
     *
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     */
    public static void main(String[] args) {
        ListNode num1 = new ListNode(2);
        ListNode num2 = new ListNode(2);
        ListNode result = addTwoNumbers(num1, num2);

        ListNode iterator = result;
        while (Objects.nonNull(iterator)) {
            System.out.println(iterator.val);
            iterator = iterator.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 定义返回链表
        ListNode result = new ListNode(0);
        // 定义数字1，数字2和结果的临时变量
        ListNode a = l1, b = l2, prev = result;
        // 定义是否进位
        boolean carry = false;
        while (a != null || b != null || carry) {
            // 如果为空，设置一下默认值
            int an = a != null ? a.val : 0;
            int bn = b != null ? b.val : 0;

            // 计算当前位两数之和
            int sum = (an + bn) + (carry ? 1 : 0);

            // 两数之和可能是两位，需要对10取余
            ListNode current = new ListNode(sum % 10);

            // 设置当前值
            prev.next = current;

            // 设置下一次循环的数据
            a = a != null ? a.next : null;
            b = b != null ? b.next : null;

            // 结果临时变量挪到下一位
            prev = current;
            // 记录下一次计算是否有进位
            carry = sum / 10 > 0;
        }
        return result.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
