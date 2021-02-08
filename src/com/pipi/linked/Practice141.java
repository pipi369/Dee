package com.pipi.linked;

public class Practice141 {

    /**
     * 给定一个链表，判断链表中是否有环。
     * <p>
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
     * <p>
     * 如果链表中存在环，则返回 true 。 否则，返回 false 。
     * <p>
     *  
     * <p>
     * 进阶：
     * <p>
     * 你能用 O(1)（即，常量）内存解决此问题吗？
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * <p>
     * <p>
     * 输入：head = [3,2,0,-4], pos = 1
     * 输出：true
     * 解释：链表中有一个环，其尾部连接到第二个节点。
     * 示例 2：
     * <p>
     * <p>
     * <p>
     * 输入：head = [1,2], pos = 0
     * 输出：true
     * 解释：链表中有一个环，其尾部连接到第一个节点。
     * 示例 3：
     * <p>
     * <p>
     * <p>
     * 输入：head = [1], pos = -1
     * 输出：false
     * 解释：链表中没有环。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/linked-list-cycle
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(0);
        ListNode node13 = new ListNode(-4);

        node1.next = node11;
        node12.next = node13;
        node13.next = node1;

        System.out.println(hasCycle(node1));
    }

    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        // 判断链表是否有两个以上的元素
        if (head == null || head.next == null) return false;

        // 定义快慢指针
        ListNode slow = head;
        ListNode fast = head.next;

        // 如果快指针追上了慢指针说明有环
        while (slow != fast) {

            // 判断快指针是否能跑两个元素，如果快指针跑完了所有的元素，则表示没有环
            if (fast == null || fast.next == null) {
                return false;
            }

            // 慢指针跑一个元素
            slow = slow.next;
            // 快指针跑两个元素
            fast = fast.next.next;

        }

        return true;
    }

}
